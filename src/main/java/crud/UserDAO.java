package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Цымбалюк Сергей on 24.04.2016.
 */
public class UserDAO {
    private  Connection connection;
    private  Statement statement;

    public UserDAO() {
        this.connection = DbHelper.getConnrection();
        try {
            this.statement =connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList <User> getAllUsersFromDb() {
        ResultSet resultSet = null;
        ArrayList<User> list = new ArrayList<User>();
        try {
            resultSet = statement.executeQuery("SELECT * FROM peopledb.users;");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sity = resultSet.getString(3);
                int age = resultSet.getInt(4);
                list.add(new User(id,name,sity,age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deleteUserById(int id){
        String userId = String.valueOf(id);
        try {
            statement.execute("delete from users where id="+userId+";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user){
        try {
            statement.executeUpdate("INSERT INTO users (username,sity,age) VALUES ('"+user.getName()+"','"+user.getCity()+"',"+user.getAge()+");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateUser(User user){
        try {
            statement.executeUpdate("UPDATE users SET username='"+user.getName()+"', sity='"+user.getCity()+"', age="+user.getAge()+" WHERE id="+user.getId()+"; ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

