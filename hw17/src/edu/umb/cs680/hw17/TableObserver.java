package edu.umb.cs680.hw17;

public class TableObserver implements Observer{
    @Override
    public void update(Observable sender, Object event) {
        System.out.println("Table Observer");
    }
}
