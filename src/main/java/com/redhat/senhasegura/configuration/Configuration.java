package com.redhat.senhasegura.configuration;

public class Configuration implements ConfigurationInterface {
	
	private  String URL ;
	private  String ACCESS_TOKEN_PATH;
	private  String AUTORIZATION_TOKEN_PATH;
	private  String CLIENT_ID;
	private  String ACCESS_TOKEN;
	private  String EXPIRE_TOKEN;
	
	private static Configuration uniqueInstance = new Configuration();
	
	private Configuration() {
		
	}
	
	public static Configuration getInstance() {
        return uniqueInstance;
    }
	
	
	@Override
	public String getURL() {
		return URL;
	}
	@Override
	public void setURL(String uRL) {
		URL = uRL;
	}
	@Override
	public String getACCESS_TOKEN_PATH() {
		return ACCESS_TOKEN_PATH;
	}
	@Override
	public void setACCESS_TOKEN_PATH(String aCCESS_TOKEN_PATH) {
		ACCESS_TOKEN_PATH = aCCESS_TOKEN_PATH;
	}
	@Override
	public String getAUTORIZATION_TOKEN_PATH() {
		return AUTORIZATION_TOKEN_PATH;
	}
	@Override
	public void setAUTORIZATION_TOKEN_PATH(String aUTORIZATION_TOKEN_PATH) {
		AUTORIZATION_TOKEN_PATH = aUTORIZATION_TOKEN_PATH;
	}
	@Override
	public String getCLIENT_ID() {
		return CLIENT_ID;
	}
	@Override
	public void setCLIENT_ID(String cLIENT_ID) {
		CLIENT_ID = cLIENT_ID;
	}
	@Override
	public String getACCESS_TOKEN() {
		return ACCESS_TOKEN;
	}
	@Override
	public void setACCESS_TOKEN(String aCCESS_TOKEN) {
		ACCESS_TOKEN = aCCESS_TOKEN;
	}
	@Override
	public String getEXPIRE_TOKEN() {
		return EXPIRE_TOKEN;
	}
	@Override
	public void setEXPIRE_TOKEN(String eXPIRE_TOKEN) {
		EXPIRE_TOKEN = eXPIRE_TOKEN;
	}

	
}
	
	
