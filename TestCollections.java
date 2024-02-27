package br.com.fiap.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList carrinho = new ArrayList();
		
		Double vlr = 100.55;
		int vlr2 = 1;
		int vlr3;
		
		carrinho.add(vlr);
		carrinho.add("Uva");
		carrinho.add(vlr2);
		
		System.out.println(carrinho.get(1));
		
		vlr3 = (int) carrinho.get(2);
		
		System.out.println(vlr3);
		System.out.println("");
		
		//Interface List e uso de Generics
		//Generics não permite tipos primitivos
		
		List<String> cart = new ArrayList<String>();
		
		System.out.println(cart.isEmpty());
		
		cart.add("Maça");
		cart.add("Morango");
		cart.add("Maça");
		cart.set(1, "Pera");
		
		System.out.println(cart.isEmpty());
		System.out.println(cart.size());
		System.out.println("");
		
		List<String> cart1 = new ArrayList<String>();
		cart1.add("Maça");
		cart1.add("Morango");
		cart1.add("Maça");
		
		System.out.println(cart1.contains("Maça"));
		System.out.println(cart1.indexOf("Maça"));
		System.out.println(cart1.get(cart1.indexOf("Maça")));
		System.out.println(cart1.lastIndexOf("Maça"));
		
		cart1.remove(cart1.indexOf("Maça"));
		System.out.println(cart1.get(0));
		
		cart1.clear();
		System.out.println(cart1.isEmpty());
		System.out.println("");
		
		
		//Comando Set
		Set<String> basket = new HashSet<String>();
		
		System.out.println(basket.isEmpty());
		basket.add("Maça");
		basket.add("Maça");
		basket.add("maça");
		
		System.out.println(basket.isEmpty());
		
		System.out.println(basket.size());
		System.out.println(basket);
		System.out.println("");
	
		//Comando MAP
		Map<String, String> box = new HashMap<String, String>();
		box.put("M2225", "Fernando");
		box.put("M2226", "Maria");
		box.put("M2227", "Soraya");
		
		System.out.println(box.isEmpty());
		System.out.println(box.size());
		System.out.println(box.containsKey("M2225"));
		System.out.println(box.containsValue("Fernando"));
		System.out.println(box);
		
	}
	
}
