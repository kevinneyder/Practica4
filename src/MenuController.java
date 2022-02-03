import Ejercicio1_2.Fibonacci;
import Ejercicio3.PaisController;

import java.util.Scanner;

public class MenuController {
    private Fibonacci fibonacci = new Fibonacci();
    private PaisController paisController = new PaisController();

    public void printMenu(){
        System.out.println("Bienvenido");
        menuOpciones();
    }

    private void menuOpciones(){
        boolean b = true;
        int seleccion;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Generar n numeros fibonacci");
        System.out.println("2. Ver serie generada");
        System.out.println("3. Ver primer y ultimo valor serie fibonacci");
        System.out.println("4. Ordenar HashMap por continente");
        System.out.println("0. Salir");
        seleccion = sc.nextInt();
        switch (seleccion){
            case 0:
                System.out.println("End...");
                break;
            case 1:
                System.out.println("Ingrese el tamaño: ");
                fibonacci.generarSerie(sc.nextInt());
                menuOpciones();
                break;
            case 2:
                fibonacci.printSerie();
                menuOpciones();
                break;
            case 3:
                fibonacci.getFirstLast();
                menuOpciones();
                break;
            case 4:
                paisController.sort();
                menuOpciones();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
