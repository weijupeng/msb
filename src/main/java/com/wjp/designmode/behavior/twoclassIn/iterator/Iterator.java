package com.wjp.designmode.behavior.twoclassIn.iterator;

/**
 * @author wjp
 * @date 2020/6/10 14:38
 */
public interface Iterator {
    /**
     * 前移
     * @return Object
     */
    Object previous();

    /**
     * 后移
     * @return Object
     */
    Object next();

    boolean hasNext();

    /**
     * 取得第一个元素
     * @return Object
     */
    Object first();

}
