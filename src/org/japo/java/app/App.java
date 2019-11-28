/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;
import org.japo.java.libraries.UtilesPrimitivos;
/**
 *
 * @author CicloM
 */
public final class App {
    
  
    
   
    public final void launchApp() {
        
        //CABECERA
        System.out.println("VALIDACIÓN DE DNI ");
        System.out.println("================= ");
        
        //MUESTRA DNI
        System.out.printf("DNI ......: %d%c%n", UtilesPrimitivos.DNI_NUM, 
                UtilesPrimitivos.DNI_CTR);
        
        //SEPARADOR
        System.out.println("---");

        //Analisis
        boolean dniOK = UtilesPrimitivos.validar(UtilesPrimitivos.DNI_NUM,
                UtilesPrimitivos.DNI_CTR);
        
        //MUESTRA
        System.out.printf("Valides ..: %s%n", dniOK ?"Correcto":"incorrecto");
    }
    
   
    
   
}
