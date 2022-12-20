package edu.umb.cs680.hw17;

public class StockEvent {
    String ticker;
    double quote;
    StockEvent(String s, double d){
        this.ticker =s;
        this.quote =d;
    }

    double get_quote() {
        return quote;
    }
}
