package Ejercicio1_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fibonacci {
    private ArrayList<Integer> serie;
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void generarSerie(int n) {
        serie = new ArrayList<>();
        int a = 0,   b = 1;
        String res = "";
        for (int i = 1; i <= n; i++) {
            serie.add(a);
            res += a + " ";
            a = a + b;
            b = a - b;
        }
        System.out.println("Serie Fibonacci de tamaño n: \n" + res);
    }

    
    public void printSerie(){
        serie.forEach((e) -> {
            System.out.printf( e + " ");
        });
        System.out.print("\n");
    }

    private void convertALtoLL(){
        serie.forEach((e) -> {
            linkedList.add(e);
        });
    }

    public void getFirstLast() {
        convertALtoLL();
        System.out.println("First: "+ linkedList.getFirst());
        System.out.println("Last: "+ linkedList.getLast());
    }
}
