/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.filehandler;

import com.mohit.filehandler.controller.MainProgramController;


/**
 *
 * @author Mohit
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      File file=new File("D:\\git\\FileHandler\\FileHandler\\src\\com\\mohit\\filehandler\\controller\\data.txt");
//      try{if(!file.isDirectory())
//      {
//            file.createNewFile();
//            System.out.println("New file created");
//      }
//      }catch(IOException io){
//          System.out.println(io.getLocalizedMessage());
//      
//      }
        
//        try{
//            FileWriter fw=new FileWriter("D:\\git\\FileHandler\\FileHandler\\src\\com\\mohit\\filehandler\\controller\\data.txt");
//            fw.write("1,Manish,Marahatta,manish@gmail.com,1\r\n");
//            fw.write("2,anish,arahatta,anish@gmail.com,0\r\n");
//            fw.write("3,ranish,rarahatta,ranish@gmail.com,1\r\n");
//            fw.write("2,Manish,karahatta,manish@gmail.com,0\r\n");
//            fw.write("5,xanish,xarahatta,xanish@gmail.com,1\r\n");
//            fw.close();
//                
//        }
//        catch(IOException io)
//        {
//            System.out.println(io.getLocalizedMessage());
//        }
          

        MainProgramController mp=new MainProgramController();
        mp.FileHandler();
        mp.showAll();
        
    
    }
    
}
