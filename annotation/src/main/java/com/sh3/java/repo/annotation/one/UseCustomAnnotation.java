package com.sh3.java.repo.annotation.one;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * @author MSA
 * @version 1.0
 */

public class UseCustomAnnotation {
    public static void main(String[] args) {
        Class<SetCustomAnnotation> classObject = SetCustomAnnotation.class;

        readAnnotation(classObject);
    }

    static void readAnnotation(AnnotatedElement element) {
        try {
            System.out.println("Annotation element values: \n");

            if (element.isAnnotationPresent(TypeHeader.class)) {
                // getAnnotation returns Annotation type
                Annotation singleAnnotation = element.getAnnotation(TypeHeader.class);
                TypeHeader header = (TypeHeader) singleAnnotation;

                System.out.println("Developer: " + header.developer());
                System.out.println("Last Modified: " + header.lastModified());

                // teamMembers returned as String []
                System.out.print("Team members: ");

                for (String member : header.teamMembers()) {
                    System.out.print(member + ", ");
                }

                System.out.print("\n");

                System.out.println("Meaning of Life: " + header.meaningOfLife());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}