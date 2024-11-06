/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;

import  java.util.LinkedList;

/**
 *
 * @author My PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LinkedList<String> tahan = new LinkedList();
    tahan.add("kiss");
    tahan.add("hug");
    tahan.add("lambing");
    tahan.pop();
        System.out.println("David wants " + tahan);
        
//    tahan.push("1");
//    tahan.push("2");
//    tahan.push("3");
//    tahan.push("4");
//    tahan.pop();
    
    tahan.offer("A");
    tahan.offer("B");
    tahan.offer("C");
    tahan.offer("D");
    tahan.poll();
        System.out.println(tahan);
    }
    
}
