package com.christan.javaclassesgenerator;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try {
        	 // Cambia esto a la ruta de tu archivo XSD
            String xsdPath = "schemas/LROE_PF_140_1_1_Ingresos_ConfacturaConSG_AltaPeticion_V1_0_2.xsd";
            String outputDir = "src/main/java/com/christan/javaclassesgenerator/bizkaia/alta"; // Cambia esto a la ruta donde quieres que se generen las clases

            ProcessBuilder pb = new ProcessBuilder("xjc", "-d", outputDir, xsdPath);
            pb.inheritIO();  // Esto es para que puedas ver cualquier salida (como errores) en la consola
            Process process = pb.start();

            int exitCode;
            try {
                exitCode = process.waitFor();
                if (exitCode == 0) {
                    System.out.println("Generación exitosa!");
                } else {
                    System.out.println("Ocurrió un error durante la generación. Código de salida: " + exitCode);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
