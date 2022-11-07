package edu.umb.cs680.hw03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class SingletonTest {

    @Test
    public void notNull(){
        Singleton sing = Singleton.getInstance();

        Assertions.assertNotNull(sing);
    }

    @Test
    public void checkIdentical(){
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        Assertions.assertSame(sing2,sing1);
    }

    @Test
    public void checkLogic(){
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        Assertions.assertEquals(sing2.hashCode(),sing1.hashCode());

    }
}