package edu.umb.cs680.hw11;

import java.util.List;

public class Manhattan implements DistanceMetric{



    @Override
    public double distance(List<Double> p1, List<Double> p2) {
        double distance= 0.0;

        for (int j = p1.size()-1;  j > 0; j--){
            distance = distance + Math.abs(p1.get(j) - p2.get(j));
        }
        return distance;
    }
}
