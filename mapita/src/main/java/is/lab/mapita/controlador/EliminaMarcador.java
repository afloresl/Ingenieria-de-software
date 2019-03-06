/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import com.mycompany.mapita.Marcador;
import com.mycompany.mapita.MarcadorDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ana
 */
@ManagedBean
public class EliminaMarcador {
    
    private int idmarcador;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    
    public void eliminaMarcador(){
    MarcadorDAO udb = new MarcadorDAO();
    Marcador marcador = udb.find(idmarcador);
    udb.delete(marcador);
    }
    
}
