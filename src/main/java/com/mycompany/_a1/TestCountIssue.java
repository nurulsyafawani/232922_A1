package com.mycompany._a1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestCountIssue{
   public static  int countissuenum () {
        int issueNum=0;
        File f= new File("C:\\Users\\USER\\Desktop\\testfile");
        File[] listOfFiles = f.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
        File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".java")) {
                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(new FileReader(file));

                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains("public static void main")){
                            issueNum++;
                        }
                    }       

                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
        }
        //System.out.println("Issue Num: "+issueNum);
        return issueNum;
    }
}