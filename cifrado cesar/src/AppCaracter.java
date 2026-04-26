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
        do {
            System.out.println("Introduce el nombre del fichero de entrada:");
            nombreEntrada = teclado.nextLine();

            ficheroEntrada = new File("src/ficheros/" + nombreEntrada);

            if (!ficheroEntrada.exists()) {
                System.out.println("El fichero no existe.");
            }
        } while (!ficheroEntrada.exists());
          do {
              System.out.println("Introduce la ruta absoluta del fichero de salida:");
              rutaSalida = teclado.nextLine();
  
              ficheroSalida = new File(rutaSalida);
  
              if (ficheroSalida.exists()) {
                  System.out.println("El fichero de salida ya existe.");
              }
  
          } while (ficheroSalida.exists());
           System.out.println("El fichero de salida ya existe.");
            }

        }while(ficheroSalida.exists());
FileReader lector = new FileReader(ficheroEntrada);
        FileWriter escritor = new FileWriter(ficheroSalida);

        int caracterInt;
        