package edu.umb.cs680.hw12;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getyear()- o1.getyear();
    }
}
