package com.weiyu.designPattern.composite;

import org.junit.Test;

/**
 * @author weiyu@
 * @description
 * @create 2018/5/11 10:55
 * @since 1.0.0
 */
public class CompositeClient {

    @Test
    public void test(){
        TreeNode root = new TreeNode("root");
        root.setParent(null);
        TreeNode child = new TreeNode("child1");
        TreeNode leaf1 = new TreeNode("leaf1");
        TreeNode leaf2 = new TreeNode("leaf2");
        root.add(child);
        child.add(leaf1);
        child.add(leaf2);
    }
}
