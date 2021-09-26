package com.rough;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

public class FileCheck {
public static void main(String[] args) {
	String home = System.getProperty("user.home");
	home = home + "\\Downloads";
	System.out.println(home);
	File f = new File(home+"\\Product.doc");
	System.out.println(f);
	if (f.exists()) 
        System.out.println("Exists"); 
    else
        System.out.println("Does not Exists"); 
	/*Path p = Paths.get("C:/Users/santo/Downloads/Product.txt");
	boolean exists = Files.exists(p);
	boolean notExists = Files.notExists(p);

	if (exists) {
	    System.out.println("File exists!");
	} else if (notExists) {
	    System.out.println("File doesn't exist!");
	} else {
	    System.out.println("File's status is unknown!");
	}*/
	//String path = "C:/Users/santo/Downloads/Product.txt";
	//String filename = Files.g
	//System.out.println(filename);
	/*String fileName = "C:/Users/santo/Downloads/Product.doc";
	String extension = null;
    List<String> list = new ArrayList<>();
    do{
        extension =  FilenameUtils.getExtension(fileName);
        if(extension==null){
            break;
        }
        if(!extension.isEmpty()){
            list.add("."+extension);
        }
        fileName = FilenameUtils.getBaseName(fileName);
    }while (!extension.isEmpty());
    Collections.reverse(list);
    System.out.println(list.toString());*/
}

}
