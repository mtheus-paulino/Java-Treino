package application;

import entities.*;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Define o padrão Americano para aceitar ponto (.) em vez de vírgula (,) em números decimais
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        // Loop principal que mantém o menu rodando até que o usuário decida sair (opção 0)
        do {
            try {
                Menu.menuPrincipal();
                int op = sc.nextInt();
                sc.nextLine(); // Consome a quebra de linha após o número

                int tipoMoeda;
                double valorMoeda;
                switch (op) {
                    case 1: // Adicionar moeda
                        System.out.println("\nQual moeda você deseja adicionar?");
                        Menu.moedas();
                        tipoMoeda = sc.nextInt();
                        System.out.print("Digite o valor: ");
                        valorMoeda = sc.nextDouble();
                        sc.nextLine(); // Consome a quebra de linha após o número

                        if (tipoMoeda == 1) {
                            cofrinho.adicionar(new Dolar(valorMoeda));
                        } else if (tipoMoeda == 2) {
                            cofrinho.adicionar(new Euro(valorMoeda));
                        } else if (tipoMoeda == 3) {
                            cofrinho.adicionar(new Real(valorMoeda));
                        } else {
                            System.out.println("\nMoeda inválida!");
                        }
                        System.out.println("Pressione ENTER para continuar....");
                        sc.nextLine();
                        break;

                    case 2: // Remover moeda
                        System.out.println("\nQual moeda você deseja remover?");
                        Menu.moedas();
                        tipoMoeda = sc.nextInt();
                        System.out.print("Digite o valor: ");
                        valorMoeda = sc.nextDouble();
                        sc.nextLine();// Consome a quebra de linha

                        if (tipoMoeda == 1) {
                            cofrinho.remover(new Dolar(valorMoeda));
                        } else if (tipoMoeda == 2) {
                            cofrinho.remover(new Euro(valorMoeda));
                        } else if (tipoMoeda == 3) {
                            cofrinho.remover(new Real(valorMoeda));
                        } else {
                            System.out.println("\n#####################################################");
                            System.out.println("Moeda inválida");
                            System.out.println("\n#####################################################");
                        }
                        System.out.println("pressione ENTER para continuar....");
                        sc.nextLine();
                        break;

                    case 3: // Listar moedas cadastradas
                        System.out.println("\n#####################################################");
                        cofrinho.listagemMoedas();
                        System.out.println("#####################################################");
                        System.out.println("\nPressione ENTER para continuar....");
                        sc.nextLine();
                        break;

                    case 4: // Converter tudo para Reais
                        System.out.println("\n#####################################################");
                        System.out.printf("Total em Reais R$ %.2f%n", cofrinho.totalConvertido());
                        System.out.println("Pressione ENTER para continuar....");
                        System.out.println("#####################################################");
                        sc.nextLine();
                        break;
                    case 0:
                        System.out.println("Encerrando....");
                        return; //Encerra o método main e o programa com segurança

                    default: // Tratamento para opções numéricas fora do escopo
                        System.out.println("\n#####################################################");
                        System.out.println("Opção inválida!");
                        System.out.print("Pressione ENTER para continuar....");
                        System.out.println("\n#####################################################");
                        sc.nextLine();
                        break;
                }
            } catch (InputMismatchException e) {
                // Tratamento de exceção essencial: evita loop infinito caso o usuário digite letras em vez de números
                System.out.println("\n#####################################################");
                System.out.println("Erro: Você precisa digitar um valor numérico válido!");
                sc.nextLine(); // IMPORTANTE: Limpa o buffer com o valor inválido para evitar loop infinito
                System.out.print("Pressione ENTER para continuar....");
                System.out.println("\n#####################################################");
                sc.nextLine();
            }
        }while (true);

    }
}
