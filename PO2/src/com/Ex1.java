package com;
import java.lang.Math;
public class Ex1 {
    private float a,b,c;

    public Ex1(float x,float y,float z) {
        a =x;
        b=y;
        c=z;
    }
    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void printFunction(){
        System.out.println(a + "x2 + " + b + "x + " + c);
    }
    public float calculateValue(float x){
        return a*x*x + b*x + c;
    }
    public void showRoots() {
        float delta = b*b - 4*a*c;
        if(delta>0){
            System.out.println("This function has 2 roots!");
            System.out.println("1. "+ (-b-Math.sqrt(delta))/(2*a));
            System.out.println("2. "+ (-b+Math.sqrt(delta))/(2*a));
        }
        else if(delta==0){
            System.out.println("This function has 1 root!");
            System.out.println("1. "+ (-b/(2*a)));
        }
        else{
            System.out.println("This function has 0 roots!");
        }
    }
}
