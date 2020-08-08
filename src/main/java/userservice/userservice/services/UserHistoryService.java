package userservice.userservice.services;


import org.springframework.stereotype.Service;
import userservice.userservice.dtos.UseAction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class UserHistoryService {

   static HashMap<String, List<UseAction>> USER_HISTORY_BASE = new HashMap<>();

   public void addUserAction(UseAction action) {
      if (USER_HISTORY_BASE.containsKey(action.getUserName())) {
         List<UseAction> useActions = USER_HISTORY_BASE.get(action.getUserName());
         useActions.add(action);
         USER_HISTORY_BASE.put(action.getUserName(), useActions);
      } else {

         USER_HISTORY_BASE.put(action.getUserName(), Arrays.asList(action));
      }
   }

   public List<UseAction> getUserActionHistory(String userName) {
      return USER_HISTORY_BASE.get(userName);
   }
}
