package edu.umb.cs680.hw08;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    Directory root = new Directory("root", 7, LocalDateTime.now(), null);

    Directory Apps = new Directory("Apps", 7, LocalDateTime.now(), root);

    Directory bin = new Directory("Lib", 7, LocalDateTime.now(), root);

    Directory Home = new Directory("Home", 7, LocalDateTime.now(), root);

    Directory pictures = new Directory("Code", 7, LocalDateTime.now(), Home);

    File x = new File("x", 7, LocalDateTime.now(), Apps);

    File y = new File("y", 7, LocalDateTime.now(), bin);

    File a = new File("a", 7, LocalDateTime.now(), pictures);

    File b = new File("b", 7, LocalDateTime.now(), pictures);

    File c = new File("c", 7, LocalDateTime.now(), Home);

    Link d = new Link("d",7, LocalDateTime.now(), pictures, root);

    Link e = new Link("e", 7, LocalDateTime.now(), x, root);


    private String[] file_to_string(File f){
        Optional<Directory> optional_directory = Optional.ofNullable(f.getParent());
        String[] file = {f.getName(),
                Integer.toString(f.getSize()),
                optional_directory.isPresent()?f.getParent().getName():"null"};
        return file;
    }

    @Test
    public void Test1(){
        String[] expected = {"y", "7", "Lib"};
        assertArrayEquals(expected, file_to_string(y));
    }

    @Test
    public void Test2(){
        String[] expected = {"x", "7", "Apps"};
        assertArrayEquals(expected, file_to_string(x));
    }



}