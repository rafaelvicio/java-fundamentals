package br.com.rafaeldev.variables;

import javafx.scene.chart.ValueAxis;

/**
 * Created by STEFANINI on 19/06/2017.
 */
public class Main {

    public static void main(String[] args){

        // Variaveis

        int dataValue;
        dataValue = 100;

        int myInfo = 200;

        // Operações

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

    }
}
