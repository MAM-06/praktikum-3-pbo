/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author MAM
 */
public class Pembetulan {
    
public static void main(String[] args) {
    int a [] = new int[5];
    try{
        a[5]=100;
    }
    catch(Exception e){
        System.out.println("Terjadi pelanggaran memory");
    }

  }
}