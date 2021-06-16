public class Zadanie4 {
    public int max(int a,int b,int c) {
        Zadanie3 zadanie3 = new Zadanie3();
        return zadanie3.max(a,zadanie3.max(b,c));
    }
}
