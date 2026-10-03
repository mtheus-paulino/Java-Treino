package entities;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    // Utilização de Coleção (ArrayList) para armazenamento dinâmico das moedas
    private List<Moeda> listaMoedas = new ArrayList<>();

    // Adiciona uma moeda à lista (polimorfismo: aceita qualquer subclasse de Moeda)
    public void adicionar(Moeda moeda){
        listaMoedas.add(moeda);
    }

    // Remove uma moeda da lista (depende da correta implementação do método equals na classe filha)
    public void remover(Moeda moeda){
        listaMoedas.remove(moeda);
    }

    // Polimorfismo em ação: chama o método info() específico de cada tipo de moeda na lista
    public void listagemMoedas(){

        //Verifica se tem algo no Array, se não tiver exibe a mensagem
        if (listaMoedas.isEmpty()){
            System.out.println("Seu confrinho está vazio!");
        }else {
            for (Moeda moeda : listaMoedas){
                moeda.info();
            }
        }

    }

    // Percorre a lista somando os valores já convertidos para Real através do método converter()
    public double totalConvertido(){
        double total = 0.0;
        for (Moeda moeda : listaMoedas){
            total += moeda.converter();
        }
        return total;
    }
}