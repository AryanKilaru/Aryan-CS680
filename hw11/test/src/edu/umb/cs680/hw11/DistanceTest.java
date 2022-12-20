package edu.umb.cs680.hw11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    public void Manhattan(){
        List<Double> pt1 = new LinkedList<Double>();
        pt1.add(10.00);
        pt1.add(11.00);
        pt1.add(12.00);

        List<Double> pt2 = new LinkedList<Double>();
        pt2.add(13.00);
        pt2.add(69.00);
        pt2.add(108.00);

        List<Double> pt3 = new LinkedList<Double>();
        pt3.add(7.00);
        pt3.add(121.00);
        pt3.add(54.00);

        List<Double> pt4 = new LinkedList<Double>();
        pt4.add(21.00);
        pt4.add(99.00);
        pt4.add(101.00);

        List<Double> pt5 = new LinkedList<Double>();
        pt5.add(79.00);
        pt5.add(14.00);
        pt5.add(69.00);

        List<List<Double>> pt = new LinkedList<>();
        pt.add(pt1);
        pt.add(pt2);
        pt.add(pt3);
        pt.add(pt4);
        pt.add(pt5);

        List<List<Double>> actual = Distance.matrix(pt, new Manhattan());
        List<List<Double>> expected = new ArrayList<>();
        Double[] array1 = {0.0, 154.0, 152.0, 177.0, 60.0};
        Double[] array2 = {154.0, 0.0, 106.0, 37.0, 94.0};
        Double[] array3 = {152.0, 106.0, 0.0, 69.0, 122.0};
        Double[] array4 = {177.0, 37.0, 69.0, 0.0, 117.0};
        Double[] array5 = {60.0, 94.0, 122.0, 117.0, 0.0};

        expected.add(Arrays.stream(array1).toList());
        expected.add(Arrays.stream(array2).toList());
        expected.add(Arrays.stream(array3).toList());
        expected.add(Arrays.stream(array4).toList());
        expected.add(Arrays.stream(array5).toList());

        for (int j = 0; j<expected.size(); j++){
            assertArrayEquals(expected.toArray(), actual.toArray());
        }

    }

    @Test
    public void Euclidean(){
        List<Double> pt1 = new LinkedList<Double>();
        pt1.add(10.00);
        pt1.add(11.00);
        pt1.add(12.00);

        List<Double> pt2 = new LinkedList<Double>();
        pt2.add(13.00);
        pt2.add(69.00);
        pt2.add(108.00);

        List<Double> pt3 = new LinkedList<Double>();
        pt3.add(7.00);
        pt3.add(121.00);
        pt3.add(54.00);

        List<Double> pt4 = new LinkedList<Double>();
        pt4.add(21.00);
        pt4.add(99.00);
        pt4.add(101.00);

        List<Double> pt5 = new LinkedList<Double>();
        pt5.add(79.00);
        pt5.add(14.00);
        pt5.add(69.00);

        List<List<Double>> pt = new LinkedList<>();
        pt.add(pt1);
        pt.add(pt2);
        pt.add(pt3);
        pt.add(pt4);
        pt.add(pt5);

        List<List<Double>> actual = Distance.matrix(pt);
        List<List<Double>> expected = new ArrayList<>();
        Double[] array1 = {0.0, 112.2007130102122, 117.78370006074695, 125.64234954823155, 89.5488693395958};
        Double[] array2 = {112.2007130102122, 0.0, 75.20638270785267, 31.827660925679098, 94.35041070392857};
        Double[] array3 = {117.78370006074695, 75.20638270785267, 0.0, 53.749418601506754, 129.83836104942176};
        Double[] array4 = {125.64234954823155, 31.827660925679098, 53.749418601506754, 0.0, 107.76363022838457};
        Double[] array5 = {89.5488693395958, 94.35041070392857, 129.83836104942176, 107.76363022838457, 0.0};

        expected.add(Arrays.stream(array1).toList());
        expected.add(Arrays.stream(array2).toList());
        expected.add(Arrays.stream(array3).toList());
        expected.add(Arrays.stream(array4).toList());
        expected.add(Arrays.stream(array5).toList());

        for (int j = 0; j<expected.size(); j++){
            assertArrayEquals(expected.toArray(), actual.toArray());
        }

    }
}