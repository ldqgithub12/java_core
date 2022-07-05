import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class User_service {
    ConnectDatabase connectDatabase;

    public User_service() {
        connectDatabase = new ConnectDatabase();
    }
    public ArrayList<User> getAllUsers(){
        ArrayList<User> result = new ArrayList<>();
        Connection conn = connectDatabase.getConnect();

        String query = "SELECT * FROM `users`";
        try {
            Statement stm = conn.createStatement();
            //Thực thi câu truy vấn

            ResultSet rs = stm.executeQuery(query);
            //Duyệt kết quả
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("user_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Date create_at = rs.getDate("create_at");
                result.add(new User(id,username,email,password,create_at));
            }
            conn.close();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
        return  result;
    }
    public void showUser(ArrayList<User> list){
        list.stream().forEach(user -> System.out.println(user));
    }
    public User getUserById(String fId){
        User fUser = null;

        Connection conn = connectDatabase.getConnect();
        String query = "SELECT * FROM `users` WHERE id = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);

            //Gán các giá trị vào tham số
            pstm.setString(1, fId);

            //Thực thi câu truy vấn và trả về kết quả
            ResultSet rs = pstm.executeQuery();

            //Duyệt kết quả
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("user_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Date createAt = rs.getDate("create_at");

                fUser = new User(id, username, email, password, createAt);
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return fUser;
    }
    public void addNewUser(User newUser){
        Connection conn = connectDatabase.getConnect();
        String query ="INSERT INTO `users`(`id`, `user_name`, `email`, `password`, `create_at`) VALUES (?,?,?,?,NOW())";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, newUser.getId());
            pstm.setString(2, newUser.getUserName());
            pstm.setString(3, newUser.getEmail());
            pstm.setString(4, newUser.getPassword());

            int row = pstm.executeUpdate();
            if (row != 0){
                System.out.println("insert Successfully");
            }
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void changePassword(User user, String newPassword){
        Connection conn = connectDatabase.getConnect();
        String query = "UPDATE `users` SET password = ? WHERE id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1,newPassword);
            pstm.setString(2,user.getId());
            int row = pstm.executeUpdate();
            if (row != 0){
                System.out.println("Update successfully");
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteUser(User user){
        Connection conn = connectDatabase.getConnect();
        String query = "DELETE FROM `users` WHERE id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1,user.getId());
            int row = pstm.executeUpdate();
            if (row != 0){
                System.out.println("delete successfully");
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public User login(String email, String password){
        Connection conn = connectDatabase.getConnect();
        String query = "SELECT * FROM `users`WHERE email = ? AND password = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1,email);
            pstm.setString(2,password);
            ResultSet rs = pstm.executeQuery();
            User user = null;
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("user_name");
                String user_email = rs.getString("email");
                String user_password = rs.getString("password");
                Date createAt = rs.getDate("create_at");

                user = new User(id, username, user_email, user_password, createAt);
            }
            conn.close();
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
