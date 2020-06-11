package com.wjp.designmode.behavior.twoclassIn.iterator;



/**
 * @author wjp
 * @date 2020/6/10 14:37
 */
public interface Collection {
     Iterator iterator();

     Object get(int i);

     int size();

}
