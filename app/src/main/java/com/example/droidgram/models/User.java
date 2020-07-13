package com.example.droidgram.models;

import java.util.List;

public class User {
    private String username;
    private int followers;
    private int numberOfProjects;
    private int following;
    private String Location;
    private List<Skill> skills;
    private List<Project> projects;
    //TODO profile picture

    /**
     * Add a user with skills and projects
     * */
    private User(String username, int followers, int numberOfProjects, int following, String location, List<Skill> skills, List<Project> projects) {
        this.followers = followers;
        this.numberOfProjects = numberOfProjects;
        this.following = following;
        this.username = username;
        Location = location;
        this.skills = skills;
        this.projects = projects;
    }

    /**
    * Add a user without skills and projects
    * */
    private User(String username, int followers, int numberOfProjects, int following, String location) {
        this.followers = followers;
        this.numberOfProjects = numberOfProjects;
        this.following = following;
        this.username = username;
        Location = location;
    }

    /**
     * Add new user trough this method
     * */
    private User(String username) {
        this.followers = 0;
        this.numberOfProjects = 0;
        this.following = 0;
        this.username = username;
        Location = "";
    }

    /**
     * Add new user trough this method
     * */
    public User addUser(String username){
        return new User(username);
    }

    public User addUser(int followers, int numberOfProjects, int following, String username, String location, List<Skill> skills, List<Project> projects) {
        return new User(username, followers, numberOfProjects, following, location, skills, projects);
    }

    /**
     * Add user withoug any other info
     * */

    //TODO Write tests for the following methods

    /**
     * This adds a single project to user
     * */
    public void addProjectToUser(Project project){
        this.projects.add(project);
    }

    /***
     * This adds a multiple skills to user
     * */
    public void addProjectToUser(List<Project> projects){
        for(int i = 0; i < projects.size(); i++){
            this.projects.add(projects.get(i));
        }
    }

    /**
     * This adds a single skill to user
     * */
    public void addSkillToUser(Skill skill){
        this.skills.add(skill);
    }

    /***
     * This adds a multiple skills to user
     * */
    public void addSkillsToUser(List<Skill> skills){
        //TODO add a list of skills
        for(int i = 0; i < skills.size(); i++){
            this.skills.add(skills.get(i));
        }
    }

    /**
     * This removes a skill from the user
     * */
    public void removeSkillFromUser(Skill skill){
        this.skills.remove(skill);
    }

    public int getFollowers() {
        return followers;
    }

    public void addFollowers(){
        this.followers++;
    }

    public void loseFollowers(){
        this.followers--;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
