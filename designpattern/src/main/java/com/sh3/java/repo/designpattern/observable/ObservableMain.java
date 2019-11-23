package com.sh3.java.repo.designpattern.observable;

public class ObservableMain {
	public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver((obj, arg) -> {
            System.out.println("Received response: " + arg);
        });

        new Thread(eventSource).start();
    }
}
