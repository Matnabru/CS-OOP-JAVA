package Po3;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    Scanner scanner = new Scanner(System.in);
    private int[][] _matrix;

    Matrix(int i) {
        if (i>=1) {
            this._matrix = new int[i][i];
        }
    }
    public void fillMatrixNWD() {
        for (int a=0;a<this._matrix.length;a++) {
            for (int b=0;b<this._matrix.length;b++) {
                if (NWD(a,b)==1) {
                    this._matrix[a][b] = 1;
                }else {
                    this._matrix[a][b] = 0;
                }
            }
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
    public int NWD(int a, int b) {
        if (b == 0) {
            return a;
        } else
        {
            return NWD(b, a % b);
        }
    }
    public int rowSum(int i){
        if(i<=0||i>this._matrix.length){
            System.out.println("Error : Typed row is out of range!");
            return -1;
        }else {
            int sum=0;
            for(int a=0;a<this._matrix.length;a++){
                sum = sum + this._matrix[i-1][a];
            }
            return sum;
        }
    }
    public int colSum(int i){
        if(i<=0||i>this._matrix.length){
            System.out.println("Error : Typed col is out of range!");
            return -1;
        }else {
            int sum=0;
            for(int a=0;a<this._matrix.length;a++){
                sum = sum + this._matrix[a][i-1];
            }
            return sum;
        }
    }
    public void sortRow(){
        for(int i=0;i<this._matrix.length;i++){
            Arrays.sort(this._matrix[i]);
        }
    }
    public void sortCol() {
        for (int j = 0; j < this._matrix.length; j++) {
            for (int i = 0; i < this._matrix.length; i++) {
                for (int k = i + 1; k < this._matrix.length; k++) {
                    if (this._matrix[i][j] < this._matrix[k][j]) {
                        int x = this._matrix[i][j];
                        this._matrix[i][j] = this._matrix[k][j];
                        this._matrix[k][j] = x;
                    }
                }
            }
        }
    }
    public void minMax(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<this._matrix.length;i++){
            for(int y=0;y<this._matrix.length;y++){
                if(this._matrix[i][y]<min){
                    min = this._matrix[i][y];
                }
                if(this._matrix[i][y]>max){
                    max = this._matrix[i][y];
                }
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
