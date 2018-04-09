/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guevarapayanricardo;

import java.util.ArrayList;

/**
 *
 * @author RICARDO
 */
public class Tabla {
    
    private ArrayList<Registro> registros = new ArrayList<>();

    public Tabla() {
    }
    
    public Tabla(Registro registro) 
    {
        this.registros.add(registro);
    }
    
    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    
//______________________________________________________________________________

    
    public void addRegistro(Registro registro)
    {
        this.registros.add(registro);
    }
    
}
