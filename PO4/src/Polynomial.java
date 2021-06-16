import java.lang.reflect.Array;
import java.util.Scanner;

public class Polynomial {

    Scanner scanner = new Scanner(System.in);

    private int[] polynomial;
    Polynomial(int i){
        if(i<0||i>100){
            throw new IllegalArgumentException("Number of polynomial arguments is invalid!");
        }
        polynomial = new int[i];
    }
    public void fill(){
        for(int a=0;a<polynomial.length;a++){
            System.out.println("Define factor of x^"+a);
            polynomial[a] = scanner.nextInt();
        }
    }
    public void show(){
        for(int i= polynomial.length-1;i>= 0;i--){
            System.out.print(polynomial[i]+"*x^"+i + " ");
        }
        System.out.print("\n");
    }
    public void solve(int i){
        int sum=0;
        for(int a=0;a< polynomial.length;a++){
            sum+= polynomial[a]*Math.pow(i,a);
            if(sum > 100){
                throw new IllegalArgumentException("Solved value of polynomial with defined argument : " +i +  " is too big!");
            }
        }
        System.out.println("Polynomial with argument x = "+ i + " equals : " + sum);
    }
    public Polynomial add(Polynomial x){
        boolean option;
        int length;
        int constructLength;
        // Take shorter length
        if(x.polynomial.length>this.polynomial.length){
            // x.polynomial length is bigger than other object
            option = true;
            length = this.polynomial.length;
            constructLength = x.polynomial.length;
        }else {
            //x.polynomial length is smaller than other object
            option = false;
            length = x.polynomial.length;
            constructLength = this.polynomial.length;
        }
        Polynomial hpol = new Polynomial(constructLength);
        if(option){
            hpol.polynomial = x.polynomial;
            for(int a=0;a<length;a++){
                hpol.polynomial[a] += this.polynomial[a];
            }
        }else {
            hpol.polynomial = this.polynomial;
            for(int a=0;a<length;a++){
                hpol.polynomial[a] += x.polynomial[a];
            }
        }
        return hpol;
    }
    public Polynomial sub(Polynomial x){
        boolean option;
        int length;
        int constructLength;
        // Take shorter length
        if(x.polynomial.length>this.polynomial.length){
            // x.polynomial length is bigger than other object`s (this)
            option = true;
            length = this.polynomial.length;
            constructLength = x.polynomial.length;
        }else {
            //x.polynomial length is smaller than other object`s (this)
            option = false;
            length = x.polynomial.length;
            constructLength = this.polynomial.length;
        }
        Polynomial hpol = new Polynomial(constructLength);
        if(option){
            hpol.polynomial = x.polynomial;
            for(int a=0;a<length;a++){
                hpol.polynomial[a] -= this.polynomial[a];
            }
        }else {
            hpol.polynomial = this.polynomial;
            for(int a=0;a<length;a++){
                hpol.polynomial[a] -= x.polynomial[a];
            }
        }
        return hpol;
    }
    public Polynomial mul(Polynomial x){
        boolean option;
        int length;
        int constructLength;
        // Take shorter length
        if(x.polynomial.length>this.polynomial.length){
            // x.polynomial length is bigger than other object`s (this)
            option = true;
            length = this.polynomial.length;
            constructLength = x.polynomial.length;
        }else {
            //x.polynomial length is smaller than other object`s (this)
            option = false;
            length = x.polynomial.length;
            constructLength = this.polynomial.length;
        }
        Polynomial hpol = new Polynomial(constructLength+length-1);
        if(option){
            for(int i=0;i<length;i++){
                for(int y=0;y<constructLength;y++){
                    if(this.polynomial[i]==0){
                        hpol.polynomial[y+i] += x.polynomial[y];
                    }else if(x.polynomial[y]==0){
                        hpol.polynomial[y+i] += this.polynomial[i];
                    }else {
                        hpol.polynomial[y+i] += this.polynomial[i]*x.polynomial[y];
                    }
                }
            }
        }else {
            for(int y=0;y<length;y++){
                for(int i=0;i<constructLength;i++){
                    if(this.polynomial[i]==0){
                        hpol.polynomial[y+i] += x.polynomial[y];
                    }else if(x.polynomial[y]==0){
                        hpol.polynomial[y+i] += this.polynomial[i];
                    }else {
                        hpol.polynomial[y+i] += this.polynomial[i]*x.polynomial[y];
                    }
                }
            }
        }
        return hpol;
    }
}
