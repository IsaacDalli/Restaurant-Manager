package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileIO {  
    //Read file lines, Takes the file path as paremeter
    public static String readTextFile(String filePath){
        //Get the file with the filepath
        File f = new File(filePath);
        //String to return with contents of the file
        String contents = "";
        
        //If the file exists than continue else return null
        if (f.exists()){
            try {
                //Reader to read lines from text file
                BufferedReader br = new BufferedReader(new FileReader(f));
                //While method to check every line in file
                String l = null;
                while((l = br.readLine()) != null){
                    //Add the line form the file to the string to return, add \n when starting a new line
                    contents += l+"\n";
                }
                //Close reader
                br.close();
            } catch (IOException e) {
                //Show message dialog in case errors occured
                JOptionPane.showMessageDialog(null, "Error when trying to read from file: "+e.getMessage() ,"Error:", JOptionPane.PLAIN_MESSAGE);
            }
            //Return all lines from the file.
            return contents;
        }else{
            return null;
        }
    }
    
    //Append to File, Takes file path and what string to append to the file
    public static void appendToTextFile(String filePath, String toWrite){
        try{
            //Searching for the file
            File f = new File(filePath);
            //Create File if not created already
            f.createNewFile();
            //Writer to append string to the file
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));
            //Add string to the file
            writer.println(toWrite);
            //Close the writer
            writer.close();
        }catch(IOException e){
            //Show Message dialog in case errors occured
            JOptionPane.showMessageDialog(null, "Error when trying to write on file: "+e.getMessage() ,"Error:", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
