package com;

public class Po2 {
    public static void main(String[] args) {

        //exfirst();

        //exsecond();

        exthird();
    }
    static public void exfirst(){
        // Builder for default values isn't implemented
        Ex1 ex1 = new Ex1(2,4,-2);
        // Printing function
        ex1.printFunction();
        // Changing a value in function
        ex1.setA(-2);
        ex1.printFunction();
        // Printing calculated value for x = 2
        System.out.println(ex1.calculateValue(2));
        // Printing roots of the equation
        ex1.showRoots();
    }
    static public void exsecond(){
        Rational num1 = new Rational(2,4);
        num1.show();
        Rational num2 = new Rational(4,8);
        num2.show();

        Rational num3 = num1.add(num2);
        num3.show();

        num3 = num1.div(num2);
        num3.show();

        num3 = num1.sub(num2);
        num3.show();

        num3 = num1.mul(num2);
        num3.show();

        System.out.println(num1.equals(num2));
        System.out.println(num3.equals(num2));
    }
    static  public void exthird(){
        Rectangle rectangle = new Rectangle(4,3,2,1);
        rectangle.showRectangle();
        rectangle.setX(1);
        rectangle.showRectangle();
        rectangle.setHeight(10);
        rectangle.showRectangle();
        rectangle.printSquare();
        System.out.println(rectangle.inSquare(2,4));
        System.out.println(rectangle.inSquare(5,4));
    }
}
