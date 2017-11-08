package com.concretepage.entity;

public class ApplicationConfig {
    private String mpesaUrl;
    private String meBankUrl;
    private String encyptKey;
    private String encyptIv;
    private String appId;
    private String appPassword;
     
    public String getMpesaUrl() {
        return mpesaUrl;
    }
    public void setMpesaUrl(String mpesaUrl) {
        this.mpesaUrl = mpesaUrl;
    }
    public String getMeBankUrl() {
        return meBankUrl;
    }
    public void setMeBankUrl(String meBankUrl) {
        this.meBankUrl = meBankUrl;
    }
    public String getEncyptKey() {
        return encyptKey;
    }
    public void setEncyptKey(String encyptKey) {
        this.encyptKey = encyptKey;
    }
    public String getEncyptIv() {
        return encyptIv;
    }
    public void setEncyptIv(String encyptIv) {
        this.encyptIv = encyptIv;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getAppPassword() {
        return appPassword;
    }
    public void setAppPassword(String appPassword) {
        this.appPassword = appPassword;
    }

    @Override
    public String toString(){
        return mpesaUrl+"|"+meBankUrl+"|"+encyptKey+"|"+appId+"|"+appPassword;
    }
}
