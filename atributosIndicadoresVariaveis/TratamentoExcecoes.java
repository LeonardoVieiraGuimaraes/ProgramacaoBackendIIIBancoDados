package AtributosIndicadoresVariaveis;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // Isso causará um erro (ArrayIndexOutOfBoundsException)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Acesso a um índice do array que não existe.");
        } finally {
            System.out.println("O bloco 'finally' sempre é executado.");
        }
    }
}