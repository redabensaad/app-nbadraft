package com.redabensaad.nbadraft_scraper.model;
public record Contract(
        long capHit,
        int seasonRemaining,
        long nextSeasonEarning,
        Option option
){}