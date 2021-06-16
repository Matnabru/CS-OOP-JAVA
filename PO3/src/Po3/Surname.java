package Po3;

import java.util.Scanner;

public class Surname {
    Scanner scanner = new Scanner(System.in);
    private String[] _surnames;

    Surname(int i){
        if(i>=1){
            this._surnames = new String[i];
            for(int a=0;a<i;a++){
                this._surnames[a] = scanner.next();
            }
        }
    }
    public void longerThan(int i){
        for(int a=0;a<this._surnames.length;a++){
            if(this._surnames[a].length()>i){
                System.out.println(this._surnames[a]);
            }
        }
    }
}
