package edu.umb.cs680.hw17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableObserverTest {

    @Test
    public void table_observer_test(){
        StockQuoteObservable s = new StockQuoteObservable();

        s.addObserver((newStock, event) -> {System.out.println(event.get_quote());});

        s.change_quote("aryan", 1000000.00);
    }

}