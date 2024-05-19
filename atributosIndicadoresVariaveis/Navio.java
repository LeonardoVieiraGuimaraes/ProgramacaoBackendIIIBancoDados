package AtributosIndicadoresVariaveis;

public class Navio {
    // Atributos privados
    private String cor;
    private int qtdeTripulantes;

    // Atributos protegidos
    protected String combustivel;

    // Atributos públicos
    public int qtdePasseiros;

    // Métodos getters e setters para os atributos privados
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdeTripulantes() {
        return qtdeTripulantes;
    }

    public void setQtdeTripulantes(int qtdeTripulantes) {
        this.qtdeTripulantes = qtdeTripulantes;
    }

    // Método main para executar o exemplo
    public static void main(String[] args) {
        Navio navio = new Navio();

        navio.setCor("Azul");
        navio.combustivel = "Diesel";
        navio.qtdePasseiros = 200;
        navio.setQtdeTripulantes(50);

        System.out.println("Cor do navio: " + navio.getCor());
        System.out.println("Combustível do navio: " + navio.combustivel);
        System.out.println("Quantidade de passageiros: " + navio.qtdePasseiros);
        System.out.println("Quantidade de tripulantes: " + navio.getQtdeTripulantes());
    }
}