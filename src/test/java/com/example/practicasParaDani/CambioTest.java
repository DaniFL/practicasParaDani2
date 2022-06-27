package com.example.practicasParaDani;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CambioTest {
    //200 cents = 2€
    List<Integer> monedasCambio = Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1);

    @Test
    public void ejemploCambio(){
        //tenemos que dar el cambio (5000), con el menor numero de monedas posibles, por lo que son 25 veces 200.
        assertEquals(3, Cambio.cambioIterativo(500, monedasCambio));
        assertEquals(4, Cambio.cambioIterativo(275, monedasCambio));
        System.out.println(Cambio.cambioIterativo(500, monedasCambio));
        System.out.println(Cambio.cambioIterativo(275, monedasCambio));
    }

    @Test
    public void ejemploCambioRecursivos(){
        assertEquals(3, Cambio.cambioRecursivo(500, monedasCambio));
        System.out.println(Cambio.cambioRecursivo(500, monedasCambio));
        assertEquals(1, Cambio.cambioRecursivo(200, monedasCambio));
        System.out.println(Cambio.cambioRecursivo(200, monedasCambio));
        //assertEquals(1, Cambio.cambioRecursivo(200, monedasCambio));
        System.out.println(Cambio.cambioRecursivo(235, monedasCambio));
        assertEquals(0, Cambio.cambioRecursivo(0, monedasCambio));
        System.out.println(Cambio.cambioRecursivo(0, monedasCambio));
        assertEquals(0, Cambio.cambioRecursivo(-1, monedasCambio));
        System.out.println(Cambio.cambioRecursivo(-1, monedasCambio));

    }

    @Test
    public void ejemploCambioLambda(){
        //assertEquals(3, Cambio.cambioLamba(500, monedasCambio));
        System.out.println(Cambio.cambioLamba(500, monedasCambio));
    }
}
