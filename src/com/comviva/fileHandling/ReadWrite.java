package com.comviva.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWrite 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Employee Id");
	int id=Integer.parseInt(bf.readLine());
	System.out.println("Enetr your name");
	String name=bf.readLine();
	System.out.println("Enter you salery");
	double salery=Double.parseDouble(bf.readLine());
	File f=new File("name.txt");
	//it checks that file exists or not
	//if file is not there it will create
	if(f.exists()==false)
		f.createNewFile();
	
	BufferedWriter bfw=new BufferedWriter(new FileWriter(f,true));
	bfw.write("name="+name+" ");
	bfw.write("id="+id+" ");
	bfw.write("salery="+String.valueOf(salery)+" ");
	bfw.newLine();
	bfw.close();
	bf.close();
	BufferedReader bf1=new BufferedReader(new FileReader("name.txt"));
	String line;
	while((line=bf1.readLine())!=null)
	{
		System.out.println(line);
	}
	
	
    }

}
