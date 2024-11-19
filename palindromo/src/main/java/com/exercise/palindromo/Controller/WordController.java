package com.exercise.palindromo.Controller;


import com.exercise.palindromo.Entitie.PostRequest;
import com.exercise.palindromo.Service.PalindromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WordController {

    @Autowired
    private PalindromoService servicioPalindromo;

    @GetMapping()
    public String saludo(){
        return "Hola, api funcionando";
    }

    @GetMapping("/word/{word}")
    public Boolean wordChecker(@PathVariable String word){
        return servicioPalindromo.esPalindromo(word);
    }


    @PostMapping("/word/body")
    public String wordCheckerBody(@RequestBody PostRequest requestPalabra){

        if(requestPalabra.getPalabra()==null || requestPalabra.getPalabra().isEmpty()){
            return "No envio paramatros";
        }
        else {
            boolean result=servicioPalindromo.esPalindromo(requestPalabra.getPalabra());
            if(result) return "Si es palindromo";
            else return "No es palindromo";
        }

    }
}
