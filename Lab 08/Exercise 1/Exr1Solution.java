package com.capgemini.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exr1Solution {
	
	public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:\\Users\\joysu\\eclipse-workspace\\CapGLab_Module1\\src\\com\\capgemini\\lab8\\source.txt");
        File output = new File("C:\\Users\\joysu\\eclipse-workspace\\CapGLab_Module1\\src\\com\\capgemini\\lab8\\target.txt");

        FileInputStream fIn = new FileInputStream(input);
        FileOutputStream fOut = new FileOutputStream(output);
        Exr1ThreadClass th = new Exr1ThreadClass(fIn, fOut);
        th.run();
    }

}
