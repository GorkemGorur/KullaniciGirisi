/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

/**
 *
 * @author GORKEM
 */
public class Hafta_10_Foreach {
    public static void main(String[] args) {
        String[] dersler={"Java","Python","C#"};
        for(String d:dersler){
            System.out.println(d);            
        }
        int[]sayi={1,12,23,34,45,56};
        for(int a:sayi){
            System.out.println(a);
        }
    }
}
