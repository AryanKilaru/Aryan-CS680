package edu.umb.cs680.hw17;

public class StockQuoteObservable extends Observable<StockEvent>{
    public void change_quote(String s, double d){
        notifyObservers(new StockEvent(s, d));
    }
}
