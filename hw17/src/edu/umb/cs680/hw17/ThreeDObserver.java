package edu.umb.cs680.hw17;

public class ThreeDObserver implements Observer{
    @Override
    public void update(Observable sender, Object event) {
        System.out.println("3D Observer");
    }
}
