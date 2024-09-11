package metodos;

import personas.Personas;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Metodos {
    
  Vector vPrincipal = new Vector();
  
  public void guardar(Personas unPersonas){
      vPrincipal.addElement(unPersonas);
  }
  
  public void guardarArchivo(Personas persona){
      try{
          FileWriter fw = new FileWriter("Personas.txt",true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter pw = new PrintWriter(bw);
          pw.print(persona.getNombre());
          pw.print("|"+persona.getApellidos());
          pw.print("|"+persona.getEdad());
          pw.print("|"+persona.getDireccion());
          
          pw.close();
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
  }
  
  public DefaultTableModel listaPersonas(){
      Vector cabeceras = new Vector();
      cabeceras.addElement("Nombre");
      cabeceras.addElement("Apellidos");
      cabeceras.addElement("Edad");
      cabeceras.addElement("Direccion");
      
      
      DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
      
      try{
          FileReader fr = new FileReader("Personas.txt");
          BufferedReader br = new BufferedReader(fr);
          String d;
          while((d=br.readLine())!=null){
              StringTokenizer dato = new StringTokenizer(d,"|");
              Vector x = new Vector();
              while(dato.hasMoreTokens()){
                  x.addElement(dato.nextElement());
                  
              }
              mdlTabla.addRow(x);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
      return mdlTabla;
  }
          
}