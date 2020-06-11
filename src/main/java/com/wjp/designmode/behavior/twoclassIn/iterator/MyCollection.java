package com.wjp.designmode.behavior.twoclassIn.iterator;

/**
 * @author wjp
 * @date 2020/6/10 14:40
 */
public class MyCollection implements Collection {
    public String[] strings = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return strings[i];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
