package com.mycompany._a1;


import java.io.File;


public class Assignment1 {
        public static void main(String args[]) {
            
              
             File f = new File("C:\\Users\\USER\\Desktop\\testfile");
             //ArrayList<String> fileName = FileName.getFileName();
            
             countjavafile cjf = new countjavafile();
             int cc = cjf.count(f);
             TestCountIssue tci = new TestCountIssue();
             int cin = tci.countissuenum();
             
             System.out.println("Number of files: " + cc); 
             System.out.println("Number of issues: " + cin);
             
             
    }
         
    
        }
