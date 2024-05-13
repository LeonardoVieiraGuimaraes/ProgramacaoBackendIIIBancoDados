package orientacaoObjetosJava;

// Classe Carro que herda de MeioTransporte
public class Carro extends MeioTransporte {
    private int quantidadeRodas;

    // Métodos get e set para quantidadeRodas
    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    // Sobrescrevendo o método mover() da classe MeioTransporte
    @Override
    public void mover() {
        velocidade += 10;
        System.out.println("O carro está se movendo a " + velocidade + " km/h");
    }

    // Sobrescrevendo o método acenderLuzes() da classe MeioTransporte
    @Override
    public void acenderLuzes() {
        System.out.println("As luzes do carro estão acesas.");
    }

    // Sobrecarga do método acenderLuzes() com um parâmetro
    public void acenderLuzes(String luzes) {
        System.out.println("As luzes do carro estão acesas: " + luzes);
    }
}