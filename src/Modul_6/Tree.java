/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_6;

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
    
    
//    public boolean find(int A) {
//        TreeNode temp = this.root;
//        
//        while ( temp != null) {
//            if (temp.getData() < A) {
//                temp = temp.getrightNode();
//            } else if (temp.getData() > A) {
//                temp = temp.getleftNode();
//            } else { 
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    
//    public void LevelOrder() {
//        Queue<TreeNode> O = new LinkedList<>();
//        O.add (root);
//        
//        while (!O.isEmpty()) {
//            TreeNode temp = O.poll();
//            System.out.print(temp.getData()+" ");
//            if (temp.getleftNode() != null) 
//                O.add (temp.getleftNode());
//            if (temp.getrightNode() != null)
//                O.add (temp.getrightNode());
//        }
//    }
//    
//    
//    public void preOrder(TreeNode localRoot) {
//	if(localRoot != null) {
//		System.out.print(localRoot.getData()+" ");
//		preOrder(localRoot.getleftNode());
//		preOrder(localRoot.getrightNode());
//	}
//    }
//
//    
//    public void inOrder(TreeNode localRoot) {
//	if(localRoot != null) {
//		inOrder(localRoot.getleftNode());
//		System.out.print(localRoot.getData()+" ");
//		inOrder(localRoot.getrightNode());
//	}
//    }
//
//    
//    public void postOrder(TreeNode localRoot) {
//	if(localRoot != null) {
//		postOrder (localRoot.getleftNode());
//		postOrder (localRoot.getrightNode());
//                                     System.out.print(localRoot.getData()+" ");
//	}
//    }
//
//    
//    public boolean delete(int data){
//        TreeNode parent = root;
//        TreeNode temp = root;
//        
//        while(temp != null){
//            if (data < temp.getData()) {
//                parent = temp;
//                temp = temp.getleftNode();
//            } else if (data > temp.getData()) {
//                parent = temp;
//                temp = temp.getrightNode();
//            } else {
//                if (temp.getleftNode() == null && temp.getrightNode() == null) {
//                    if (data < parent.getData()) {
//                        parent.setleftNode(null);
//                    } else if (data > parent.getData()){
//                        parent.setrightNode(null);
//                    } else {
//                        root = null;
//                    }          
//                } else if (temp.getleftNode() == null && temp.getrightNode() != null) {
//                    if (data < parent.getData()) {
//                        parent.setleftNode(temp.getrightNode());
//                    } else if (data > parent.getData()) {
//                        parent.setrightNode(temp.getrightNode());
//                    } else {
//                        root = temp.getrightNode();
//                    }
//                } else if (temp.getleftNode() != null && temp.getrightNode() == null) {
//                    if (data < parent.getData()) {
//                        parent.setleftNode(temp.getleftNode());
//                    } else if (data > parent.getData()) {
//                        parent.setrightNode(temp.getleftNode());
//                    } else {
//                        root = temp.getleftNode();
//                    }
//                } else if (temp.getleftNode() != null && temp.getrightNode() != null) {
//                    TreeNode successor = successor(temp);
//                    if (temp == root) {
//                        root = successor;
//                    } else if (temp == parent.getleftNode()) {
//                        parent.setleftNode(successor);
//                    } else{
//                        parent.setrightNode(successor);
//                    }
//                    successor.setleftNode(temp.getleftNode());
//                }
//                return true;
//            }
//        }
//        return false;
//    }
    
    public TreeNode successor(TreeNode node) {
        TreeNode successor = null;
        TreeNode successorParent = null;
        TreeNode temp = node.getrightNode();
        while (temp != null) {
            successorParent = successor;
            successor = temp;
            temp = temp.getleftNode();
        } if (successor != node.getrightNode()) {
            successorParent.setleftNode(successor.getrightNode());
            successor.setrightNode(node.getrightNode());
        }
        return successor;
    }
    
    public TreeNode predecessor(TreeNode node) {
        TreeNode predecessor = null;
        TreeNode predecessorParent = null;
        TreeNode temp = node.getleftNode();
        while (temp != null) {
            predecessorParent = predecessor;
            predecessor = temp;
            temp = temp.getleftNode();
        } if (predecessor != node.getleftNode()) {
            predecessorParent.setleftNode(predecessor.getrightNode());
            predecessor.setrightNode(node.getrightNode());
        }
        return predecessor;
    }
    
    public TreeNode findMin(TreeNode node) {
    while (node.getleftNode() != null) {
        node = node.getleftNode();
    }
    return node;
}

public TreeNode findMax(TreeNode node) {
    while (node.getrightNode() != null) {
        node = node.getrightNode();
    }
    return node;
}

public int size(TreeNode node) {
    if (node == null) {
        return 0;
    }
    return 1 + size(node.getleftNode()) + size(node.getrightNode());
}

public boolean isCompleteTree(TreeNode root) {
    if (root == null) {
        return true;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean nonFullNodeFound = false;

    while (!queue.isEmpty()) {
        TreeNode current = queue.poll();

        if (current == null) {
            nonFullNodeFound = true;
        } else {
            if (nonFullNodeFound) {
                return false; 
            }
            queue.offer(current.getleftNode());
            queue.offer(current.getrightNode());
        }
    }
    return true;
}

public int getHeight(TreeNode node) {
        if (node == null) {
            return -1; 
        } else {
            int leftHeight = getHeight(node.getleftNode());
            int rightHeight = getHeight(node.getrightNode());
            
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
}
