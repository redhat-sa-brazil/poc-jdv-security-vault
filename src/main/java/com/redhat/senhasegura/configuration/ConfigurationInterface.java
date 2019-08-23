package com.redhat.senhasegura.configuration;

public interface ConfigurationInterface {

	String getURL();

	void setURL(String uRL);

	String getACCESS_TOKEN_PATH();

	void setACCESS_TOKEN_PATH(String aCCESS_TOKEN_PATH);

	String getAUTORIZATION_TOKEN_PATH();

	void setAUTORIZATION_TOKEN_PATH(String aUTORIZATION_TOKEN_PATH);

	String getCLIENT_ID();

	void setCLIENT_ID(String cLIENT_ID);

	String getACCESS_TOKEN();

	void setACCESS_TOKEN(String aCCESS_TOKEN);

	String getEXPIRE_TOKEN();

	void setEXPIRE_TOKEN(String eXPIRE_TOKEN);

}