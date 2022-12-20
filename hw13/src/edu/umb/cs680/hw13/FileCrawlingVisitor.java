package edu.umb.cs680.hw13;

import java.util.LinkedList;

public class FileCrawlingVisitor implements FSVisitor {

    LinkedList<File> file = new LinkedList<File>();
    @Override
    public void visit(Link l) {
        return;
    }

    @Override
    public void visit(Directory d) {
        return;
    }

    @Override
    public void visit(File f) {
        file.add(f);
    }

    public LinkedList<File> getFile() {
        return file;
    }
}
