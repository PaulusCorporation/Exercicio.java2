public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTamanhoPeso() { return tamanhoPeso; }
    public void setTamanhoPeso(String tamanhoPeso) { this.tamanhoPeso = tamanhoPeso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public void exibirProduto() {
        System.out.println("\n🔹 Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tamanho/Peso: " + tamanhoPeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$" + valor);
        System.out.println("Estoque disponível: " + quantidadeEstoque);
    }

    public boolean venderProduto(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("❌ Estoque insuficiente!");
            return false;
        }
        quantidadeEstoque -= quantidade;
        System.out.println("✅ Venda realizada! Estoque atualizado: " + quantidadeEstoque);
        return true;
    }
}
