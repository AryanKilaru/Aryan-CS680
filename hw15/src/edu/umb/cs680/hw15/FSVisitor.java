package edu.umb.cs680.hw15;

public interface FSVisitor {
    public void visit(Link l);

    public void visit(Directory d);

    public void visit(File f);
}
