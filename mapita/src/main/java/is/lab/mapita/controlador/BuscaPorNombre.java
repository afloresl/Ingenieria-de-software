/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import com.mycompany.mapita.User1;
import com.mycompany.mapita.User1DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ana
 */
@ManagedBean
@SessionScoped
public class BuscaPorNombre {
    private String name;
    
    private List<User1> resultado;

    public List<User1> getResultado() {
        return resultado;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String buscaPorNombre(){
        if(name.equals(""))
            return "";
        User1DAO ubd = new User1DAO();
        resultado =  ubd.buscaPorNombre(name);
        return "resultado?faces-redirect=true";
    }
}
