/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientovec;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class VecObjeto {
    
    public Empleado vec[];
    
    public VecObjeto(){
        int tama=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos empleados se "
                + " registrarán?"));
        vec = new Empleado [tama];
        
        for(int i=0;i<vec.length;i++){
            vec[i] = new Empleado(-1, "", "", -1, -1, -1,-1);
        }
        
    }
    
    public int ConfirID(int id){
        for(int i=0;i<vec.length;i++){
            if(vec[i].getId() == id){
                return i;
            } 
        }        
        return -1;
    }
    public void LLenarVec(){
        int pos=-1, id;
        
      for(int i=0; i<vec.length;i++){
          do{
              id=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ID de empleado."));
              pos=ConfirID(id);
              if(pos == -1){
                vec[i].setId(id);
              }
              else{
                  JOptionPane.showMessageDialog(null, "La ID que ingresó ya existe. \n"
                          + "Intente nuevamente...");
              }
                  
          }while(pos>=0);
          vec[i].setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre."));
          vec[i].setGenero(JOptionPane.showInputDialog(null, "Ingrese su Género."));
          vec[i].setSalariob(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario básico.")));
          vec[i].setEstrato(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su estrato.")));
          vec[i].setHe(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de HE que laboró.")));
          vec[i].setFechavin(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su Fecha de Vinculación en la empresa.")));
          
      }
    }
    
    public void MostrarVec(){
        for(int i=0;i<vec.length;i++){
            vec[i].Mostar();
            
        }
    }
    
    public int BuscarID(){
        int id=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ID del empleado a buscar"));
        for(int i=0;i<vec.length;i++){
            if(vec[i].getId() == id){
                return i;
            } 
        }        
        return -1;
    }
    
    public double CalcNeto(){
        int pos = BuscarID();
        double salud = 0, pension = 0, arl = 0, 
                total = 0, sbt = 0;
        
             if(pos == -1){
            JOptionPane.showMessageDialog(null, "LA ID INGRESADA NO ESTÁ REGISTRADA!!!");
              }
             else
              vec[pos].Mostar();
             
             salud=vec[pos].getSalariob()*0.04;
             pension=vec[pos].getSalariob()*0.0375;
             arl=vec[pos].getSalariob()*0.02;
           
             
                if(vec[pos].getEstrato() == 1 || vec[pos].getEstrato() == 2){
                     sbt=78000;
               }
            
               total=vec[pos].getSalariob()-salud-pension-arl+sbt;
            
               JOptionPane.showMessageDialog(null, "DETALLADO DE NÓMINA DEL EMPLEADO: \n"
                                              + "SUELDO BASICO: "+vec[pos].getSalariob()+"\n"
                                              + "H.E LABORADAS: "+vec[pos].getHe()+"\n"
                                              + "VALOR H.E: ?"+"\n"
                                              + "APORTE SALUD: "+salud+"\n"
                                              + "APORTE PENSIÓN: "+pension+"\n"
                                              + "APORTE ARL: "+arl+"\n"
                                              + "SUBSIDIO TTE: "+sbt+"\n"
                                              + "NETO A PAGAR: "+"$"+total);
       return total;     
    }
    public void QuickShort(int mayor, int menor){
        int i,j;
        int  elem;
        i=(int) mayor;
        j=(int) menor;
     
    }
   
    
        
        
        
    
}
