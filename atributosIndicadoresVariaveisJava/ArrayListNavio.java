package atributosIndicadoresVariaveisJava;

// Importa a classe ArrayList do pacote java.util
import java.util.ArrayList;

// // Importa a classe Navio do pacote atributosIndicadoresVariaveisJava
// import atributosIndicadoresVariaveisJava.Navio;

public class ArrayListNavio {
    public static void main(String[] args) {
        // Cria um ArrayList de Navios
        ArrayList<Navio> listaNavios = new ArrayList<Navio>();

        // Cria o primeiro navio
        Navio navio1 = new Navio();
        // Define a cor do primeiro navio
        navio1.setCor("Azul");
        // Define o combustível do primeiro navio
        navio1.combustivel = "Diesel";
        // Define a quantidade de passageiros do primeiro navio
        navio1.qtdePasseiros = 200;
        // Define a quantidade de tripulantes do primeiro navio
        navio1.setQtdeTripulantes(50);
        // Adiciona o primeiro navio à lista de navios
        listaNavios.add(navio1);

        // Cria o segundo navio
        Navio navio2 = new Navio();
        // Define a cor do segundo navio
        navio2.setCor("Vermelho");
        // Define o combustível do segundo navio
        navio2.combustivel = "Gasolina";
        // Define a quantidade de passageiros do segundo navio
        navio2.qtdePasseiros = 150;
        // Define a quantidade de tripulantes do segundo navio
        navio2.setQtdeTripulantes(30);
        // Adiciona o segundo navio à lista de navios
        listaNavios.add(navio2);

        // Loop que percorre todos os navios da lista
        for (Navio navio : listaNavios) {
            // Exibe a cor do navio atual
            System.out.println("Cor do navio: " + navio.getCor());
            // Exibe o combustível do navio atual
            System.out.println("Combustível do navio: " + navio.combustivel);
            // Exibe a quantidade de passageiros do navio atual
            System.out.println("Quantidade de passageiros: " + navio.qtdePasseiros);
            // Exibe a quantidade de tripulantes do navio atual
            System.out.println("Quantidade de tripulantes: " + navio.getQtdeTripulantes());
            // Exibe uma linha separadora
            System.out.println("-----------------------------");
        }
    }
}