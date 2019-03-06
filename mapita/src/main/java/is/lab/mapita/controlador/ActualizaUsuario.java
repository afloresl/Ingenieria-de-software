/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import com.mycompany.mapita.User1;
import com.mycompany.mapita.User1DAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author ana
 */
@ManagedBean
public class ActualizaUsuario {
    
    private String iduser;
    private String name;
    private String email;
    private String password;
    private Date birthday;

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

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

    
    public void actualizarUsuario() {
        int id = Integer.valueOf(iduser);
        User1DAO udb = new User1DAO();
        User1 u = udb.find(id);
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        u.setBirthday(birthday);
        udb.update(u);
    }
}
