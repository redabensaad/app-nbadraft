package com.redabensaad.nbadraft_api.repository;

import com.redabensaad.nbadraft_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
    Optional<Player> findByHeadShotPath(String headShotPath);
    List<Player> findByTeamId(String teamId);
}
