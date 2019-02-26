/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import javax.faces.bean.ManagedBean;
import com.mycompany.mapita.User1;
import com.mycompany.mapita.User1DAO;
/**
 *
 * @author ana
 */
@ManagedBean
public class EliminaUsuario {
    private int iduser;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
   
    public void eliminaUsuario(){
        User1DAO udb = new User1DAO();
        User1 usuario = udb.find(iduser);
        udb.delete(usuario);
    }
    
}
