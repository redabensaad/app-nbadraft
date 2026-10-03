package com.redabensaad.nbadraft_scraper.exception;

public class ScraperException extends RuntimeException {
    private final String teamCode;

    public ScraperException(String message, String teamCode, Throwable cause) {
        super(message, cause);
        this.teamCode = teamCode;
    }

    public String getTeamCode() { return teamCode; }
}