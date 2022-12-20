package edu.umb.cs680.hw12;

import java.util.Comparator;


public class PriceComparator  implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o2.getprice()- o1.getprice());
    }
}
