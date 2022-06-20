package Assignment_Class;


public class Admin_Class extends User_Class{
    
    User_Class uc = new User_Class();
    
    public Admin_Class(){};
    
    public Admin_Class(String user, String pw){
        
        uc = new User_Class(user,pw);
        
    }
    
    public boolean AuthorizeLogin(){
        
        boolean authorize = false;
         
        if(uc.getUsername().equalsIgnoreCase("admin") && uc.getPassword().equalsIgnoreCase("admin")){
                
            authorize = true;
                         
        }
               
        return authorize;
    }
    
    
    
}
