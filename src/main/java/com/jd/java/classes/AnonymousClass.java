package com.jd.java.classes;

import java.util.ArrayList;
import java.util.List;

interface Connection {
  public void close();

  public void execute();
}

interface ConnectionPool {

  public Connection getConnection();
}

class MyConnectionPool implements ConnectionPool {
  private List<Connection> connections;

  public MyConnectionPool(List<Connection> connections) {
    this.connections = connections;
  }

  public Connection getConnection() {
    Connection con = new Connection() {

      @Override
      public void close() {
        addConnection(this);
        System.out.println("Close connection!");
      }

      @Override
      public void execute() {
        System.out.println("Execute query!");
      }

    };

    if (this.connections != null && this.connections.size() > 0)
      this.connections.remove(0);

    return con;
  }

  public void addConnection(Connection con) {
    if (this.connections == null)
      connections = new ArrayList<>();
    connections.add(con);
  }
}

public class AnonymousClass {

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
