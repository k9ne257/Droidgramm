package com.example.droidgram.models;

import android.graphics.Color;

public class Skill {
    private String name;
    private String rank;
    private String cardColor;
    //TODO add Rank and skill icon

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Skill(String name, String rank, String cardColor) {
        this.name = name;
        this.rank = rank;
        this.cardColor = cardColor;
    }

    public Skill addSkill(String name, String rank, String color){
        return new Skill(name, rank, color);
    }
}
