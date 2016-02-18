package com.jd.java;

import java.util.List;

interface Connection {
  public void close();

  public void execute();
}

interface ConnectionPool {
}

class MyConnectionPool implements ConnectionPool {
  private List<Connection> connections;

  public MyConnectionPool(List<Connection> connections) {
    this.connections = connections;
  }

  public Connection getConnection() {
    for (Connection con : this.connections) {
      return con;
    }
    return null;
  }
}

public class AnonymousFunction {

  public static void main(String[] args) {
    MyConnectionPool pool = new MyConnectionPool(null);
    Connection con = pool.getConnection();
    try {
      con.execute();
    } finally {
      con.close();
    }

  }

}
