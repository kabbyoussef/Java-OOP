package Youssef.DBSPT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DBconnect {
    
    private String database;
    private String user;
    private String password;
    private String url;
    private String port;
   

    public DBconnect(String database,String port,String user, String password) {
        this.database = database;
        this.user = user;
        this.password = password;
        this.port = port;
        this.url = "jdbc:mysql://localhost:" + this.port + "/";
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Properties connectProp = new Properties();
        connectProp.put("dbms", this.database);
        connectProp.put("user", this.user);
        connectProp.put("password", this.password);
        connectProp.put("useSSL", "false");
        Connection conn = DriverManager.getConnection(this.url,connectProp);
        return conn;
    }
    
    public void executeUseQuery(Connection C) throws SQLException, ClassNotFoundException{       
        Statement stmt_use = C.createStatement();
        stmt_use.execute("USE " + this.database);       
    }
    
    public ResultSet executeSelectQuery(String Query,Connection C) throws SQLException, ClassNotFoundException{               
        Statement stmt_query = C.createStatement();
      return   stmt_query.executeQuery(Query); //Inserting Data        
    }
    
    public void executeInsertQuery(String Query,Connection C) throws SQLException, ClassNotFoundException{        
        Statement stmt_query = C.createStatement();
        stmt_query.executeUpdate(Query); //Inserting Data        
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    }