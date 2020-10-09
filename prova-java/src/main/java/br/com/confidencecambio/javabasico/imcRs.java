package br.com.confidencecambio.javabasico;


import br.com.confidencecambio.javabasico.service.IMC;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class imcRs {

    private IMC service;

    public imcRs(final IMC service) {

        this.service = service;
    }

    @RequestMapping(value = "/IMC", method = RequestMethod.GET)
        public ResponseEntity<Integer> findImc(@RequestParam Integer peso, Integer altura) 
    {
    	Integer retorno =  service.retornaIMC(peso,altura);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
