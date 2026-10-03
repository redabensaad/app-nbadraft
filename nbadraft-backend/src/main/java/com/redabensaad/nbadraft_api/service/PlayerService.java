package com.redabensaad.nbadraft_api.service;

import com.redabensaad.nbadraft_api.model.Player;
import com.redabensaad.nbadraft_api.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public List<Player> getPlayersByTeamCode(String teamId){
        return playerRepository.findByTeamId(teamId);
    }

    public List<Long> getPlayersIdByTeamCode(String teamId){
        List<Player> players = playerRepository.findByTeamId(teamId);
        return players.stream().map(Player::getId).toList();
    }


    @Transactional
    public void importOrUpdatePlayers(List<Player> players) {
        for (Player player : players) {
            playerRepository.findByHeadShotPath(player.getHeadShotPath())
                    .ifPresentOrElse(
                            existingPlayer -> {
                                existingPlayer.updateFrom(player);
                                playerRepository.save(existingPlayer);
                            },
                            () -> playerRepository.save(player)
                    );
        }
    }
}
