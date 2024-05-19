package OrientacaoObjetosJava;

public class MainMeioTransporte {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setAno(2020);
        carro.setQuantidadePassageiros(5);
        carro.setCombustivel("Gasolina");
        carro.setQuantidadeRodas(4);
        carro.mover();
        carro.acenderLuzes();
        carro.acenderLuzes("Faróis dianteiros");

        Navio navio = new Navio();
        navio.setAno(2010);
        navio.setQuantidadePassageiros(200);
        navio.setCombustivel("Diesel");
        navio.setQuantidadeCabines(50);
        navio.mover();
        navio.acenderLuzes();
        navio.acenderLuzes("Luzes de cabine");

        Trem trem = new Trem();
        trem.setAno(1990);
        trem.setQuantidadePassageiros(500);
        trem.setCombustivel("Eletricidade");
        trem.setQuantidadeVagoes(10);
        trem.mover();
        trem.acenderLuzes();
        trem.acenderLuzes("Luzes de vagão");
    }
}