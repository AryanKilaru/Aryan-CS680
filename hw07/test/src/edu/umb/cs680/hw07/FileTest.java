package edu.umb.cs680.hw07;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
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

    private String[] file_to_string(File f){
        Optional<Directory> optional_directory = Optional.ofNullable(f.getParent());
        String[] file = {f.getName(),
                         Integer.toString(f.getSize()),
                         optional_directory.isPresent()?f.getParent().getName():"null"};
        return file;
    }

    @Test
    public void Test1(){
        String[] expected = {"x", "7", "Apps"};
        assertArrayEquals(expected, file_to_string(x));
    }

    @Test
    public void Test2(){
        String[] expected = {"c", "7", "Code"};
        assertArrayEquals(expected, file_to_string(c));
    }

}