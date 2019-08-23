package com.redhat.senhasegura.integration;


import java.util.Random;

import com.redhat.senhasegura.configuration.Configuration;

public class SyncCredencials extends Thread  {
	
	  public void run() 
	    { 
	        try
	        { 
	        	Long timer = Long.parseLong(Configuration.getInstance().getEXPIRE_TOKEN());
	  		  while(true) {
	  			  
	  			  /* 
	  			   * @ Implementar o processo de consumo do serviço senha segura da SulAmerica atualizando os dados 
	  			   * /Token_auth
	  			   * /token_validate
	  			   *  return Token
	  			   */
	  			  
	  			  
	  			  
	  			  /*
	  			   * Propriedades para definir no Data Source
	  			   * As propriedades serão atualizadas após a comunicação com o servico Rest
	  			   * Para a prova de conceito essa comunicação foi mocada
	  			   */
	  			  
	  			System.setProperty("SENHASEGURA_IDENTIFICADOR", "00");
	  			System.setProperty("SENHASEGURA_USERNAME", "jboss");
	  			System.setProperty("SENHASEGURA_PASSWORD", "jboss");
	  			System.setProperty("SENHASEGURA_HOSTNAME", "localhost");
	  			System.setProperty("SENHASEGURA_IP", "127.0.0.1");
	  			System.setProperty("SENHASEGURA_PORT", "3306");
	  			System.setProperty("SENHASEGURA_DATETIME_EXPIRATION", "6000");
	  			System.out.println("Valor:" + generateRandomDouble());
	  			Thread.sleep(timer); 
	  	      }
	  	  
	        } 
	        catch (Exception e) 
	        { 
	            // Throwing an exception 
	            System.out.println ("Exception is caught"); 
	        } 
	    }
	  
	  /*
	   * Metodo exemplo de atualização de valores dinâmicos
	   * 
	   */
	  public static double generateRandomDouble(){
		    Random random = new Random();
		    return random.nextDouble();
		}


}
