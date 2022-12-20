package edu.umb.cs680.hw07;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {
    Directory root = new Directory("root", 7, LocalDateTime.now(), null);

    Directory Apps = new Directory("Apps", 7, LocalDateTime.now(), root);

    Directory Lib = new Directory("Lib", 7, LocalDateTime.now(), root);

    Directory Home = new Directory("Home", 7, LocalDateTime.now(), root);

    Directory Code = new Directory("Code", 7, LocalDateTime.now(), Home);

    File x = new File("x", 7, LocalDateTime.now(), Apps);

    File y = new File("y", 7, LocalDateTime.now(), Apps);

    File z = new File("z", 7, LocalDateTime.now(), Lib);

    File a = new File("a", 7, LocalDateTime.now(), Code);

    File b = new File("b", 7, LocalDateTime.now(), Code);

    File c = new File("c", 7, LocalDateTime.now(), Code);

    File d = new File("d", 7, LocalDateTime.now(), Home);

    private String[] directory_to_string(Directory d){
        Optional<Directory> optional_directory = Optional.ofNullable(d.getParent());
        String[] file = {d.getName(),
                Integer.toString(d.getSize()),
                optional_directory.isPresent()?d.getParent().getName():"null"};
        return file;
    }

    @Test
    public void Test1(){
        String[] expected = {"Apps", "7", "root"};
        assertArrayEquals(expected, directory_to_string(Apps));
    }

    @Test
    public void Test2(){
        String[] expected = {"root", "7", "null"};
        assertArrayEquals(expected, directory_to_string(root));
    }

    @Test
    public void Test3(){
        String[] expected = {"Code", "7", "Home"};
        assertArrayEquals(expected, directory_to_string(Code));
    }

}