package br.com.confidencecambio.javabasico;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Robo implements Serializable{
	private static final long serialVersionUID = 1L; 
	
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
	    @NotNull
	    @NotEmpty
	    private String nome;

		@SuppressWarnings("unused")
		private Robo () {
			
		}
		
		public Robo(Integer id, String nome) {

			this.id = id;
			this.nome = nome;
		}

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		
		public String retornoSobreNome( ){
			int i;
			String sobreNome = null;
			String[] AuxNome = nome.split(" ");
		    for (i = 0; i < AuxNome.length; i++) { 
		    	if (i >= 1){ 
			    	sobreNome = AuxNome[i]; 
			    } 
		     } 
			return sobreNome;
		}
		
		public String retornoNomeAbreviado( ){
			String nomeAbreviado = null;
			String[] nomePedacos = nome.split(" ");
		    for (String letra : nomePedacos) { 
		    	nomeAbreviado  = letra.substring(0, 1) + "." ;
			 } 
			return nomeAbreviado;
		}
		
		public String retornoNomeMaiusculo( ){
			String nomeMaiusculo = nome.toUpperCase();
			return nomeMaiusculo;
		}
		
	}

		

