/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import com.mycompany.mapita.User1;
import com.mycompany.mapita.User1DAO;
import java.util.List;
/**
 *
 * @author ana
 */
public class ConsultarUsuario {
     public List<User1> consultarUsuario() {
        User1DAO udb = new User1DAO();               
        return udb.findAll();
    }
}
