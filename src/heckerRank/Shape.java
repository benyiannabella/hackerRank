package heckerRank;

public class Shape{
    private int length;
    private int breadth;

    public Shape(){}
    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void area(){
        System.out.println(this.length + " " + this.breadth);
    }

    public static void main(String[] args) {
        Shape s = new Shape(4,5);
        Rectangle r = new Rectangle(4,5);
        s.area();
        r.area();
    }
}

class Rectangle extends Shape{

    public Rectangle(int length, int breadth){
        super(length, breadth);
    }


    public void area(){
        System.out.println(getBreadth() * getLength());
    }
}