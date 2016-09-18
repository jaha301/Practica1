/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

//import static lab_prac1_tst3.FileHandler.escribirArchivoTest;

import static practica1.FileHandler.addUser2File;
import static practica1.FileHandler.escribirArchivoTest;
import static practica1.FileHandler.leerArchivoTest;
import static practica1.FileHandler.readUserFromFile;

//import static lab_prac1_tst3.FileHandler.leerArchivoTest;

/**
 *
 * @author Ricardo
 */
public class Users {

    //static Persona[] baseDatos=new Persona[3];// {null, null, null}
    
	public String identificacion;
	private String nombres;
	

	//se invoca la primera vez que se crea el objeto
	public Users(String identificacion, String nombres){
		this.identificacion=identificacion;
		this.nombres=nombres;	
                
               
	}
        
        public Users ()
        {}
    public static void main(String [] args) {

        //escribirArchivoTest();
        //leerArchivoTest();
        
                //saveUser2DBFile("111","1-User-nombre");

                //saveUser2DBFile("222","2-User-nombre");

                        //escribirArchivoTest();
                        //leerArchivoTest();        

                //readUserFromFile();
        
        
        //leer todos los usuarios y gardarlos en un Objeto
        //determinar el primer campo vacio en la DB
        
        /*INICIO*/
        //leer todos los usuarios y gardarlos en un Objeto
        
    }


    public static void saveUser2DBFile(String idUser, String nameUser) {
        
        System.out.println("saveUser");
        System.out.println("idUser:"+idUser);
        System.out.println("nameUser:"+nameUser);
        
        String userAsFileLine = parseUser2FileLine(idUser,nameUser);
    
        addUser2File(userAsFileLine);
        
    }
    
    public static String parseUser2FileLine(String idUser, String nameUser) {
        
        System.out.println("parseUser2FileLine");
        
        String userAsFileLine = idUser +","+ nameUser;
        
        System.out.println("userAsFileLine:"+userAsFileLine);
    
        return userAsFileLine;
    }    

 
    
    
    
}
