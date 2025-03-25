package com.shr.java.repo.web.client;

/**
 * @author MSA
 * @version 1.0
 */

public class DefaultWebClientBuilder implements WebClient.Builder {
    private String baseUrl;
    private String defaultUsername;
    private String defaultPassword;

    public DefaultWebClientBuilder() {
    }

    public DefaultWebClientBuilder(DefaultWebClientBuilder builder) {
        this.baseUrl = builder.baseUrl;
        this.defaultUsername = builder.defaultUsername;
        this.defaultPassword = builder.defaultPassword;
    }

    public WebClient.Builder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public WebClient.Builder defaultUsername(String defaultUsername) {
        this.defaultUsername = defaultUsername;
        return this;
    }

    public WebClient.Builder defaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
        return this;
    }

    public WebClient.Builder clone() {
        return new DefaultWebClientBuilder(this);
    }

    public WebClient build() {
        return new DefaultWebClient(new DefaultWebClientBuilder(this));
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getDefaultUsername() {
        return defaultUsername;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }
}