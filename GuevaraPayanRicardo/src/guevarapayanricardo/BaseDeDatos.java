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
public class BaseDeDatos {
    
    private ArrayList<Tabla> tablas = new ArrayList<>();
    
    
    /**
     * encuentra la tabla correspondiente a un registro y lo agrega a esta
     * @param registro 
     */
    public void addRegistro(Registro registro)
    {
        
        if (tablas.isEmpty()) 
        {
            Tabla tabla=new Tabla(registro);
            tablas.add(tabla);
        }
        else
        {
            boolean agregado = false;
            
            for (Tabla tabla : tablas) 
            {
                if (compararTipos(
                    tabla.getRegistros().get(0).getCampos(),
                    registro.getCampos()      )) 
                {
                    tabla.addRegistro(registro);
                    agregado=true;
                }
            }
            
            if (!agregado) 
            {
                Tabla tabla=new Tabla(registro);
                tablas.add(tabla);
            }
        }
        
    }
    
//______________________________________________________________________________    
    
    
    /**
     * compara los tipos de una tabla con los de un registro
     * @param tiposTabla _ tipos de datos de la tabla
     * @param tiposRegistro _ tipos de datos del registro
     * @return _ true: los tipos de datos coinciden / false: los tipos de datos no coinciden
     */
    private boolean compararTipos(ArrayList tiposTabla, ArrayList tiposRegistro)
    {
        if (tiposTabla.size() == tiposRegistro.size()) 
        {
            boolean coincide = true;
            
            for (int i = 0; i < tiposTabla.size(); i++) 
            {
                if  (!tiposTabla.get(i).getClass().equals
                    ( tiposRegistro.get(i).getClass())   ) 
                {
                    coincide=false;
                }
            }
            
            return coincide;
        }
        else
        {
            return false;
        }
        
    }
    
//______________________________________________________________________________
    
    public void printAll() 
    {
        System.out.println("Número de tablas: "+tablas.size());
        
        for (Tabla tabla : tablas) 
        {
            System.out.println("********************************************\n");
            System.out.println("Tabla "+tablas.indexOf(tabla));
            
            printTipos(tabla.getRegistros().get(0));
            
            System.out.println("Registros:");
            
            for (Registro registro : tabla.getRegistros()) 
            {
                for (Object campo : registro.getCampos()) 
                {
                    System.out.print(campo+", ");
                }
                System.out.println("");
            }
        }
    }
    
    /**
     * este método se utiliza solo por conveniencia estética de la tabla
     * @param registro _ registro para generar los titulos de tabla
     */
    private void printTipos(Registro registro)
    {
        Clasificador clasificador=new Clasificador();
        String impreso="";
        
        for (Object objeto : registro.getCampos()) 
        {
            impreso= impreso+clasificador.getNombreTipo(objeto)+", ";
        }
        
        System.out.println(impreso);
        
    }
    
    
    
}
