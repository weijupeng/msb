package com.wjp.designmode.behavior.twoclassIn.iterator;

/**
 * @author wjp
 * @date 2020/6/10 14:58
 */
public class Test {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
