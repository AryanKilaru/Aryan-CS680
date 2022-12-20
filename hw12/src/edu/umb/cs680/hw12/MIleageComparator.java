package edu.umb.cs680.hw12;

import java.util.Comparator;

public class MIleageComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getmileage()- o1.getmileage();
    }
}
