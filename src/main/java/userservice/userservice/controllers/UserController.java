package userservice.userservice.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userservice.userservice.dtos.User;
import userservice.userservice.services.UserService;


@Slf4j
@RequestMapping("/user-service")
@RestController
@RequiredArgsConstructor
public class UserController {

   private final UserService userService;

   @PostMapping("/user")
   public void addUser(@RequestBody User user) {
      log.info("Creating user for userName={}, user={}", user.getUserName(), user);
      userService.createUser(user);
   }

   @GetMapping("/user/{userName}")
   public User getUser(@PathVariable String userName) {
      log.info("Getting user details for userName={}", userName);
      return userService.getUser(userName);
   }
}
