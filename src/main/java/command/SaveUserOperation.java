package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveUserOperation implements DateBaseOpration {

    private UserDao userDao;
    private User user;
    private Long id;
    private boolean exected = false;

    public SaveUserOperation(UserDao userDao , User user , Long  id){
        this.userDao= userDao;
        this.user = user;
        this.id = id;
    }

    @Override
    public boolean exrcute() {
       return userDao.save(user, id);
    }

    @Override
    public void rollBack() {

    }
}
