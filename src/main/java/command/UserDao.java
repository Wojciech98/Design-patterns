package command;

import java.time.LocalDateTime;
import java.util.*;

public class UserDao {

    Map<Long, User> users = new HashMap<>();

    public boolean save(User user, Long id) {

      /*  if(users.containsKey(id)){
            System.out.println("User with id "+ "laready");
        }
        boolean isUsersNameDuplicated= false;
        for(User savedUsers : users.values()){
            if(savedUsers.getUserName().equals(user.getUserName())){
                isUsersNameDuplicated = true;
            }
        }
        if(isUsersNameDuplicated){
            System.out.println("User with " + user.getUserName() + " already exists");
            return false;
        }*/
        if(users.values().stream().anyMatch(saveUser -> saveUser.getUserName().equals(user.getUserName())));
        users.put(id, user);
        System.out.println(String.format("Saving user %s with id %s ", user, id));
        return true;
    }

    public boolean remove(Long id) {

        if (!users.containsKey(id)) {
            System.out.println("Cannot remove user with id" + id);
            return false;
        } else
            System.out.println("Remoing userwith id " + id);
            users.remove(id);
        return true;

    }

    public User get(Long id) {
        System.out.println("Retriveing user with id" + id);
        return users.get(id);

    }

    public Collection<User> getAll(){
        System.out.println("Getting all users");
        return users.values();
    }
}
