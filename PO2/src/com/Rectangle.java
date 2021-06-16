package com;

public class Rectangle {
    private float x,y,length,height;

    public  Rectangle(float _x,float _y, float l, float h){
        x = _x;
        y = _y;
        length = l;
        height = h;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void showRectangle(){
        System.out.println("Showing rectangle!");
        System.out.println("Height : "+height);
        System.out.println("Length : "+length);
        System.out.println("(x,y) : (" + x + "," + y + ")");
    }
    public void printSquare(){
        float square = height*length;
        System.out.println(square);
    }
    public float getHeight() {
        return height;
    }
    public float getLength() {
        return length;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public  boolean inSquare(float _x,float _y){
        if((_x>=x && _x<=x+length)&&(_y>=y && _y<=y+height)){
            return true;
        }
        else {
            return false;
        }
    }
}
