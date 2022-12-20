package edu.umb.cs680.hw09;

public interface FSVisitor {
    public void visit(Link l);

    public void visit(Directory d);

    public void visit(File f);
}
