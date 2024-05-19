package OrientacaoObjetosJava;

// Classe Navio que herda de MeioTransporte
public class Navio extends MeioTransporte {
    private int quantidadeCabines;

    // Métodos get e set para quantidadeCabines
    public int getQuantidadeCabines() {
        return quantidadeCabines;
    }

    public void setQuantidadeCabines(int quantidadeCabines) {
        this.quantidadeCabines = quantidadeCabines;
    }

    // Sobrescrevendo o método mover() da classe MeioTransporte
    @Override
    public void mover() {
        velocidade += 20;
        System.out.println("O navio está se movendo a " + velocidade + " km/h");
    }

    // Sobrescrevendo o método acenderLuzes() da classe MeioTransporte
    @Override
    public void acenderLuzes() {
        System.out.println("As luzes do navio estão acesas.");
    }

    // Sobrecarga do método acenderLuzes() com um parâmetro
    public void acenderLuzes(String luzes) {
        System.out.println("As luzes do navio estão acesas: " + luzes);
    }
}