/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_6;

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
       
       
        TreeNode root = V.getRoot();

        TreeNode minValueNode = V.findMin(root);
        TreeNode maxValueNode = V.findMax(root);

        System.out.println("Nilai Minimum: " + minValueNode.getData());
        System.out.println("Nilai Maximum: " + maxValueNode.getData());

        int treeSize = V.size(root);
        System.out.println("Size: " + treeSize);
        
        boolean isComplete = V.isCompleteTree(root);

        if (isComplete) {
            System.out.println("tree adalah complete binary tree.");
        } else {
            System.out.println("tree bukanlah complete binary tree.");
        }
        
        int nodeHeight1 = V.getHeight(root.getleftNode());
        System.out.println("Tinggi subtree kiri: " + nodeHeight1);
        
        int nodeHeight2 = V.getHeight(root.getrightNode());
        System.out.println("tinggi subtree kanan: " + nodeHeight2);
  

    }
}
