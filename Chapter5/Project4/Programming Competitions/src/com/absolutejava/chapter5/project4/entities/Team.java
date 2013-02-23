/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project4.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Team {
    
    private String teamName;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private Competition competition1;
    private Competition competition2;

    public Team() {        
    }
    
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    public Team(String teamName, String name1, String name2, String name3, String name4){
        this.teamName = teamName;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }
    
    public Team(Team other) {
        this.teamName = other.teamName;
        this.name1 = other.name1;
        this.name2 = other.name2;
        this.name3 = other.name3;
        this.name4 = other.name4;
        this.competition1 = new Competition(other.competition1);
        this.competition2 = new Competition(other.competition2);
    }
    
    void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    String getTeamName() {
        return teamName;
    }

    void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
    
    public String getName2() {
        return name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName3() {
        return name3;
    }
    
    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName4() {
        return name4;
    }

    public void setCompetition1(Competition competition1) {
        this.competition1 = competition1;
    }

    void setCompetition2(Competition competition2) {
        this.competition2 = competition2;
    }

    public Competition getCompetition1() {
        return competition1;
    }

    public Competition getCompetition2() {
        return competition2;
    }
    
    public String getTeamInformation() {
        return toString();
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Team Name: ").append(getTeamName()).append("\n");
        builder.append("Team Member1: ").append(getName1()).append("\n");
        builder.append("Team Member2: ").append(getName2()).append("\n");
        builder.append("Team Member3: ").append(getName3()).append("\n");
        builder.append("Team Member4: ").append(getName4()).append("\n");
        builder.append("Competition1: ").append(getCompetition1()).append("\n");
        builder.append("Competition2: ").append(getCompetition2());
        return builder.toString();
    }
    
}