package Service;

import Dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("User Dao print");
    }
}
