# user-service


This service is for managing user. 

Apis-- 
  User : create User and get user details 
  User 
      {
         "userName" : "userName"
         "email" : "email",
         "mobileNumber" : "121231233" 
      }
      
  
  User History : Add user action history and get History of a user by userName.
  UserAction 
      {
          "userName" : "name"
          "userAction" : "actiion"
          "timeStamp" : "time"
      }
  
  Event--
    a. Create Event
    b. Get Event details 
    c. Update Event 
    
Event 
    {
     "eventName" : "EVENTNAME"
     "capacity" : 145,
     "available" : 100,
     "unitPrice" : 250
    }
  
  
  
  
