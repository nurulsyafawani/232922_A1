package com.mycompany._a1;


import java.io.File;


public class countjavafile {

    /**
     *
     * @return
     */
    public static int count(File f)  {
             f = new File("C:\\Users\\USER\\Desktop\\testfile");
               int count = 0;
                for (File file : f.listFiles()) {
                        if (file.isFile()) {
                                count++;  
                        }        
                }  
            return count;
           
            
            
        }
}