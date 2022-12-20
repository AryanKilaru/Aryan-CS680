package edu.umb.cs680.hw15;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SizeTest {

    Directory root = new Directory("root", 7, LocalDateTime.now(), null);

    Directory Apps = new Directory("Apps", 7, LocalDateTime.now(), root);

    Directory bin = new Directory("Lib", 7, LocalDateTime.now(), root);

    Directory Home = new Directory("Home", 7, LocalDateTime.now(), root);

    Directory pictures = new Directory("Code", 7, LocalDateTime.now(), Home);

    File x = new File("x", 7, LocalDateTime.now(), Apps);

    File y = new File("y", 7, LocalDateTime.now(), bin);

    File a = new File("a", 7, LocalDateTime.now(), pictures);

    File b = new File("b", 14, LocalDateTime.now(), pictures);

    File c = new File("c", 7, LocalDateTime.now(), Home);

    Link d = new Link("d",7, LocalDateTime.now(), pictures, root);

    Link e = new Link("e", 7, LocalDateTime.now(), x, root);


    @Test
    public void Filesize(){
        LinkedList<File> actual = pictures.getFiles((FSElement o1, FSElement o2) ->{ return o2.getSize()- o1.getSize(); });
        File[] expected = {b, a};
        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void Directorysize(){
        LinkedList<File> actual = root.getFiles((FSElement o1, FSElement o2) ->{ return o2.getSize()- o1.getSize(); });
        File[] expected = {};
        assertArrayEquals(expected, actual.toArray());
    }

}