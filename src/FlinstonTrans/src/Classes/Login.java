/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlinstonTrans.src.Classes;

/**
 *
 * @author Usuario
 */
public class Login {

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    private String User;
    private String Password;
    
    public boolean equals(Login login)
    {
        if(login == null)
            return false;
        
        return this.User.equals(login.User) && this.Password.equals(login.Password);
        
    }   
    
    
}
