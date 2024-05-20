package AtributosIndicadoresVariaveis;

class VetorMatriz {
    public static void main(String[] args) {
        // Vetor
        int[] vetor = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento do vetor na posição " + i + " é: " + vetor[i]);
        }

        // Matriz
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento da matriz na posição [" + i + "][" + j + "] é: " + matriz[i][j]);
            }
        }
    }
}