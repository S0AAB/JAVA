package com.exercise.palindromo.Service;

import org.springframework.stereotype.Service;


/**
 * Servicio que contiene la logica para determinar si es palindromo
 */
@Service
public class PalindromoService {
    /**
     *
     * @param palabra a evaluar
     * @return true o false
     */
    public boolean esPalindromo (String palabra){
        if(palabra==null ||palabra.isEmpty()){
            return false;
        }
       String palabraLimpia= palabra.toLowerCase();
        String palabraInversa=  new StringBuilder(palabraLimpia).reverse().toString();

        return palabraLimpia.equals(palabraInversa);
    }
}
