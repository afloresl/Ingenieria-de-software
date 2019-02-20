package com.mycompany.mapita;
// Generated 6/02/2019 09:19:32 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User1 generated by hbm2java
 */
public class User1  implements java.io.Serializable {


     private int iduser;
     private String name;
     private String email;
     private String password;
     private Date birthday;
     private Set marcadores = new HashSet(0);

    public User1() {
    }

    public User1(int iduser, String name, String email, String password, Date birthday) {
       this.iduser = iduser;
       this.name = name;
       this.email = email;
       this.password = password;
       this.birthday = birthday;
    }
   
    public int getIduser() {
        return this.iduser;
    }
    
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }




}


