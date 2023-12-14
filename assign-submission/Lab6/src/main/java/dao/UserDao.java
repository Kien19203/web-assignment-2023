package dao;

import db.JDBIConnector;
import vn.ed.hcmuaf.bean.User;

import java.util.Optional;

public class UserDao {
    public static User getUserByEmail(String email) {
        Optional<User> user = JDBIConnector.me().withHandle((handle ->
                handle.createQuery("select * from users where email = ?").bind(0, email)
                        .mapToBean(User.class).stream().findFirst()));
        return user.isEmpty() ? null : user.get();
    }
}
