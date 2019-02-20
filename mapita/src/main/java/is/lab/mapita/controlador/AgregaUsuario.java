/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import com.mycompany.mapita.User1;
import com.mycompany.mapita.User1DAO;

/**
 *
 * @author ana
 */
@ManagedBean
public class AgregaUsuario {

    private String name;
    private String email;
    private String password;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    

    
    public void agregaUsuario(){
        User1 u = new User1();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        u.setBirthday(birthday);
        User1DAO udb = new User1DAO();
        udb.save(u);
    }

}
