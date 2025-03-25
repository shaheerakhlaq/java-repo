package com.shr.java.repo.web.client;

/**
 * @author MSA
 * @version 1.0
 */

public class WebClientApplication {
    public static void main(String[] args) {
        webClient();
    }

    public static void webClient() {
        WebClient webClient = WebClient.builder().baseUrl("http")
                .defaultUsername("username")
                .defaultPassword("password")
                .build();

        System.out.println("webClient: "+ webClient.get());
    }
}