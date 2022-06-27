package com.example.practicasParaDani;

import java.util.ArrayList;
import java.util.List;

public class Interseccion {

    public static List<Integer> interseccionIterativa(List<Integer> lista1, List<Integer> lista2){
        List<Integer> listaInterseccion = new ArrayList<>();
        for(Integer i : lista1){
            if(lista2.contains(i)){
                listaInterseccion.add(i);
            }
        }
        return listaInterseccion;
    }
    public static List<Integer> interseccionRecursiva(List<Integer> lista1, List<Integer> lista2){
        if(lista1.isEmpty()){
            return lista1;
        }
        if(lista2.isEmpty()){
            return lista2;
        }
        if(lista1.get(0) == lista2.get(0)){
            List<Integer> listaInterseccion = new ArrayList<>();
            listaInterseccion.add(lista1.get(0));
            listaInterseccion.addAll(interseccionRecursiva(lista1.subList(1, lista1.size()), lista2.subList(1, lista2.size())));
            return listaInterseccion;
        }
        else if(lista1.get(0) < lista2.get(0)){
            return interseccionRecursiva(lista1.subList(1, lista1.size()), lista2);
        }
        else{
            return interseccionRecursiva(lista1, lista2.subList(1, lista2.size()));
        }
    }
    public static List<Integer> interseccionLambda(List<Integer> lista1, List<Integer> lista2){
        return lista1.stream().filter(i -> lista2.contains(i)).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}

