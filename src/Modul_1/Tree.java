/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;

public class Tree {
    
    private TreeNode root;
    
    public Tree() {
    }
    
    
    public TreeNode Tree(TreeNode N) {
        return root;
    }
    
    
    public void insert(int A) {
        TreeNode X = new TreeNode(A);
        
        if (root == null) {
            root = X;
        } else {
            TreeNode S = root;
            while(true) {
                if(X.getData() < S.getData()) {
                    if (S.getleftNode() == null) {
                        S.setleftNode(X);
                        return;
                    } else {
                        S = S.getleftNode();
                    }
                } else {
                    if (S.getrightNode() == null) {
                        S.setrightNode(X);
                        return;
                    } else {
                        S = S.getrightNode();
                    }
                }
            }
        }
    }
    
//    public boolean find(int search) {
//        TreeNode temp = this.root;
//        while ( temp != null) {
//            if (temp.getData() < search) {
//                temp = temp.getrightNode();
//            } else if (temp.getData() > search) {
//                temp = temp.getleftNode();
//            } else { 
//                return true;
//            }
//        }
//        return false;
//    }
   
}
