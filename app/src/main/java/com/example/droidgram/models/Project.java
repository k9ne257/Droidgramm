package com.example.droidgram.models;

public class Project {
    private String name;
    private String githubLink;
    private String website;
    private int views;
    private int likes;
    //TODO add project icon

    private Project(String name) {
        this.name = name;
        this.githubLink = "";
        this.website = "";
        this.views = 0;
        this.likes = 0;
    }

    public Project addProject(String name){
        return new Project(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
