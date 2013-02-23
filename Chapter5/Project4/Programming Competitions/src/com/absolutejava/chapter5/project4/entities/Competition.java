/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project4.entities;


/**
 *
 * @author Kashif Ahmed Khan
 */
public class Competition {
    private String competitionName;
    private String winingTeamName;
    private String runnerUpTeamName;
    private int competitionYear;
    
    public Competition(){        
    }

    public Competition(String competitionName) {
        this.competitionName = competitionName;
    }
    
    public Competition(String competitionName, String winingTeamName, String runnerUpTeamName, int competitionYear){
        this.competitionName = competitionName;
        this.winingTeamName = winingTeamName;
        this.runnerUpTeamName = runnerUpTeamName;
        this.competitionYear = competitionYear;
    }
    
    public Competition(Competition other) {
        this.competitionName = other.competitionName;
        this.winingTeamName = other.winingTeamName;
        this.runnerUpTeamName = other.runnerUpTeamName;
        this.competitionYear = other.competitionYear;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public void setWiningTeamName(String winningTeamName) {
        this.winingTeamName = winningTeamName;
    }

    public String getWiningTeamName() {
        return winingTeamName;
    }

    public void setRunnerUpTeamName(String runnerUpTeamName) {
        this.runnerUpTeamName= runnerUpTeamName;
    }

    public String getRunnerUpTeamName() {
        return runnerUpTeamName;
    }
    
    void setYear(int competitionYear) {
        this.competitionYear = competitionYear;
    }

    public int getYear() {
        return competitionYear;
    }

    public String getCompetitionInformation() {
        return toString();
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Competition Name: ").append(getCompetitionName()).append("\n");
        builder.append("Wining Team: ").append(getWiningTeamName()).append("\n");
        builder.append("Runner-up Team: ").append(getRunnerUpTeamName()).append("\n");
        builder.append("Year: ").append(getYear());
        return builder.toString();
    }
}
