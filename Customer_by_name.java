package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer_by_name {

    String details[][] = new String[2][3];
    Customer_by_name(){
        details[0][0] = "1001";
        details[0][1] = "Akash";
        details[0][2] = "Bls";
        details[1][0] = "1000";
        details[1][1] = "Biku";
        details[1][2] = "BBS";
    }
    public static void main(String args[]) throws Exception{
        int i =0 , j = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name");
        String temp = br.readLine();
        Customer_by_name obj = new Customer_by_name();
        int size = obj.details.length;
        int count = 0 ;
        //System.out.println(size);
        for (i = 0 ; i < size ; i++){
            if(obj.details[i][j].compareTo(temp)==0){
                System.out.println(obj.details[i][j-1]);
                System.out.println(obj.details[i][j]);
                System.out.println(obj.details[i][j+1]);
                count = 1 ;
                break;
            }
        }
        if(count == 1){
            //System.out.println("");
        }
        else{
            System.out.println("No Record Found");
        }
    }
}
