package edu.umb.cs680.hw09;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FileCrawlingVisitorTest {
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

    @Test
    public void FileCrawlingTest(){
        FileCrawlingVisitor visitor = new FileCrawlingVisitor();
        y.accept(visitor);
        assertEquals(1,visitor.getFile().size());
    }

    @Test
    public void CrawlingTest_Apps(){
        FileCrawlingVisitor visitor = new FileCrawlingVisitor();
        Apps.accept(visitor);
        assertEquals(1,visitor.getFile().size());
    }

    @Test
    public void CrawlingTest_pictures() {
        FileCrawlingVisitor visitor = new FileCrawlingVisitor();
        pictures.accept(visitor);
        assertEquals(2, visitor.getFile().size());
    }
}