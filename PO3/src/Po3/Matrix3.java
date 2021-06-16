package Po3;


public class Matrix3 {
    private int[][] _matrix;

    Matrix3(int i) {
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
}
