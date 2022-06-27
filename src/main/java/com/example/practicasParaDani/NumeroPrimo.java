package com.example.practicasParaDani;

import java.util.stream.Stream;

public class NumeroPrimo {
    public static boolean primoIterativo(int n){
        return false;
    }
    public static boolean primoRecursivo(int n){
        return false;
    }
    public static boolean primoLambda(int n){
        return Stream.iterate(1, x -> x+1).limit(10).noneMatch(x -> n % x == 0);
    }
}
