package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IMC {

    private static Integer IMC = 0 ;
    
    public Integer retornaIMC(@Nullable double peso,double altura) {
    	IMC = (int) (peso/Math.pow(altura, 2));
        return (IMC);
    }
}

