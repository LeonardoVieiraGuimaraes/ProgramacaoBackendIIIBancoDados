package OrientacaoObjetosJava;

// Classe abstrata MeioTransporte
public abstract class MeioTransporte {
    protected int velocidade;
    protected int ano;
    protected int quantidadePassageiros;
    protected String combustivel;

    // Métodos get e set para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos get e set para quantidadePassageiros
    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    // Métodos get e set para combustivel
    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    // Método abstrato para ser implementado pelas subclasses
    public abstract void mover();

    public int getVelocidade() {
        return velocidade;
    }

    // Método acenderLuzes() adicionado
    public void acenderLuzes() {
        System.out.println("As luzes estão acesas.");
    }

    // Sobrecarga do método acenderLuzes() com um parâmetro
    public void acenderLuzes(String luzes) {
        System.out.println("As luzes estão acesas: " + luzes);
    }
}