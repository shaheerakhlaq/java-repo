package com.webclient;

/**
 * @author MSA
 * @version 1.0
 */

public interface WebClient {
    String get();

    static WebClient create(String baseUrl) {
        return new DefaultWebClientBuilder().baseUrl(baseUrl).build();
    }

    static WebClient.Builder builder() {
        return new DefaultWebClientBuilder();
    }

    interface Builder {
        WebClient.Builder baseUrl(String baseUrl);

        WebClient.Builder defaultUsername(String baseUrl);

        WebClient.Builder defaultPassword(String baseUrl);

        WebClient.Builder clone();

        WebClient build();
    }
}