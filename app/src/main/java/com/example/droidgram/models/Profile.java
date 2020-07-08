package com.example.droidgram.models;

import java.util.List;

public class Profile {
    List<Skill> skills;
    List<Project> Projects;
    User user;

    private Profile(User user) {
        this.user = user;
    }

    public Profile addProfile(User user){
        return new Profile(user);
    }

    public List<Skill> getSkills() {
        return this.user.getSkills();
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Project> getProjects() {
        return this.user.getProjects();
    }

    public void setProjects(List<Project> projects) {
        Projects = projects;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
