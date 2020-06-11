package com.wjp.designmode.structure.flyweight;

import java.sql.Connection;

/**
 * @author wjp
 * @date 2020/6/10 14:01
 */
public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        System.out.println("connection = " + connection);
    }
}
