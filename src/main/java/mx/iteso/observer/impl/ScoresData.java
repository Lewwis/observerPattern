package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

public class ScoresData implements Subject {
    private ArrayList<Observer> observers;
    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;
    
    private int number;
    private String name;
    private String position;
    private String team;


    public ScoresData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals, this.number, this.name, this.position, this.team);
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void setScore( String homeTeam, String awayTeam, int homeGoals, int awayGoals, int number, String name, String position, String team){
        this.homeTeam = homeTeam;
        this.awayTeam =  awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        
        this.number = number;
        this.name = name;
        this.position = position;
        this.team = team;
        newScore();
    }
}
