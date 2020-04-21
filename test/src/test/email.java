package test;

import java.util.Scanner;

public class email {
	public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String regex="^(?i)(?:\\w+)[(?:\\.[-\\w]+)(?:[-\\w]+)]*@(?:[a-z0-9]+)(?:-[a-z0-9]+)*(?:\\.[a-z0-9]+)+$";
//        String regex1="^(?:\\\\w+)[(?:\\\\.[-\\\\w]+)(?:[-\\\\w]+)]*@(?:[a-zA-Z0-9]+)(?:-[a-zA-Z0-9]+)*(?:\\\\.[a-zA-Z0-9]+)+$";
        System.out.println("input");
        boolean flag=false;
        while(scanner.hasNext()){
            if(flag)
                System.out.println("input");
            flag=true;
            String sta=scanner.next();

            if(sta.matches(regex)){
                System.out.println(sta+" yes");
            }else{
                System.out.println(sta+" no");
            }
        }
    }
}
