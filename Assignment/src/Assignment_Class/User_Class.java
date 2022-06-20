package Assignment_Class;

public class User_Class {
    
    private String username;
    private String password;
    
    public User_Class(){};
    
    public User_Class(String user,String pw){
        this.username = user;
        this.password = pw;
    }    
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    

  
}
