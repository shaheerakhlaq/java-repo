package com.shr.java.repo.web.client;

/**
 * @author MSA
 * @version 1.0
 */

public class DefaultWebClient implements WebClient {
    private DefaultWebClientBuilder defaultWebClientBuilder;

    public DefaultWebClient(DefaultWebClientBuilder defaultWebClientBuilder) {
        this.defaultWebClientBuilder = defaultWebClientBuilder;
    }

    public String get() {
        return "DefaultWebClientBuilder{" +
                "baseUrl='" + defaultWebClientBuilder.getBaseUrl() + '\'' +
                ", defaultUsername='" + defaultWebClientBuilder.getDefaultUsername() + '\'' +
                ", defaultPassword='" + defaultWebClientBuilder.getDefaultPassword() + '\'' +
                '}';
    }
}