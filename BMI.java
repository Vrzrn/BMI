/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanukl;

import java.util.Scanner;

/**
 *
 * @author mokle
 */
public class bmi {
    public static void main(String[] args) {
        float beratBadan, tinggiBadan, BMI;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Berat Badan: ");
        beratBadan = scan.nextFloat();
        
        System.out.print("Masukkan Tinggi Badan: ");
        tinggiBadan = scan.nextFloat();
        
        tinggiBadan = tinggiBadan*tinggiBadan;
        BMI = beratBadan/tinggiBadan;
        
        System.out.println("BMI anda: "+BMI);
        
        if(BMI<18.5){
            System.out.println("Kurang berat badan");
    }else if(BMI<=22.9){
        System.out.println("Normal");
    }else if(BMI<=24.9){
        System.out.println("Kelebihan berat badan");
    }else if(BMI<=29.9){
        System.out.println("obesitas tingkat 1");
    }else if(BMI>30){
        System.out.println("obesitas tingkat 2");
    }
    }
}
