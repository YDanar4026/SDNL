/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_4;

public class Main {

    public static void main(String[] args) {
       Tree V = new Tree();
       
       V.insert(60);
       V.insert(55);
       V.insert(100);
       V.insert(107);
       V.insert(67);
       V.insert(105);
       V.insert(57);
       V.insert(45);
       V.insert(59);
       V.insert(106);
       V.insert(43);
       
       
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(100);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(55);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(60);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(57);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(67);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(105);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(106);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(59);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        
    }
}
