package entities;

public class Menu {

    // Exibe o menu principal de opções do sistema
    public static void menuPrincipal(){
        System.out.println("Olá!! Sou o COFRINHO seu amiguinho");
        System.out.println("--------------------------------------");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Converter todas as moedas");
        System.out.println("0 - SAIR");
        System.out.print("Informe aqui: ");
    }

    // Exibe as opções de moedas disponíveis para operações de adição/remoção
    public static void moedas(){
        System.out.println("""
                            1 - Dolar
                            2 - Euro
                            3 - Real
                            """);
        System.out.print("Informe aqui: ");
    }
}