package br.com.tbiazin.tarefaMod11;

import java.util.ArrayList;
import java.util.List;

public class TarefaMod11 {

	public static void main(String[] args) {
		nomesFemininos();

	}

	private static void nomesFemininos() {
		System.out.println("****** Nomes Femininos ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Paloma");
        lista.add("Ana");
        lista.add("Micaely");
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("****** Adicionando Adriana ******");

        lista.add("Adriana");
        System.out.println(lista);
        
        System.out.println("****** Removendo Ana ******");

        lista.remove("Ana");
        System.out.println(lista);
        
        System.out.println("****** Nomes Masculinos ******");
        List<String> list = new ArrayList<String>();
        list.add("Tiago");
        list.add("Pedro");
        list.add("Lucas");
        System.out.println(list);
        System.out.println("");

        System.out.println("****** Adicionando Jorge ******");
        
        list.add("Jorge");
        System.out.println(list);

        System.out.println("****** Removendo Lucas ******");
        
        list.remove("Lucas");
        System.out.println(list);
        
	}

}
