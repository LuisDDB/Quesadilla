/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author alumnog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el texto");
        String oracion = entrada.nextLine();
        // String nuevaOracion = oracion.replace("m", "s").replace("M", "s");
        //System.out.println(nuevaOracion);

        String[] numTelefonos = oracion.replace(" ", "").replace("(", "").replace(")", "").replace("-", "").split(",");
        int tijuana = 0;
        int guaymas = 0;
        int hermosilla = 0;
        int desconocido = 0;
        for (String a : numTelefonos) {
            if (a.startsWith("622")) {
                guaymas++;
            } else if (a.startsWith("662")) {
                hermosilla++;
            } else if (a.startsWith("664")) {
                tijuana++;
            } else {
                desconocido++;
            }

        }

        System.out.println("total de telefonos de guaymas. "+ guaymas);
        System.out.println("total de telefonos de Tijuana: "+ tijuana);
        System.out.println("total de telefonos de Hermosillo: "+ hermosilla);
        System.out.println("total de telefonos desconocido: "+ desconocido);

    }

}
