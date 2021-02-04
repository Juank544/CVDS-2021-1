package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App{
    public static void main(String[] args){
        if(String.join("",args)==""){
            System.out.println("Hello World!");    
        }
        else{
            System.out.println("Hello "+String.join(" ",args)+"!");
        }
    }
}
