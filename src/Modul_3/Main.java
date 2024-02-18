/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_3;

public class Main {

    public static void main(String[] args) {
       Tree V = new Tree();
       
       V.insert(56);
       V.insert(30);
       V.insert(40);
       V.insert(22);
       V.insert(70);
       V.insert(95);
       V.insert(60);
       V.insert(65);
       V.insert(11);
       V.insert(16);
       V.insert(63);
       V.insert(67);
       V.insert(3);
       V.insert(37);
       V.insert(88);
     
        
        V.delete(100);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(63);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(65);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(60);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(95);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(88);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(67);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(70);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(56);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(22);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(16);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(11);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(3);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(30);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(40);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
        
        V.delete(37);
        System.out.println("In Order");
        V.inOrder(V.getRoot());
        System.out.println("");
    }
}
