/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fikri.WordModel;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class lala {

  
    public static void main(String[] args) {
      List<WordModel>words=new ArrayList<>();
            
        try {
            
            Scanner scan=new Scanner(new File("D:\\bootcampjava\\netbeans\\TebakNama\\data.txt")) ;
            while(scan.hasNextLine()){
                String bankSoal=scan.nextLine();
                String[]data=bankSoal.split(",");
                String soal=data[0];
                String hint=data[1].trim();
                WordModel wm=new WordModel(soal, hint);
                words.add(wm);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordQuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(words);
    }
    
}
