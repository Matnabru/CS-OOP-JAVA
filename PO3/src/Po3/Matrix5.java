package Po3;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix5 {

    Scanner scanner = new Scanner(System.in);
    private int diagld;
    private int diagrd;
    private int[][] _matrix;

    Matrix5(int i) {
        if (i>=1) {
            this._matrix = new int[i][i];
        }
    }
    public void fillMatrixRandom(int x,int y) {
        for (int a=0;a<this._matrix.length;a++) {
            for (int b=0;b<this._matrix.length;b++) {
                this._matrix[a][b] = getRandomNumber(x,y);
            }
        }
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void showMatrix() {
        for (int a=0;a<this._matrix.length;a++) {
            for (int b=0;b<this._matrix.length;b++) {
                System.out.print(this._matrix[a][b]+" ");
            }
            System.out.print("\n");
        }
    }
    public void diagonalSum(){
        int ld=0,rd=0;
        for (int i=0;i<this._matrix.length;i++){
            rd+= this._matrix[i][i];
            ld+= this._matrix[this._matrix.length-1-i][i];
        }
        System.out.println("Sum from diagonal ([0,0] to [n,n]) : "+rd);
        System.out.println("Sum from diagonal ([n,0] to [0,n]) : "+ld);
    }
}
