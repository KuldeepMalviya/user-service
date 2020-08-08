package userservice.userservice.services;

import org.junit.jupiter.api.Test;
import userservice.userservice.dtos.UseAction;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class UserHistoryServiceTest {

   private UserHistoryService userHistoryService = new UserHistoryService();

   @Test
   public void shouldAddUserAction() {
      UseAction useAction = new UseAction();
      useAction.setUserName("username");
      userHistoryService.addUserAction(new UseAction());
      assertThat(UserHistoryService.USER_HISTORY_BASE).isNotEmpty();
   }

   @Test
   public void shouldReturnActionHistory() {
      UseAction useAction = new UseAction();
      useAction.setUserName("username");
      UserHistoryService.USER_HISTORY_BASE.put("username", Arrays.asList(useAction));
      List<UseAction> history = userHistoryService.getUserActionHistory("username");
      assertThat(history).isNotEmpty();
   }
}