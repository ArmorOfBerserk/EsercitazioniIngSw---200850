package it.unical.ingsw2020.Esercitazione;

import java.util.ArrayList;

public class MyMath {

	public ArrayList<Integer> numeriPrimi(int n){
		ArrayList<Integer> listaNumeri = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			if( isPrimo(i) )
				listaNumeri.add(i);
		}
		
		return listaNumeri;
	}
	
	public boolean isPrimo(int num) {
		if (num % 2 == 0 || num < 2)
			return false;
		
		
		for( int i = 2; i < num; i++) {
			if( num % i == 0 && i != num)
				return false;
		}
		
		return true;
	}
}
