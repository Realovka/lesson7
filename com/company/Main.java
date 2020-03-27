package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Задача из дз 7 урок про Map
public class Main {


    public static void main(String[] args) {
        HashMap <String, String> vocabulary = new HashMap<>();
        vocabulary.put("массив","структура данных, хранящая набор значений (элементов массива), " +
                        "идентифицируемых по индексу или набору индексов, принимающих целые (или приводимые к целым) " +
                        "значения из некоторого заданного непрерывного диапазона.");
        vocabulary.put("компилятор","это программа, которая преобразует исходные части программ," +
                " написанные на языке программирования высокого уровня, в программу на машинном языке, “понятную” компьютеру.\n");
        vocabulary.put("наследование","механизм, позволяющий создать новый класс из существующих классов.");
        Scanner word=new Scanner(System.in);
        String var_word;
        System.out.println("Введите слово массив или компилятор или наследование");
        var_word=word.nextLine();

        for (Map.Entry<String,String>entry:vocabulary.entrySet()){
            if (var_word.equalsIgnoreCase(entry.getKey())){
                System.out.print(entry.getValue());
            }
        }
    }
}
