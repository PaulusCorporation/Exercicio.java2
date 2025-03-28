import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("📦 Cadastro de Produto");

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tamanho/peso do produto: ");
        String tamanhoPeso = scanner.nextLine();

        System.out.print("Digite a cor do produto: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();


        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);
        produto.exibirProduto();


        System.out.print("\nQuantos produtos deseja comprar? ");
        int quantidade = scanner.nextInt();

        if (produto.venderProduto(quantidade)) {
            System.out.print("\nEscolha o método de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
            scanner.nextLine();
            String metodo = scanner.nextLine();


            Pagamento pagamento = new Pagamento(metodo, produto.getValor() * quantidade);

            if (metodo.equalsIgnoreCase("espécie")) {
                System.out.print("💵 Digite o valor pago: R$ ");
                double valorPago = scanner.nextDouble();
                pagamento.processarPagamento(valorPago);
            } else {
                pagamento.processarPagamento(0);
            }
        }

        scanner.close();
    }
}
