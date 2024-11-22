package com.exercise.palindromo.Service;

import org.springframework.stereotype.Service;

@Service
public class PalindromoServiceImp implements PalindromoService {

    /**
     * @param palabra a evaluar
     * @return true o false
     */

    @Override
    public boolean esPalindromo(String palabra) {
        if(palabra==null ||palabra.isEmpty()){
            return false;
        }
        String palabraLimpia= palabra.toLowerCase();
        String palabraInversa=  new StringBuilder(palabraLimpia).reverse().toString();

        return palabraLimpia.equals(palabraInversa);
    }
}
