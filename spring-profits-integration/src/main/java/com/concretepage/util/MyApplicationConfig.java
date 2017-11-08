package com.concretepage.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
 
import com.concretepage.entity.ApplicationConfig;
 
@Configuration
@PropertySource("classpath:/application.properties")
public class MyApplicationConfig {
 
    @Autowired
    Environment env;
     
    @Bean(name="appConfig")
    public ApplicationConfig getAppConfig(){
         
    	ApplicationConfig appConf = new ApplicationConfig();
    	appConf.setMeBankUrl(env.getProperty("me.bank.url"));
    	appConf.setMpesaUrl(env.getProperty("mpesa.url"));
    	appConf.setAppId(env.getProperty("me.bank.app.id"));
    	appConf.setAppPassword(env.getProperty("me.bank.app.password"));
    	appConf.setMpesaUrl(env.getProperty("mpesa.url"));
    	appConf.setEncyptKey(env.getProperty("me.bank.encryption.key"));
    	appConf.setEncyptIv(env.getProperty("me.bank.encryption.iv"));
    	
        return appConf;
    }
}
