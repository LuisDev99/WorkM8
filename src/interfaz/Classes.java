/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Classes {
    public  ArrayList<String> get_usuario_from_file = new ArrayList<String>(); 
    public  ArrayList<String> get_contrasenas_from_file = new ArrayList<String>();
    public String display;
    
    public  void CrearUsuario(){
    
    File file = new File("Usuarios.txt");
	ArrayList<String> lista = new ArrayList<String>();
	String jugadores[] = {"Rafael","Michael"}; 

	for(int i = 0; i <jugadores.length; i++){
		lista.add(jugadores[i]);
	}
   	 
	try{
		FileWriter fw = new FileWriter(file);
		Writer output = new BufferedWriter(fw);
		int sz = lista.size();
		
		for(int i = 0; i<sz; i++){
			output.write(lista.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "La cuenta no se ha podido crear");
		
	}
        getfile();
    }
    
    public  void getfile(){
		
                
		String filename = "Usuarios.txt";
		String line;
		ArrayList<String> lista = new ArrayList<String>();
		
		try{
			BufferedReader input = new BufferedReader (new FileReader (filename));
			if (!input.ready()){
				throw new IOException();
			}
			
			while((line = input.readLine()) != null){
			lista.add(line);
			
			
			}
			input.close();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		int size = lista.size();
		for(int i = 0; i<size; i++){
			
		   get_usuario_from_file.add(lista.get(i)); 
		}
                
               
		
	}
        public void get_password(){
		
                
		String filename = "contrasenas.txt";
		String line;
		ArrayList<String> lista = new ArrayList<String>();
		
		try{
			BufferedReader input = new BufferedReader (new FileReader (filename));
			if (!input.ready()){
				throw new IOException();
			}
			
			while((line = input.readLine()) != null){
			lista.add(line);	
			}
                        
			input.close();
			
		}catch(Exception e){
			System.out.println(e);	
		}
		int size = lista.size();
		for(int i = 0; i<size; i++){
			
		   get_contrasenas_from_file.add(lista.get(i)); 
		}
                
               
		
	}
        public void CrearJugador(String usuarios){
           
            
            String filename = "Usuarios.txt";
            String linea;
            ArrayList<String> lista = new ArrayList<String>();
		
            try{
                Writer output;
                output = new BufferedWriter(new FileWriter("Usuarios.txt", true)); 
                output.write(usuarios);
                output.write("\n");
                output.close();
			
            }catch(Exception e){
                System.out.println(e);
            } 
            
        }
        public void CrearPassword(String contrasena){
             
             
            String filename = "contrasenas.txt";
            String linea;
            ArrayList<String> lista = new ArrayList<String>();
                
		
            try{
                Writer output;
                output = new BufferedWriter(new FileWriter("contrasenas.txt", true));
                output.write(contrasena);
                output.write("\n");
                output.close();
		
            }catch(Exception e){
                System.out.println(e);
            } 
        }
        public Boolean verificar_login (String user, String pass){
            getfile();
            get_password();
            Boolean sexo = false;
         for(int x=0;x<get_usuario_from_file.size();x++){
           if(get_usuario_from_file.get(x).equals(user)&&(get_contrasenas_from_file.get(x).equals(pass))){
               sexo = true;
               
               break;
           }
        } 
         return sexo;
         
        }
        
}

