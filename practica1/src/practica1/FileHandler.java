/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prac1_tst3;

import java.io.*;
import static lab_prac1_tst3.Users.saveUser2DBFile;

/**
 *
 * @author Ricardo
 */
public class FileHandler {
    
    static Users[] usersDB=new Users[50000000];// {null, null, null} //INICIAL:: 50 millones
    
    public static void main(String [] args) {

        //escribirArchivoTest();
        //leerArchivoTest();
        
        saveUser2DBFile("111","1-User-nombre");
        
        saveUser2DBFile("222","2-User-nombre");
        
        //escribirArchivoTest();
        //leerArchivoTest();        
        
        readUserFromFile(usersDB);       
        
            //usersDB[i] = new Users(id, nombres);
            //System.out.println("Contador de personas: " + usersDB[i].contadorPersonas);  
            
        System.out.println("usersDB[0].identificacion: " + usersDB[0].identificacion);  
        System.out.println("usersDB[1].identificacion: " + usersDB[1].identificacion);  
    }    

    public static void leerArchivoTest() {
        // The name of the file to open.
        //String fileName = "usuarios.txt";
        String fileName = "C:\\Users\\Ricardo\\Documents\\UdeA\\Estructura Fisica Informacion\\EstructuraFisicaInfo\\src\\lab_prac1_tst3\\usuarios.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);
            
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }    


    public static void readUserFromFile( Users[] usersDB ) {
        // The name of the file to open.
        //String fileName = "usuarios.txt";
        String fileName = "C:\\Users\\Ricardo\\Documents\\UdeA\\Estructura Fisica Informacion\\EstructuraFisicaInfo\\src\\lab_prac1_tst3\\usuarios.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);
            
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            
            int idLinea = 0;
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println("linea=="+line);
                //miro si la 
                String linea = line;
                String[] partsLinea = linea.split(",");
                String userId = partsLinea[0]; // user ID
                String userName = partsLinea[1]; // user Name
                
                System.out.println("userId=="+userId);
                System.out.println("userName=="+userName);
                
                usersDB[idLinea] = new Users(userId, userName);
                
                idLinea++;
            }
            
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }    


    public static void escribirArchivoTest() {

        // The name of the file to open.
        String fileName = "C:\\Users\\Ricardo\\Documents\\UdeA\\Estructura Fisica Informacion\\EstructuraFisicaInfo\\src\\lab_prac1_tst3\\usuarios.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName,true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    public static void addUser2File(String userAsFileLine) {

        // The name of the file to open.
        String fileName = "C:\\Users\\Ricardo\\Documents\\UdeA\\Estructura Fisica Informacion\\EstructuraFisicaInfo\\src\\lab_prac1_tst3\\usuarios.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName,true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(userAsFileLine);
            bufferedWriter.newLine();

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    
}
