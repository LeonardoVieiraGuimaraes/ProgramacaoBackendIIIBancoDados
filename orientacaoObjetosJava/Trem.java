package orientacaoObjetosJava;

// Classe Trem que herda de MeioTransporte
public class Trem extends MeioTransporte {
    private int quantidadeVagoes;

    // Métodos get e set para quantidadeVagoes
    public int getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(int quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    // Sobrescrevendo o método mover() da classe MeioTransporte
    @Override
    public void mover() {
        velocidade += 30;
        System.out.println("O trem está se movendo a " + velocidade + " km/h");
    }

    // Sobrescrevendo o método acenderLuzes() da classe MeioTransporte
    @Override
    public void acenderLuzes() {
        System.out.println("As luzes do trem estão acesas.");
    }

    // Sobrecarga do método acenderLuzes() com um parâmetro
    public void acenderLuzes(String luzes) {
        System.out.println("As luzes do trem estão acesas: " + luzes);
    }
}