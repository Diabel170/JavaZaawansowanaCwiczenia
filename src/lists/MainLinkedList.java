package lists;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(); //jeden element przechowuje informacje o drugim; get pochodzi z listy; linkedlista nie wysypuje dziedziczenia; można pobrać 3 czy 4 element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0, 100);
        list.push(3);//na góre

        for (Integer integer : list) {
            System.out.println(integer); //w liscie masz odwolanie wprost do tego elementu, w linkedliscie musi statystycznie przekopać 1/4 elementów
        }
    }
}
