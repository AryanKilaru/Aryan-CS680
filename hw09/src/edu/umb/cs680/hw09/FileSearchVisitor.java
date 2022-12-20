package edu.umb.cs680.hw09;

import java.util.LinkedList;

public class FileSearchVisitor implements FSVisitor{

    String file_name;

    FileSearchVisitor(String file_name){
        this.file_name = file_name;
    }

    LinkedList<File> foundFiles = new LinkedList<File>();


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
        if(f.getName().equals(file_name)){
            foundFiles.add(f);
        }
    }
}
