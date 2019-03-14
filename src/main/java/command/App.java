package command;

public class App {

    public static UserDao userDao = new UserDao();

    public static void main(String[] args) {
        userDao.save(new User("admin", "admin@gmail.com", "12345"), 1L);
        System.out.println(userDao.get(1l));
        userDao.remove(1L);
        System.out.println(userDao.get(1L));

        DateBaseTransaction transaction = new DateBaseTransaction();

        transaction.addOperation(new SaveUserOperation(
                userDao, new User("usier", "user@gmail.com", "password"), 1L));
        transaction.addOperation(new SaveUserOperation(
                userDao, new User("user2", "user2@gmail.com", "1234"), 2L));
        transaction.addOperation(new RemoveUserOperation(userDao, 1L));
        transaction.addOperation(new RemoveUserOperation(userDao, 2L));
        transaction.commit();


    }
}
