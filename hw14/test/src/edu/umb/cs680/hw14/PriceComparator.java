package edu.umb.cs680.hw14;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PriceComparator {
    Car car1 = new Car("Toyota", "RAV4", 2018, 3, 3);
    Car car2 = new Car("Ford", "Mustang", 2022, 11, 15);

    LinkedList<Car> l = new LinkedList<Car>();

    @Test
    public void PriceComparatorTest() {
        l.add(car1);
        l.add(car2);
        Collections.sort(l, (Car car1, Car car2) -> (int) (car2.getprice() - car1.getprice()));
        assertEquals(car1, l.get(1));
        assertEquals(car2, l.get(0));
    }

}