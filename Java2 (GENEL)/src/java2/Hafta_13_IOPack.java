/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

/**
 *
 * @author GORKEM
 */
public class Hafta_13_IOPack {
    public static void main(String[] args) {
        
    
try{
        int[]s={1,2,3,4,5};
            System.out.println(s[8]);
    int a=5/0;  
}
    catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dizinin boyutunu aştınız");
}
    catch(ArithmeticException e){
            System.out.println("Sayı sıfıra bölünmez");
            
}
    catch(Exception e){
        System.out.println("Bir hata var");
        
}
finally{
    System.out.println("Finally mutlaka çalışması istenen koddur");
}
        System.out.println("Kod satırı çalışmaya devam ediyor.");
}
}
