package concessionaria;

import java.util.Scanner;

import src.Veiculo;

public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n*** Concessionária ***");
            System.out.println("1. Adicionar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o tipo de veículo para adicionar:");
                    System.out.println("1. Carro");
                    System.out.println("2. Moto");
                    System.out.println("3. Caminhão");
                    System.out.println("4. Ônibus");
                    System.out.print("Digite a opção: ");
                    int tipoVeiculo = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    switch (tipoVeiculo) {
                        case 1:
                            System.out.print("Número de portas: ");
                            int numeroPortas = scanner.nextInt();
                            concessionaria.adicionarVeiculo(new Carro(modelo, marca, preco, numeroPortas));
                            break;
                        case 2:
                            System.out.print("Tem carenagem (true/false): ");
                            boolean temCarenagem = scanner.nextBoolean();
                            concessionaria.adicionarVeiculo(new Moto(modelo, marca, preco, temCarenagem));
                            break;
                        case 3:
                            System.out.print("Capacidade de carga (toneladas): ");
                            double capacidadeCarga = scanner.nextDouble();
                            concessionaria.adicionarVeiculo(new Caminhao(modelo, marca, preco, capacidadeCarga));
                            break;
                        case 4:
                            System.out.print("Número de assentos: ");
                            int numeroAssentos = scanner.nextInt();
                            concessionaria.adicionarVeiculo(new Onibus(modelo, marca, preco, numeroAssentos));
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("\n*** Lista de Veículos ***");
                    if (concessionaria.listarVeiculos().isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                        break;
                    }
                    
                    for (Veiculo veiculo : concessionaria.listarVeiculos()) {
                        System.out.println(veiculo);
                    }
                    break;

                case 3:
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
