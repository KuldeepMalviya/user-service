package userservice.userservice.dtos;

import lombok.Data;

import java.util.Date;


@Data
public class UseAction {

   private String userName;
   private String userAction;
   private Date timeStamp;

}
