package com.redabensaad.nbadraft_scraper.model;

public record Player(
        String name,
        String teamId,
        int age,
        Contract contract,
        PlayerStats stats,
        String headShotPath
) {}