/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_4;

public class TreeNode {
    private int iData;
    private TreeNode leftNode;
    private TreeNode rightNode;
    
    public TreeNode(int D){
        iData = D;
        leftNode = null;
        rightNode = null;
    }
    
    public int getData(){
        return iData;
    }
    
    public void setData(int D){
        iData = D;
    }
    
    public TreeNode getleftNode(){
        return leftNode;
    }
    
    public void setleftNode(TreeNode N){
        leftNode = N;
    }
    
    public TreeNode getrightNode(){
        return rightNode;
    }
    
    public void setrightNode(TreeNode N){
        rightNode = N;
    }
    
}
