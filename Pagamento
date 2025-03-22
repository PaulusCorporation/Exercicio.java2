public class Pagamento {
    private String metodo;
    private double valorFinal;

    public Pagamento(String metodo, double valor) {
        this.metodo = metodo;
        this.valorFinal = calcularValorFinal(valor);
    }

    // Getters e Setters
    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public double getValorFinal() { return valorFinal; }
    public void setValorFinal(double valorFinal) { this.valorFinal = valorFinal; }

    private double calcularValorFinal(double valor) {
        switch (metodo.toLowerCase()) {
            case "pix":
            case "espécie":
            case "transferência":
            case "débito":
                return valor * 0.95;
            case "crédito":
                return valor;
            default:
                System.out.println("❌ Método de pagamento inválido.");
                return -1;
        }
    }

    public void processarPagamento(double valorPago) {
        if (valorFinal == -1) return;

        System.out.println("\n💳 Método de pagamento: " + metodo);
        System.out.println("Valor final a pagar: R$" + valorFinal);

        if (metodo.equalsIgnoreCase("espécie")) {
            if (valorPago < valorFinal) {
                System.out.println("❌ Valor insuficiente!");
            } else {
                double troco = valorPago - valorFinal;
                System.out.println("Troco: R$" + troco);
            }
        } else if (metodo.equalsIgnoreCase("crédito")) {
            System.out.println("💰 Parcelamento disponível em até 3x sem juros.");
        }
    }
}

