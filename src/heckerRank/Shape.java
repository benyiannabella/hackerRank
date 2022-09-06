package heckerRank;

import java.util.Scanner;

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
        Shape shape = new Shape();
        Shape r = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        String[] arr = s.split(" ");

                r.setLength(Integer.parseInt(arr[0]));
                shape.setLength(Integer.parseInt(arr[0]));

                r.setBreadth(Integer.parseInt(arr[1]));
                shape.setBreadth(Integer.parseInt(arr[1]));


        shape.area();
        r.area();
    }
}

    class Rectangle extends Shape{
    public  Rectangle(){}
    public Rectangle(int length, int breadth){
        super(length, breadth);
    }


    public void area(){
        System.out.println(getBreadth() * getLength());
    }
}