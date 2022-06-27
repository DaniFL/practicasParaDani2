package com.example.practicasParaDani;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumeroPrimoTest {

    @Test
    public void primoLambda(){
        assertTrue(NumeroPrimo.primoLambda(17));
    }
}
