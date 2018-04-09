/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guevarapayanricardo;

/**
 *
 * @author RICARDO
 */
public class Clasificador {
    
    public String getNombreTipo(Object objeto)
    {
        if     (objeto instanceof Number)
        {   return clasificar((Number)objeto); }
        
        else if(objeto instanceof Boolean)
        {   return clasificar((Boolean)objeto); }
        
        else if(objeto instanceof String)
        {   return clasificar((String)objeto); }
        
        else
        {   return datoNoPrimitivo(objeto);    }    
        
    }
    
//______________________________________________________________________________
    
    /**
     * clasifica un objeto numérico
     * @param numero
     * @return 
     */
    private String clasificar(Number numero)
    {
        if     (numero instanceof Integer)
        {   return clasificarNum((Integer)numero); }
        
        else if(numero instanceof Float)
        {   return clasificarNum((Float)numero); }
        
        else if(numero instanceof Double)
        {   return clasificarNum((Double)numero); }
        
        else if(numero instanceof Long)
        {   return clasificarNum((Long)numero); }
        
         else
        {   return datoNoPrimitivo(numero);    } 
        
    }
    
    private String clasificarNum(float flotante)
    {
        return "FLOAT";
    }
    
    private String clasificarNum(double real)
    {
        return "DOUBLE";
    }
    
    private String clasificarNum(Integer entero)
    {
        return "INT";
    }
    
    private String clasificarNum(long enterisimo)
    {
        return "Long";
    }
    
//______________________________________________________________________________
    
    /**
     * clasifica un objeto booleano
     * @param booleano
     * @return 
     */
    private String clasificar(Boolean booleano)
    {
        return "BOOLEANO";
    }
  
//______________________________________________________________________________
    
    /**
     * clasifica un String
     * @param cadena
     * @return 
     */
    private String clasificar(String cadena)
    {
        return "STRING";
    }

//______________________________________________________________________________
    
    /**
     * clasifíca un dato abstracto (creado por el usuario)
     * @param objeto
     * @return 
     */
    private String datoNoPrimitivo(Object objeto)
    {
        return objeto.getClass().getName().toUpperCase();
    }
    
    
    
}
