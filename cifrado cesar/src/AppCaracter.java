import java.io.File;

import java.io.FileWriter;
import java.util.Scanner;

public class AppCaracter {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        File ficheroEntrada;
        File ficheroSalida;

        String nombreEntrada;
        String rutaSalida;

        int desplazamiento;
         do {
            System.out.println("Introduce el desplazamiento entre -25 y 25:");
            desplazamiento = teclado.nextInt();
            teclado.nextLine();
        } while (desplazamiento < -25 || desplazamiento > 25);