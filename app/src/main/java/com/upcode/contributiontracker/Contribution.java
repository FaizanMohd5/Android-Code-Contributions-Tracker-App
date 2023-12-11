package com.upcode.contributiontracker;

public class Contribution {
    private String title;
    private String platform;
    private int numberOfContributions;
    private String description;

    public Contribution(String title, String platform, int numberOfContributions, String description) {
        this.title = title;
        this.platform = platform;
        this.numberOfContributions = numberOfContributions;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getNumberOfContributions() {
        return numberOfContributions;
    }

    public void setNumberOfContributions(int numberOfContributions) {
        this.numberOfContributions = numberOfContributions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
