package com.example.ass2.newPackage;


public class Rectangle {
    private int length;
    private int width;
    private int perimeter;
    private int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.perimeter = (2*length)+(2*width);
        this.area = length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
