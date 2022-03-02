package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 5;

        switch (number) {
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }

        String name = "Daniyar";
        switch (name) {
            case "Aidar":
                System.out.println("Hi Aidar");
                break;
            case "Daniyar":
                System.out.println("Hi Daniyar");
                break;
            case "Kyyal":
                System.out.println("Hi Kyyal");
                break;
            default:
                System.out.println("Hi unknown");
        }
    }
}
