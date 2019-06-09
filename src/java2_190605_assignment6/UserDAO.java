package java2_190605_assignment6;

import connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO implements UserInterface {

    private static UserDAO instance;

    private UserDAO(){

    }

    public static UserDAO getInstance(){
        if(instance == null){
            instance = new UserDAO();
        }
        return instance;
    }


    @Override
    public boolean create(User u) {
        Connector cn = Connector.getInstance();
        String sql = "INSERT INTO user (username,email,password)" +
                " VALUES('"+u.getUsername()+"','"+u.getEmail()+"','"+
                u.getPassword()+"')";
        try {
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){}

        return false;
    }

    @Override
    public ArrayList<User> getList() {
        return null;
    }

    @Override
    public boolean update(User u) {
        return false;
    }

    @Override
    public boolean delete(User u) {
        return false;
    }

    public User getUser(Integer id){
        String sql = "SELECT * FROM user WHERE id = "+id;
        Connector cn = Connector.getInstance();
        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()){
                return new User(rs.getInt("id"),rs.getString("username"),
                        rs.getString("email"),rs.getString("password"));
            }
        }catch (Exception e){}
        return null;
    }
}
