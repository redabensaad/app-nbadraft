package com.redabensaad.nbadraft_scraper.model;

public record PlayerStats(
    double points,
    double rebound,
    double assists,
    int gamePlayed,
    String position
){}
