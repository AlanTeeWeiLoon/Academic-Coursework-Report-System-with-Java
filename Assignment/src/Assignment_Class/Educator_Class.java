
package Assignment_Class;

public class Educator_Class extends User_Class{
    
    User_Class uc = new User_Class();
    
    public Educator_Class(){};
    
    public Educator_Class(String user, String pw){
        
        uc = new User_Class(user,pw);
        
    }
    
    public boolean AuthorizeLogin(){
        
        boolean authorize = false;
         
        if(uc.getUsername().equalsIgnoreCase("educator") && uc.getPassword().equalsIgnoreCase("educator")){
                
            authorize = true;
                         
        }
               
        return authorize;
    }
}
