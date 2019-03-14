package command;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RemoveUserOperation implements DateBaseOpration {

    private UserDao userDao;
    private Long id;
    private User user;
    private boolean executed = false;

    public RemoveUserOperation(UserDao userDao, Long id) {
        this.userDao = userDao;
        this.id = id;
    }


    @Override
    public boolean exrcute() {
        user = userDao.get(id);
        executed = userDao.remove(id);
        return executed;

    }

    @Override
    public void rollBack() {
        userDao.save(user, id);
    }



}
