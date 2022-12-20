package edu.umb.cs680.hw12;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MileageComparatorTest {
    @Test
    public void Mileage() {
        Car car1 = new Car("Toyota", "RAV4", 2018, 3, 3);
        Car car2 = new Car("Ford", "Mustang", 2022, 11, 15);
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        Collections.sort(cars, new MIleageComparator());
        assertEquals(car1, cars.get(1));
        assertEquals(car2, cars.get(0));
    }
}