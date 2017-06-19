package br.com.rafaeldev.conditional;

/**
 * Created by STEFANINI on 19/06/2017.
 */
public class Main {

    public static void main(String[] args){

        // Conditional Assignment

       int v1 = 7;
       int v2 = 5;

       int vMax = v1 > v2 ?v1 : v2;

       System.out.println(vMax);

       float students = 30;
       float rooms = 4;

       float studentsPerRom = rooms == 0.0f ? 0.0f : students/rooms;

        System.out.println(studentsPerRom);

    }
}
