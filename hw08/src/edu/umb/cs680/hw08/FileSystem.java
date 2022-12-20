package edu.umb.cs680.hw08;

import java.util.LinkedList;

public class FileSystem {
    private LinkedList<Directory> root_dir;
    private static FileSystem file = null;

    public void add_Root(Directory root){
        root_dir = new LinkedList<Directory>();
        root_dir.add(root);
    }

    public FileSystem(){
        //;
    }

    public LinkedList<Directory> get_root_directories(){
        return this.root_dir;
    }

    public static FileSystem get_File_Instance(){
        if (file == null){
            file = new FileSystem();
        }
        return file;
    }
}
