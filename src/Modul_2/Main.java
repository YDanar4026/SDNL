/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner H = new Scanner(System.in);
       Tree V = new Tree();
       
       V.insert(42);
       V.insert(21);
       V.insert(38);
       V.insert(27);
       V.insert(71);
       V.insert(82);
       V.insert(55);
       V.insert(63);
       V.insert(6);
       V.insert(2);
       V.insert(40);
       V.insert(12);
     
        System.out.println("In order traversal");
        V.inOrder(V.getRoot());
        System.out.println("");
        System.out.println("Pre order traversal");
        V.preOrder(V.getRoot());
        System.out.println("");
        System.out.println("Post order traversal");
        V.postOrder(V.getRoot());
        System.out.println("");
        System.out.println("Level order");
        V.LevelOrder();
        
        System.out.println("");
        System.out.print("Cari angka: ");
        int Y = H.nextInt();
        if (V.find(Y) == true) {
            System.out.println("ketemu");
        } else if (V.find(Y) == false) {
                System.out.println("tidak ketemu");
        }

        
    }
}
