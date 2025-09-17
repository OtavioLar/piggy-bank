package empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== COFRINHO ===");
            System.out.print("\n====M===========");
            System.out.print("\n=E=º========S===");
            System.out.println("\n====W====W======");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total convertido para Real");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Aqui eu coloquei a verificação porque eu estava escrevendo o nome da moeda e nao o int dela
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número!");
                scanner.next(); // Caso digite a opção invalida
            }
            opcao = scanner.nextInt();

            // Aqui eu coloquei as opções de moedas
            switch (opcao) {
                case 1:
                    int tipoMoeda = -1;
                    while (tipoMoeda < 1 || tipoMoeda > 3) {
                        System.out.println("Escolha a moeda:");
                        System.out.println("1 - Dólar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        System.out.print("Digite o número correspondente: ");
                        
                        // Caso digite alguma opção invalida
                        while (!scanner.hasNextInt()) {
                            System.out.println("Opção inválida. Digite um número!");
                            scanner.next();
                        }
                        tipoMoeda = scanner.nextInt();
                    }

                    System.out.print("Informe o valor: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Valor inválido. Digite um número!");
                        scanner.next();
                    }
                    double valor = scanner.nextDouble();

                    switch (tipoMoeda) {
                        case 1:
                            cofrinho.adicionar(new Dolar(valor));
                            break;
                        case 2:
                            cofrinho.adicionar(new Euro(valor));
                            break;
                        case 3:
                            cofrinho.adicionar(new Real(valor));
                            break;
                    }
                    break;

                 // No caso 2 foi implementado a opção de remover moeda do cofrinho
                case 2:
                    System.out.println("Remover moeda: digite tipo e valor exato");
                    tipoMoeda = -1;
                    while (tipoMoeda < 1 || tipoMoeda > 3) {
                        System.out.println("Escolha a moeda:");
                        System.out.println("1 - Dólar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        System.out.print("Digite o número correspondente: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Opção inválida. Digite um número!");
                            scanner.next();
                        }
                        tipoMoeda = scanner.nextInt();
                    }
                    
                    //  Onde vai informar o valor e com verificador caso digite uma opção invalida
                    System.out.print("Informe o valor: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Valor inválido. Digite um número!");
                        scanner.next();
                    }
                    valor = scanner.nextDouble();

                    Moeda moedaRemover = null;
                    switch (tipoMoeda) {
                        case 1:
                            moedaRemover = new Dolar(valor);
                            break;
                        case 2:
                            moedaRemover = new Euro(valor);
                            break;
                        case 3:
                            moedaRemover = new Real(valor);
                            break;
                    }
                    cofrinho.remover(moedaRemover);
                    break;

                    
                    //Aqui foi implementado a opção de listagem das moedas
                case 3:
                    cofrinho.listagemMoedas();
                    break;

                  //Aqui foi implementado a para poder verificar o valor convertido em real
                case 4:
                    System.out.println("Total em Reais: " + cofrinho.totalConvertido());
                    break;
                    
                    // Encerra o programa
                case 0:
                    System.out.println("Saindo do Cofrinho...");
                    break;
                    
                    //Caso digite alguma opção invalida
                default:
                    System.out.println("Opção inválida! Digite um número de 0 a 4.");
            }
        }

        scanner.close();
    }
}