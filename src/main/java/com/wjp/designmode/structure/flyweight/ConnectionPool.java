package com.wjp.designmode.structure.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author wjp
 * @date 2020/6/10 13:52
 */
public class ConnectionPool {
    private Vector<Connection> pool;
    /**
     * 公有属性
     */
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 3;
    private static ConnectionPool instance = null;
    Connection conn = null;

    public ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class<?> aClass = Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void release() {
        pool.add(conn);
    }

    public synchronized Connection getConnection() {
        if (poolSize > 0) {
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        } else {
            return null;
        }
    }
}
