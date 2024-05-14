package conceitosBasicos;

public class Main {
    public static void main(String[] args) {
        Navio navio1 = new Navio();
        navio1.setCor("Azul");
        navio1.setCombustivel("Diesel");
        navio1.setQtePassageiros(100);
        navio1.setQtdTripulantes(50);

        System.out.println("Cor: " + navio1.getCor());
        System.out.println("Combustível: " + navio1.getCombustivel());
        System.out.println("Quantidade de passageiros: " + navio1.getQtePassageiros());
        System.out.println("Quantidade de tripulantes: " + navio1.getQtdTripulantes());

    }
}
