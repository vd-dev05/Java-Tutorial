package encapsulation;

public class login {
    private  String  username;
    private  String password; 
    
    public login()  {
        
    };
    
    // setter
    public void setLogin(String newUser , String newPass) {
        this.username = newUser;
        this.password = newPass;
    };
    
    public String getUserName() {
        return  this.username;
    };
    public String getPassWord() {
        return  this.password;
    };
}
