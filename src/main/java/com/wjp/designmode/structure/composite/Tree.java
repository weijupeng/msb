package com.wjp.designmode.structure.composite;

/**
 * @author wjp
 * @date 2020/6/9 18:35
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");

        b.add(c);
        tree.root.add(b);
        System.out.println("build thr tree finished");
        System.out.println(tree.root.getChildren());
    }
}
