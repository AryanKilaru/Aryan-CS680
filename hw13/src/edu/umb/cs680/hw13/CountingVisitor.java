package edu.umb.cs680.hw13;

public class CountingVisitor implements FSVisitor{

    int link_Num = 0;
    int file_Num = 0;

    int dir_Num = 0;

    @Override
    public void visit(Link l) {
        link_Num++;
    }

    @Override
    public void visit(Directory d) {
        dir_Num++;
    }

    @Override
    public void visit(File f) {
        file_Num++;
    }

    public int getDir_Num() {
        return dir_Num;
    }
}
