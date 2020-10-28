package it.unical.ingsw2020.Esercitazione;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
		
    	MyMath m = new MyMath();
    	
    	ArrayList<Integer> temp = m.numeriPrimi(100);
    	
    	for(int i = 0; i < temp.size(); i++)
    		System.out.println(temp.get(i));
	}
}
