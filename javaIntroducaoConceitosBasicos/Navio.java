package javaIntroducaoConceitosBasicos;

public class Navio {
    private String cor;
    private String combustivel;
    private int qtdePasseiros;
    private int qtdeTripulantes;

    // Getters
    public String getCor() {
        return cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getQtdePasseiros() {
        return qtdePasseiros;
    }

    public int getQtdeTripulantes() {
        return qtdeTripulantes;
    }

    // Setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setQtdePasseiros(int qtdePasseiros) {
        this.qtdePasseiros = qtdePasseiros;
    }

    public void setQtdeTripulantes(int qtdeTripulantes) {
        this.qtdeTripulantes = qtdeTripulantes;
    }

    // Método main
    public static void main(String[] args) {
        Navio navio = new Navio();
        navio.setCor("Azul");
        navio.setCombustivel("Diesel");
        navio.setQtdePasseiros(200);
        navio.setQtdeTripulantes(50);

        System.out.println("Cor do navio: " + navio.getCor());
        System.out.println("Combustível do navio: " + navio.getCombustivel());
        System.out.println("Quantidade de passageiros: " + navio.getQtdePasseiros());
        System.out.println("Quantidade de tripulantes: " + navio.getQtdeTripulantes());
    }
}
