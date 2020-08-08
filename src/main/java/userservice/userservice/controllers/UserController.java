package userservice.userservice.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userservice.userservice.dtos.User;
import userservice.userservice.services.UserService;


@RequestMapping("/user-service")
@RestController
@RequiredArgsConstructor
public class UserController {

   private final UserService userService;

   @PostMapping("/user")
   public void addUser(User user) {
      userService.createUser(user);
   }
}
