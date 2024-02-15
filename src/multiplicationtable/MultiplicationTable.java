package multiplicationtable;

import java.util.Scanner;

/**
 *
 * @author tobio
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int table;

        System.out.println("What multiplication table do you want to display? ");
        table = console.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }

}
