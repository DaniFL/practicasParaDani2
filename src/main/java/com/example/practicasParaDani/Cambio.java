package com.example.practicasParaDani;

import java.util.List;
import java.util.stream.Collectors;

public class Cambio {

    /**
     * Devuelve el número de monedas necesarias de manera Iterativa para cambiar un cambio de un sistema de monedas.
     *
     * @param cambio cambio a devolver en monedas
     * @param sistemaMonedas sistema de monedas
     * @return numero de monedas necesarias para devolver el cambio
     */
    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas){
        int numMonedas= 0;
        for(int i = 0; i < sistemaMonedas.size(); i++){
            if(cambio >= sistemaMonedas.get(i)) {
                numMonedas += cambio / sistemaMonedas.get(i);
                cambio = cambio % sistemaMonedas.get(i); // cambio  * (cambio / sistemaMonedas.get(i));
            }
        }
        return numMonedas;
    }

    /**
     * (MÉTODO AXULIAR)
     * Devuelve el número de monedas necesarias de manera Recursiva para cambiar un cambio de un sistema de monedas.
     *
     * @param cambio cambio a devolver en monedas
     * @param sistemaMonedas sistema de monedas
     * @return numero de monedas necesarias para devolver el cambio
     */
    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas){
        //caso base: si el cambio es 0, no se necesitan monedas
        if(cambio == 0) {
            return 0;
        }
        //2º caso base: si el cambio es negativo, no se necesitan monedas
        if(cambio < 0) {
            return 0;
        }
        //caso recursivo: si el cambio es mayor que 0, se necesitan monedas
        if (cambio > 0) {
            if(cambio % sistemaMonedas.get(0) == 0) {
                return 1;
            }
            else {
                return 1 + cambioRecursivo(cambio - sistemaMonedas.get(0), sistemaMonedas);
            }
        }
        return 0;
    }

    /**
     * Método con implementación recursiva para el cambio de un sistema de monedas.
     *
    public static int cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int[] resultado){
        //1º caso base: si el cambio es 0, no se necesitan monedas
        if(cambio == 0){
            resultado[0] = 0;
        }
        //2º caso base: si el cambio es negativo, no se necesitan monedas
        else if(cambio < 0){
            resultado[0] = 0;
        }
        //caso recursivo: si el cambio es mayor que 0, se necesitan monedas
        else if(cambio > 0){
            if(cambio % sistemaMonedas.get(i) == 0){
                resultado[0] = 1;
            }
            else{
                return cambioRecursivo(cambio - sistemaMonedas.get(i), i+1, sistemaMonedas, resultado);
            }
        }
        return resultado[0];
    }
    */

    //Intentalo si puedes
    public static int cambioLamba(int cambio, List<Integer> sistemaMonedas){
        //devolver numero monedas necesarias para cambiar el cambio de un sistema de monedas con una lista de monedas y un cambio con expresiones lambda
        return sistemaMonedas.stream().filter(moneda -> cambio >= sistemaMonedas.get(0)).mapToInt(moneda -> cambio / sistemaMonedas.get(0)).sum();
    }

}
