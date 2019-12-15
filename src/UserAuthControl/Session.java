/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAuthControl;

import quickbill.WindowQuickBill;

/**
 *
 * @author rzkan
 */
public class Session {
    String user = null;
    String role = null;
    
    public void session(){
        
    }
    
    void createSession(String user, String role){ 
        this.user = user;
        this.role = role; 
    }
    
    public String getRole(){
        return this.role;
    }
    
    public String getUser() { 
        return this.user;
    }
    
    public boolean isLogin(){
        return !(this.role == null && this.user == null);
    }
    
    public void login(){
        new WindowLogin().setVisible(true);
    }

    boolean submitLogin(String user, String pwd) {
        String username = "phon";
        String password = "1234";
        String newRole = "1";
        
        if(username.equalsIgnoreCase(user) && password.equals(pwd)){
            createSession(user, newRole);
            new WindowQuickBill().setVisible(true);
            return true;
        }else{
            return false;
        }
    }
}
