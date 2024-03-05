package br.com.tbiazin.tarefaMod11;

import java.util.ArrayList;
import java.util.List;

public class TarefaMod11 {
    
    public static void main(String[] args) {
        nomes();
    }
    
    private static void nomes() {
        System.out.println("****** Candidatos ******");
        List<Pessoa> listaNomes = new ArrayList<Pessoa>();
        listaNomes.add(new Pessoa("Paloma", "Feminino"));
        listaNomes.add(new Pessoa("Jéssica", "Feminino"));
        listaNomes.add(new Pessoa("Pedro", "Masculino"));
        listaNomes.add(new Pessoa("Ana", "Feminino"));
        listaNomes.add(new Pessoa("Tiago", "Masculino"));
        listaNomes.add(new Pessoa("Micaely", "Feminino"));
        listaNomes.add(new Pessoa("Hugo", "Masculino"));
        System.out.println(listaNomes);
        System.out.println("");
        
        List<Pessoa> mulheres = new ArrayList<Pessoa>();
        List<Pessoa> homens = new ArrayList<Pessoa>();
        
        for (Pessoa pessoa : listaNomes) {
            if (pessoa.getSexo().equals("Feminino")) {
                mulheres.add(pessoa);
            } else {
                homens.add(pessoa);
            }
        }
        
        System.out.println("****** Lista de Mulheres ******");
        System.out.println(mulheres);
        
        System.out.println("****** Lista de Homens ******");
        System.out.println(homens);
        
        System.out.println("");
        
        System.out.println("****** Adicionando Adriana ******");
        listaNomes.add(new Pessoa("Adriana", "Feminino"));
        mulheres.add(new Pessoa("Adriana", "Feminino"));
        System.out.println(listaNomes);
        System.out.println(mulheres);
        
        System.out.println("****** Removendo Ana ******");
        for (int i = 0; i < listaNomes.size(); i++) {
            if (listaNomes.get(i).getNome().equals("Ana")) {
                listaNomes.remove(i);
                break;
            }
        }
        for (int i = 0; i < mulheres.size(); i++) {
            if (mulheres.get(i).getNome().equals("Ana")) {
                mulheres.remove(i);
                break;
            }
        }
        System.out.println(listaNomes);
        System.out.println(mulheres);
    }
}

class Pessoa {
    private String nome;
    private String sexo;
    
    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
