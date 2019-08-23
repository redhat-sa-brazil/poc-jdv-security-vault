
package com.redhat.senhasegura;


import java.util.Map;
import java.util.Set;

import com.redhat.senhasegura.exception.SecurityException;

/**
 * Vault for secure storage of attributes
 * @author Anil.Saldhana@redhat.com
 * @since Aug 12, 2011
 */
public interface SecurityVault
{
   /**
    * Initialize the vault
    * @param options
    */
   void init(Map<String,Object> options) throws SecurityException;
   
   /**
    * Determine if the vault is initialized
    * @return
    */
   boolean isInitialized();

   /**
    * Retrieve the shared key from the vault
    * @param handshakeOptions a set of options that the vault identifies for handshake
    * @return
    * @throws SecurityException
    */
   byte[] handshake(Map<String,Object> handshakeOptions) throws SecurityException;
   
   /**
    * Get the currently vaulted VaultBlock_attribute Names
    * @return
    * @throws SecurityException
    */
   Set<String> keyList() throws SecurityException;
   
   /**
    * Check whether an attribute value exists in the vault
    * @param vaultBlock
    * @param attributeName
    * @return
    * @throws SecurityException
    * @since v4.0.3
    */
   boolean exists(String vaultBlock, String attributeName) throws SecurityException;
   
   /**
    * Store an attribute value
    * @param vaultBlock a string value that brings in the uniqueness
    * @param attributeName name of the attribute
    * @param attributeValue
    * @param sharedKey
    * @throws SecurityException
    */
   void store(String vaultBlock, String attributeName,char[] attributeValue, byte[] sharedKey) throws SecurityException;

   /**
    * Retrieve the attribute value
    * @param vaultBlock
    * @param attributeName
    * @param sharedKey
    * @return
    * @throws SecurityException
    */
   char[] retrieve(String vaultBlock, String attributeName, byte[] sharedKey) throws SecurityException;
   
   /**
    * Remove an existing attribute value
    * @param vaultBlock
    * @param attributeName
    * @param sharedKey
    * @return true if remove was successful, false otherwise
    * @throws SecurityException
    * @since v4.0.4.final
    */
   boolean remove(String vaultBlock, String attributeName, byte[] sharedKey) throws SecurityException;
}