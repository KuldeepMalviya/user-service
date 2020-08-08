package userservice.userservice.services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import userservice.userservice.dtos.User;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceTest {

   private UserService userService = new UserService();

   private User user;

   @BeforeEach
   public void setup() {
      user = User.builder().userName("userName").email("email").mobileNumber("23232").build();
   }

   @Test
   public void createUser() {
      userService.createUser(user);
      assertThat(UserService.USER_BASE.size()).isEqualTo(1);
   }

   @Test
   public void getUser() {
      userService.createUser(user);
      User userData = userService.getUser("userName");
      assertThat(userData).isNotNull();
   }
}