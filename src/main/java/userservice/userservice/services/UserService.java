package userservice.userservice.services;


import org.springframework.stereotype.Service;
import userservice.userservice.dtos.User;

import java.util.HashMap;


@Service
public class UserService {

   private static HashMap<String, User> USER_BASE = new HashMap<>();

   public void createUser(User user) {
      USER_BASE.put(user.getUserName(), user);
   }

}
