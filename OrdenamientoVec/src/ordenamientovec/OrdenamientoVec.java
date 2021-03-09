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
public class OrdenamientoVec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        VecObjeto lstPC = null;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú Principal \n"+
            "1. Crear y llenar vector \n"+
            "2. Mostrar vector \n"+
            "3. Buscar por ID de Empleado \n"+
            "4. Salir \n"+
            "Entre su opción: ?"        
            ));
            switch(op){
                case 1:
                    lstPC = new VecObjeto();
                    lstPC.LLenarVec();
                break;
                case 2:
                    lstPC.MostrarVec();
                break;
                case 3:
                    lstPC.CalcNeto();
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, 
                    "Adios!!!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, 
                    "Opción invalida!!");
            }
            
        }while(op!=4);
        System.exit(0);
    }
    
}
