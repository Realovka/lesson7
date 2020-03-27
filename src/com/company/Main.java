package com.company;
// дз 7 занятие. про List и Set

import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Customer> customerArrayList= new ArrayList<>();
        List<Customer> customerLinkedList= new LinkedList<>();
        Set<Customer> customerHashSet = new HashSet<>();
        Set<Customer> customerLinkedHashSet = new LinkedHashSet<>();



        Customer costomer1 = new Customer("Вася", "Пупкин", "Ульяновская-49", "1236578");
        Customer costomer2 = new Customer("Петя", "Иванов", "50летВЛКСМ-18", "1568822");
        Customer costomer3 = new Customer("Иван", "Петров", "Ленина-5", "1236655");
        Customer costomer4 = new Customer("Вася", "Пупкин", "Ульяновская-49", "1236578");

        customerArrayList.add(costomer1);
        customerArrayList.add(costomer2);
        customerArrayList.add(costomer3);
        customerArrayList.add(costomer4);
        System.out.println(customerArrayList);

        System.out.println();



        customerLinkedList.add(costomer1);
        customerLinkedList.add(costomer2);
        customerLinkedList.add(costomer3);
        customerLinkedList.add(costomer4);
        System.out.println(customerLinkedList);

        System.out.println();

        customerHashSet.add(costomer1);
        customerHashSet.add(costomer2);
        customerHashSet.add(costomer3);
        customerHashSet.add(costomer4);
        System.out.println(customerHashSet);

        System.out.println();

        customerLinkedHashSet.add(costomer1);
        customerLinkedHashSet.add(costomer2);
        customerLinkedHashSet.add(costomer3);
        customerLinkedHashSet.add(costomer4);
        System.out.println(customerLinkedHashSet);

        System.out.println();



    }
}


//
