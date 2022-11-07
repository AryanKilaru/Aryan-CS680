package edu.umb.cs680.hw03;

public class Singleton {

    private static Singleton inst = null;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(inst==null){
            inst = new Singleton();

        }
        return inst;
    }



}
