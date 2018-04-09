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
class Registro {
    
    private ArrayList campos =new ArrayList();

    public Registro(ArrayList campos) 
    {
        this.campos=campos;
    }

    public ArrayList getCampos() 
    {
        return campos;
    }

    public void setCampos(ArrayList campos) 
    {
        this.campos = campos;
    }

    
//______________________________________________________________________________    
    
    
    /**
     * genera un registro de tabla a partir de un grupo de objetos de tipo indeterminado
     * @param objeto _ recibe un grupo indeterminado de objetos de tipo indeterminado
     * @return _ registro para una tabla
     */
    static Registro crearRegistro(Object... objeto)
    {
        ArrayList campos =new ArrayList();
        
        for (Object object : objeto) 
        {
            campos.add(object);
            
        }
        
        /*
        for (Object campo : campos) 
        {
            System.out.print(campo.getClass()+": ");
            System.out.println(campo);
        }
        
        System.out.println("");
        */
        
        Registro retorno = new Registro(campos);
        
        return retorno;
    }
    
    
}
