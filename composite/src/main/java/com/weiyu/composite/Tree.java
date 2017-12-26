package com.weiyu.composite;

/**
 * @author weiyu@gomeholdings.com
 * @description 组合模式
 * @create 2017/6/26
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB= new TreeNode("B");
        TreeNode nodeC= new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
