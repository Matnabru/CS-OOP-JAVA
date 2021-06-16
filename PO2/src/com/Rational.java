package com;

public class Rational {
    private int nominator,denominator;

    public Rational(int nom,int dnom){
        nominator = nom;
        denominator = dnom;
    }
    public Rational add(Rational arg){
        Rational newrational = new Rational(arg.nominator*denominator + nominator*arg.denominator,arg.denominator*denominator);
        return  newrational;
    }
    public Rational mul(Rational arg){
        Rational newrational = new Rational(arg.nominator*nominator,arg.denominator*denominator);
        return  newrational;
    }
    public Rational sub(Rational arg){
        Rational newrational = new Rational(arg.nominator*denominator - nominator*arg.denominator,arg.denominator*denominator);
        return  newrational;
    }
    public Rational div(Rational arg){
        Rational newrational = new Rational(arg.denominator*nominator,arg.nominator*denominator);
        return  newrational;
    }
    public boolean equals(Rational arg){
        if(nominator*arg.denominator==arg.nominator*denominator){
            return true;
        }
        else{
            return false;
        }
    }
    public void show(){
        System.out.println(nominator+"/"+denominator);
    }
}
