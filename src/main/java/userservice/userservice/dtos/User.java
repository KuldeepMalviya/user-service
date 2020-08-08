package userservice.userservice.dtos;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

   private String userName;
   private String email;
   private String mobileNumber;

}
