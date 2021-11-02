package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        int count = 0;
        String space = "";
        for(int i = 0; i < columns; i++){
            for(int j = 0;j < rows; j++){
                count += 1;
                space = new String(new char[Integer.toString(columns*rows).length()-Integer.toString(count).length()]).replace("\0", " ");
                System.out.print(count + space);
            }
            System.out.print("\n");
        }
    }
}
