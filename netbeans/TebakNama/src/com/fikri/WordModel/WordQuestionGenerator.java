package com.fikri.WordModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class WordQuestionGenerator { 
    public static List<WordModel>createQuestionOnCollection(){
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
        
       return words;
    }
}
