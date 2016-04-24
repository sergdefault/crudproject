package crud;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Цымбалюк Сергей on 24.04.2016.
 */

public class DbHelper {
    static Connection connection;


    public static Connection getConnrection() {
        connection = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/peopledb", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }
    public static void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
