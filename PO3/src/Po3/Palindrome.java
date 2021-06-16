package Po3;

import java.util.Scanner;

public class Palindrome {
    Scanner scanner = new Scanner(System.in);
    private String[] _words;

    Palindrome(int i){
        if(i>=1){
            this._words = new String[i];
            for(int a=0;a<i;a++){
                this._words[a] = scanner.next();
                //System.out.println(ifPalindrome(this._words[a]));
            }
        }
    }
    public void showPalindrome(){
        System.out.println("Palindromes : ");
        for(int i=0;i<this._words.length;i++){
            if(ifPalindrome(this._words[i])==true){
                System.out.println(this._words[i]);
            }
        }
    }
    public boolean ifPalindrome(String word){
        boolean statement = true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                statement = false;
                break;
            }
        }
        return statement;
    }
}
