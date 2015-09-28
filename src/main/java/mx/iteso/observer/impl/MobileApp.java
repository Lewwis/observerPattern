package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

public class MobileApp implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    
    private int number;
    private String name;
    private String position;
    private String team;
    
    public MobileApp(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }
    
    public void display() {
        System.out.println("Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);
        System.out.println("Scored by " + name + "(" + number + ") " + position + " from " + team);
    }

    public void update(String home, String away, int homeGoals, int awayGoals, int number, String name, String position, String team) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        
        this.number = number;
        this.name = name;
        this.position = position;
        this.team = team;
        display();
    }
    
    public void unsubscribe() {
    	scoresData.removeObserver(this);
    }

}
