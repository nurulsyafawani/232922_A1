package com.mycompany._a1;

/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

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