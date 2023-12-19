/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

import java.io.IOException;

/**
 *
 * @author GORKEM
 */
public class Hafta_13_Throw {
    public static void yaskontrol(int y)throws IOException{
        if(y<18){
            throw new IOException();
            
        }else{
            System.out.println("Hoşgeldiniz");
        }
        
        
    }
    public static void main(String[] args) {
        
    }
}
