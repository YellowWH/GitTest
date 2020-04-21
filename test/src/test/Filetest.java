package test;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class Filetest {
	public static void main(String agrs[]) {
		System.out.println("input number : "
				+ "\n1.check directory "
				+ "\n2.check isfile"
				+ "\n3.absoultaddress"
				+ "\n4.createfile"
				+ "\n5.createdirectory"
				+ "\n6.deletefile"
				+ "\n7.canread"
				+ "\n8.charread"
				+ "\n9.strread"
				+ "\n10.write"
				+ "\n11.strwrite");
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		if(val == 1) {
			checkDirectory();	
		}else if(val==2) {
			isFile();
		}else if(val==3) {
			abPath();
		}else if(val==4) {
			newFile();
		}else if(val==5) {
			newDirection();
		}else if(val==6) {
			deleteFile();
		}else if(val==7) {
			canRead();
		}else if(val==8) {
			fileRead();
		}else if(val==9) {
			strFileRead();
		}else if(val==10) {
			fileWrite();
		}else if(val==11) {
			strWrite();
		}
	}
	private static void checkDirectory() {
		File cdirectory = new File(".\\");
		
		String filelist[] = cdirectory.list();
		for(int i=0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
	}
	private static void isFile() {
		File cdirectory = new File(".\\");
		
		File filelist[] = cdirectory.listFiles();
		for(int i=0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[F]" + filelist[i].getName());
			}else if(filelist[i].isDirectory()) {
				System.out.println("[D]" + filelist[i].getName());
			}else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
	}
	private static void abPath() {
		File file = new File("aaa.txt");
	    String path = file.getAbsolutePath();

	    System.out.println("FileF" + path);
	}
	private static void newFile() {
		File newfile = new File(".\\src\\test\\1900\\newfile.txt");
		try {
			if(newfile.createNewFile()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private static void newDirection() {
		File newfile = new File(".\\src\\test\\1900\\newfile");
		
		if(newfile.mkdirs()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	private static void deleteFile() {
		File newfile = new File(".\\src\\test\\1900\\newfile.txt");
		
		if(newfile.exists()) {
			if(newfile.delete()) {
				System.out.println("yes");
			}else {
				System.out.println("no");

			}
		}else {
			System.out.println("not exists");
		}
	}
	private static void canRead() {
		File file = new File(".\\src\\test\\1900\\newfile.txt");
		
		checkFileRead(file);
		
		if (file.setReadOnly()) {
			System.out.println("become readonly");
		}else {
			System.out.println("not become readonly");
		}
		checkFileRead(file);
		
		if(file.setWritable(true)) {
			System.out.println("become readandwrite");
		}else {
			System.out.println("not become readandwrite");
		}
		checkFileRead(file);
	}
	private static void checkFileRead(File file) {
		if(file.canRead()) {
			System.out.println("can Read");
		}
		if(file.canWrite()) {
			System.out.println("can Write");
		}
	}
	private static void fileRead() {
		try {
			File file = new File(".\\src\\test\\2000\\file.txt");
			if(checkFileExistAndRead(file)) {
				FileReader fr = new FileReader(file);
				int ch;
				while((ch = fr.read()) != -1) {
					System.out.print((char)ch);
				}
				fr.close();
			}else {
				System.out.println("cannot open or read or exist");
			}
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private static void strFileRead() {
		try {
			File file = new File(".\\src\\test\\2000\\file.txt");
			if(checkFileExistAndRead(file)) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				
				String str;
				while((str = br.readLine()) != null) {
					System.out.println(str);
				}
				br.close();
			}else {
				System.out.println("cannot open or read or exist");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private static void fileWrite() {
		try {
			File file = new File(".\\src\\test\\2000\\file.txt");
			if(checkFileExistAndWrite(file)) {
				FileWriter filewrite = new FileWriter(file);
				
				filewrite.write("1111");
				filewrite.write("2222");
				
				filewrite.close();
			}else {
				System.out.println("cannot open or write or exist");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private static void strWrite() {
		try {
			File file = new File(".\\src\\test\\2000\\file.txt");
			if(checkFileExistAndWrite(file)) {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
				
				pw.println("121212");
		        pw.println(10);
		        pw.println("333222");
		        
		        pw.close();
			}else {
				System.out.println("cannot open or write or exist");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private static boolean checkFileExistAndRead(File file) {
		if(file.exists()) {
			if(file.isFile()&&file.canRead()) {
				return true;
			}
		}
		return false;
	}
	private static boolean checkFileExistAndWrite(File file) {
		if(file.exists()) {
			if(file.isFile()&&file.canWrite()) {
				return true;
			}
		}
		return false;
	}
}
