package com.felfeit.mycalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");

        System.out.print("Masukkan angka pertama: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        String op = scanner.next();

        System.out.print("Masukkan angka kedua: ");
        double b = scanner.nextDouble();

        double hasil;
        switch (op) {
            case "+" -> hasil = a + b;
            case "-" -> hasil = a - b;
            case "*" -> hasil = a * b;
            case "/" -> hasil = b != 0 ? a / b : Double.NaN;
            default -> {
                System.out.println("Operator tidak dikenali.");
                return;
            }
        }

        System.out.println("Hasil: " + hasil);
    }
}
