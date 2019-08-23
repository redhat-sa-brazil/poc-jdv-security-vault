
package com.redhat.senhasegura;

import java.security.KeyStore;
import java.util.Map;
import java.util.Set;

import org.jboss.security.PicketBoxLogger;
import org.jboss.security.PicketBoxMessages;
import org.jboss.security.vault.SecurityVault;
import org.jboss.security.vault.SecurityVaultException;
import com.redhat.senhasegura.configuration.Configuration;
import com.redhat.senhasegura.integration.SyncCredencials;


public class CustomSecurityVault implements SecurityVault
{
   protected boolean finishedInit = false;

   protected KeyStore keystore = null;
   
   protected String encryptionAlgorithm = "AES";
   
   protected int keySize = 128;
   
   
   /*
    * Propriedades do XML <VAULT> </VAULT>
    * 
    */
   
   public static final String URL = "URL";
   public static final String ACCESS_TOKEN_PATH = "ACCESS_TOKEN_PATH";
   public static final String AUTORIZATION_TOKEN_PATH = "AUTORIZATION_TOKEN_PATH";
   public static final String CLIENT_ID = "CLIENT_ID";
   public static final String ACCESS_TOKEN = "ACCESS_TOKEN";
   public static final String EXPIRE_TOKEN = "EXPIRE_TOKEN";
   
   
    
   /*
    * @see org.jboss.security.vault.SecurityVault#init(java.util.Map)
    */
   public void init(Map<String, Object> options) throws SecurityVaultException
   {
      if(options == null || options.isEmpty())
         throw PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMap("options");   
      
      
      
      Configuration.getInstance().setURL(options.get(URL).toString());
      if(Configuration.getInstance().getURL() == null)
         throw new SecurityVaultException(PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMessage(URL));

      Configuration.getInstance().setACCESS_TOKEN(options.get(ACCESS_TOKEN_PATH).toString());
      if(Configuration.getInstance().getACCESS_TOKEN() == null)
         throw new SecurityVaultException(PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMessage(ACCESS_TOKEN_PATH));

      Configuration.getInstance().setAUTORIZATION_TOKEN_PATH(options.get(AUTORIZATION_TOKEN_PATH).toString());
      if(Configuration.getInstance().getAUTORIZATION_TOKEN_PATH() == null)
         throw new SecurityVaultException(PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMessage(ACCESS_TOKEN_PATH));   
      
      Configuration.getInstance().setCLIENT_ID(options.get(CLIENT_ID).toString());
      if(Configuration.getInstance().getCLIENT_ID() == null)
         throw new SecurityVaultException(PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMessage(CLIENT_ID));
      
      Configuration.getInstance().setACCESS_TOKEN(options.get(ACCESS_TOKEN).toString());
      if(Configuration.getInstance().getACCESS_TOKEN() == null)
         throw new SecurityVaultException(PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMessage(ACCESS_TOKEN));

      Configuration.getInstance().setEXPIRE_TOKEN(options.get(EXPIRE_TOKEN).toString());
      if(Configuration.getInstance().getEXPIRE_TOKEN() == null)
         throw new SecurityVaultException(PicketBoxMessages.MESSAGES.invalidNullOrEmptyOptionMessage(EXPIRE_TOKEN));
      

      PicketBoxLogger.LOGGER.infoVaultInitialized();
      finishedInit = true;
      
      //Comentar após testes
      System.out.println("#### - JDV-SECURITY-VAULT - ###");
      System.out.println("URL: " + Configuration.getInstance().getURL());
      System.out.println("ACCESS_TOKEN_PATH: " + Configuration.getInstance().getACCESS_TOKEN_PATH());
      System.out.println("AUTORIZATION_TOKEN_PATH: " + Configuration.getInstance().getAUTORIZATION_TOKEN_PATH());
      System.out.println("CLIENT_ID: " + Configuration.getInstance().getCLIENT_ID());
      System.out.println("ACCESS_TOKEN: " + Configuration.getInstance().getACCESS_TOKEN());
      System.out.println("EXPIRE_TOKEN: " + Configuration.getInstance().getEXPIRE_TOKEN());
      
		/*
		 * password();
		 * 
		 * System.setProperty("VAULT::client_id::coe_username::1","jboss");
		 * 
		 * System.out.println("####################################\n " +
		 * System.getProperty("VAULT::client_id::coe_username::1") +
		 * "####################################\\n");
		 */
		
    
      SyncCredencials object  = new SyncCredencials();
      object.start(); 
   }
   
   /*
    * @see org.jboss.security.vault.SecurityVault#isInitialized()
    */
   public boolean isInitialized()
   {
	   
      return finishedInit;
   }

   /*
    * @see org.jboss.security.vault.SecurityVault#handshake(java.util.Map)
    */
   public byte[] handshake(Map<String, Object> handshakeOptions) throws SecurityVaultException {
	   
       return new byte[keySize];
   }


public Set<String> keyList() throws SecurityVaultException {
	// TODO Auto-generated method stub
	
	return null;
}

public boolean exists(String vaultBlock, String attributeName) throws SecurityVaultException {
	// TODO Auto-generated method stub
	
	return false;
}

public void store(String vaultBlock, String attributeName, char[] attributeValue, byte[] sharedKey)
		throws SecurityVaultException {
	// TODO Auto-generated method stub
	
}


public char[] retrieve(String vaultBlock, String attributeName, byte[] sharedKey) throws SecurityVaultException {
	// TODO Auto-generated method stub
	
	String teste = "jboss";
	return teste.toCharArray();
}


public boolean remove(String vaultBlock, String attributeName, byte[] sharedKey) throws SecurityVaultException {
	// TODO Auto-generated method stub
	
	return false;
}

public char[] password() throws SecurityVaultException {
	
	String teste = "jboss";
	return teste.toCharArray();
}
}