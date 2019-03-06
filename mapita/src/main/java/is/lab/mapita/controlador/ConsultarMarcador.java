/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import java.util.List;
import com.mycompany.mapita.MarcadorDAO;
import com.mycompany.mapita.Marcador;
/**
 *
 * @author ana
 */
public class ConsultarMarcador {
    public List<Marcador> consultarMarcador(){
        MarcadorDAO mdb = new MarcadorDAO();
        return mdb.findAll();
    }
}
