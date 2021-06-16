package Po3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //palindromes();

        //surnames();

        //matrix3();

        //matrix4();

        matrix5();
    }
    public static void palindromes(){
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome(scanner.nextInt());
        palindrome.showPalindrome();
    }
    public static void surnames(){
        Scanner scanner = new Scanner(System.in);
        Surname surname = new Surname(5);
        surname.longerThan(5);
    }
    public static void matrix3(){
        Scanner scanner = new Scanner(System.in);
        Matrix3 matrix = new Matrix3(10);
        matrix.fillMatrixNWD();
        matrix.showMatrix();
    }
    public static void matrix4(){
        Scanner scanner = new Scanner(System.in);
        Matrix4 matrix = new Matrix4(5);
        matrix.fillMatrixRandom(-100,100);
        matrix.showMatrix();
        System.out.println("Row sum : "+matrix.rowSum(1));
        System.out.println("Col sum : " +matrix.colSum(1));
        matrix.sortRow();
        matrix.showMatrix();
        matrix.sortCol();
        matrix.showMatrix();
        matrix.minMax();
    }
    public static void matrix5(){
        Scanner scanner = new Scanner(System.in);
        Matrix5 matrix = new Matrix5(10);
        matrix.fillMatrixRandom(1,9);
        matrix.showMatrix();
        matrix.diagonalSum();
    }

}
