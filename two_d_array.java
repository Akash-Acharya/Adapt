package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = 2 , cols = 3 , i ,j ;
        String [][] details = new String[rows][cols];
        int size = details.length;
        for (i = 0; i < rows; i++){
            for (j = 0; j < cols; j++){
                //String input;
                //details[i][j]= sc.nextLine();
                String temp = br.readLine();
                details[i][j]= temp;
            }
        }
        for(i = 0; i < rows ; i++){
            for(int k = i+1 ; k < rows ; k++ ){
                j = 0;
                if(details[i][j].compareTo(details[k][j])>0){
                      System.out.println("True");
                    String[] temp = details[i];
                    details[i ]= details[k];
                    details[k] = temp;
                }
                else {
                    System.out.println("Not true...");
                }
            }
        }
        for (i = 0 ; i < rows; i++) {
            for (j = 0 ; j < cols; j++) {
                System.out.print(details[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
