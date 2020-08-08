package userservice.userservice.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userservice.userservice.dtos.UseAction;
import userservice.userservice.services.UserHistoryService;

import java.util.List;


@Slf4j
@RequestMapping("/user-service")
@RestController
@RequiredArgsConstructor
public class UserHistoryController {

   private final UserHistoryService userHistoryService;

   @PostMapping("/user/{userName}")
   public void addUserAction(@PathVariable String userName, @RequestBody UseAction useAction) {
      log.info("Adding user action to history for userName={}, Action={}", userName, useAction);
      userHistoryService.addUserAction(useAction);
   }

   @GetMapping("/user/{userName}/history")
   public List<UseAction> getUserActionHistory(@PathVariable String userName) {
      log.info("Fetching userHistory for userName={}", userName);
      return userHistoryService.getUserActionHistory(userName);
   }

}
