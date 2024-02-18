/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

import java.util.Queue;
import java.util.LinkedList;

public class Tree {
    private TreeNode root;
    
    public Tree() {
    }
    
    
    public TreeNode getRoot() {
        return root;
    }
    
    
    public void setRoot(TreeNode root) {
        this.root = root;
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
    
    
    public boolean find(int A) {
        TreeNode temp = this.root;
        
        while ( temp != null) {
            if (temp.getData() < A) {
                temp = temp.getrightNode();
            } else if (temp.getData() > A) {
                temp = temp.getleftNode();
            } else { 
                return true;
            }
        }
        return false;
    }
    
    
    public void LevelOrder() {
        Queue<TreeNode> O = new LinkedList<>();
        O.add (root);
        
        while (!O.isEmpty()) {
            TreeNode temp = O.poll();
            System.out.print(temp.getData()+" ");
            if (temp.getleftNode() != null) 
                O.add (temp.getleftNode());
            if (temp.getrightNode() != null)
                O.add (temp.getrightNode());
        }
    }
    
    
    public void preOrder(TreeNode localRoot) {
	if(localRoot != null) {
		System.out.print(localRoot.getData()+" ");
		preOrder(localRoot.getleftNode());
		preOrder(localRoot.getrightNode());
	}
    }

    
    public void inOrder(TreeNode localRoot) {
	if(localRoot != null) {
		inOrder(localRoot.getleftNode());
		System.out.print(localRoot.getData()+" ");
		inOrder(localRoot.getrightNode());
	}
    }

    
    public void postOrder(TreeNode localRoot) {
	if(localRoot != null) {
		postOrder (localRoot.getleftNode());
		postOrder (localRoot.getrightNode());
                                     System.out.print(localRoot.getData()+" ");
	}
    }

    
    public boolean delete(int data) {
        TreeNode temp = this.root;
        TreeNode parent = this.root;
        
        while(temp != null) {
            if(data < temp.getData()) {
                parent = temp;
                temp = temp.getleftNode();
            } else if(data > temp.getData()) {
                parent = temp;
                temp = temp.getrightNode();
            } else {
                if(temp.getleftNode()==null && temp.getrightNode()==null) {
                    if(data < parent.getData()) {
                        parent.setleftNode(null);
                    } else {
                        parent.setrightNode(null);
                    }
                } else if(temp.getleftNode()==null && temp.getrightNode()!=null) {
                    if(data < parent.getData()) {
                        parent.setleftNode(temp.getrightNode());
                    } else {
                        parent.setrightNode(temp.getrightNode());
                    }
                } else if(temp.getleftNode()!=null && temp.getrightNode()==null) {
                    if(data < parent.getData()) {
                        parent.setleftNode(temp.getleftNode());
                    } else {
                        parent.setrightNode(temp.getleftNode());
                    }
                }
            }
        }
        return true;
    }
    
    
}
