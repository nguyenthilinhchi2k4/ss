package javafx.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connetor {
    private Connection conn;

    private static Connetor _instance;

    private Connetor() throws ClassNotFoundException, SQLException {
        // tạo kết nối với db
        String host = "jdbc:mysql://localhost:3306/list2";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(host,user,pwd);
    }

    public static Connetor getInstance() throws SQLException, ClassNotFoundException {
        if(_instance == null){
            _instance = new Connetor();
        }
        return _instance;
    }

    public Connection getConn() {
        return _instance.conn;
    }
}