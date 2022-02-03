package Ejercicio3;


import java.util.*;

public  class PaisController {
    private HashMap<String, Pais> listaPaises1 = new HashMap<>();
    private HashMap<String, Pais> listaPaises2 = new HashMap<>();

    public PaisController(){
        listaPaises1.put("BOL", new Pais("Bolivia", "Sudamerica", 11673029));
        listaPaises1.put("NIG", new Pais("Nigeria", "Sudamerica", 206139587));
        listaPaises1.put("JAP", new Pais("Japon","Asia", 126167000));
        listaPaises1.put("FRA",new Pais("Francia", "Europa",65503950));
        listaPaises1.put("ITA",new Pais("Italia", "Europa",60549922));
        listaPaises1.put("UCR",new Pais("Ucrania", "Europa",  43698727));

        listaPaises2.put("AUS", new Pais("Australia", "Oceania", 25694000));
        listaPaises2.put("ESP", new Pais("España", "Europa", 47326687));
        listaPaises2.put("USA", new Pais("Estados Unidos", "Noramerica", 329770000));
        listaPaises2.put("RUS",new Pais("Rusia", "Europa", 145965081));
        listaPaises2.put("ALE",new Pais("Alemania", "Europa", 83705450));
        listaPaises2.put("REI",new Pais("Reino Unido", "Europa",83149300));

    }

    public void sort(){
        sortForContinent(listaPaises1, listaPaises2);
    }

    public void sortForContinent(HashMap<String, Pais> list1, HashMap<String, Pais> list2){
        list1.putAll(list2);
        sortByValue(list1);
    }

    private void sortByValue(HashMap<String, Pais> list) {
        System.out.println("-".repeat(84));
        System.out.printf("|%-20s|%-40s|%-20s|\n", "CLAVE", "PAIS", "CONTINENTE");
        System.out.println("-".repeat(84));
        list.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(x -> System.out.printf("|%-20s|%-40s|%-20s|\n", x.getKey(), x.getValue().getNombre(), x.getValue().getContinente()));
        System.out.println("-".repeat(84));
    }
}
