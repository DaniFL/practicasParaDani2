package com.example.practicasParaDani;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterseccionTest {


    @Test
    public void testInterseccionIterativa() {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        lista1.addAll(Arrays.asList(1, 2, 3, 4, 15, 16, 17, 18, 19, 10));
        lista2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> listaInterseccion = Interseccion.interseccionIterativa(lista1, lista2);
        assertEquals(5, listaInterseccion.size());
        System.out.println(listaInterseccion);
    }

    @Test
    public void testInterseccionRecursiva(){
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        lista1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        lista2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> listaInterseccion = Interseccion.interseccionRecursiva(lista1, lista2);
        assertEquals(10, listaInterseccion.size());
        System.out.println(listaInterseccion);

    }

    @Test
    public void testInterseccionLambda(){
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        lista1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        lista2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> listaInterseccion = Interseccion.interseccionLambda(lista1, lista2);
        assertEquals(10, listaInterseccion.size());
        System.out.println(listaInterseccion);

    }

}
