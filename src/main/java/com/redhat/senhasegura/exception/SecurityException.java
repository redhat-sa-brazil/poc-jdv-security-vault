package com.redhat.senhasegura.exception;


public class SecurityException extends GeneralSecurityException
{
   private static final long serialVersionUID = -863526348785725191L;

   public SecurityException()
   {
      super(); 
   }

   public SecurityException(String message, Throwable cause)
   {
      super(message, cause); 
   }

   public SecurityException(String msg)
   {
      super(msg); 
   }

   public SecurityException(Throwable cause)
   {
      super(cause); 
   }
}
