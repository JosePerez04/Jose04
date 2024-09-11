package metodos;

import alumno.Alumno;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Metodos {
    
  Vector vPrincipal = new Vector();
  
  public void guardar(Alumno unAlumno){
      vPrincipal.addElement(unAlumno);
  }
  
  public void guardarArchivo(Alumno alumno){
      try{
          FileWriter fw = new FileWriter("Alumnos.txt",true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter pw = new PrintWriter(bw);
          pw.print(alumno.getNombre());
          pw.print("|"+alumno.getApellidos());
          pw.print("|"+alumno.getEdad());
          pw.print("|"+alumno.getArea());
          pw.println("|"+alumno.getSemestre());
          pw.close();
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
  }
  
  public DefaultTableModel listaAlumnos(){
      Vector cabeceras = new Vector();
      cabeceras.addElement("Nombre");
      cabeceras.addElement("Apellidos");
      cabeceras.addElement("Edad");
      cabeceras.addElement("Area");
      cabeceras.addElement("Semestre");
      
      DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
      
      try{
          FileReader fr = new FileReader("Alumnos.txt");
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