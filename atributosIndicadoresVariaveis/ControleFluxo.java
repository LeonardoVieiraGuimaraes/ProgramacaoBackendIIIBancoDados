package atributosIndicadoresVariaveis;

class ControleFluxo {
    public static void main(String[] args) {
        // if-else
        int idade = 20;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // switch-case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            // ... e assim por diante até o sábado
            default:
                System.out.println("Dia inválido");
        }

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

        // while loop
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // do-while loop
        int contadorDoWhile = 0;
        do {
            System.out.println("Contador do-while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 5);
    }
}