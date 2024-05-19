package atributosIndicadoresVariaveis;

// Interface para definir um método que todas as classes que a implementam devem ter
interface InterfaceExemplo {
    void metodoInterface();
}

// Classe abstrata que implementa a interface
abstract class ClasseAbstrata implements InterfaceExemplo {
    // Método abstrato que deve ser implementado pelas subclasses
    abstract void metodoAbstrato();
}

// Classe concreta que estende a classe abstrata
class ClasseConcreta extends ClasseAbstrata {
    // Implementação do método abstrato
    void metodoAbstrato() {
        System.out.println("Implementação do método abstrato");
    }

    // Implementação do método da interface
    public void metodoInterface() {
        System.out.println("Implementação do método da interface");
    }

    // Método nativo (geralmente escrito em C, C++ ou outra linguagem de baixo
    // nível)
    public native void metodoNativo();

    // Método estático
    public static void metodoEstatico() {
        System.out.println("Método estático");
    }

    // Método final (não pode ser sobrescrito por subclasses)
    public final void metodoFinal() {
        System.out.println("Método final");
    }
}

// Método main para executar o exemplo
public class Main {
    static {
        System.loadLibrary("bibliotecaNativa"); // Carrega a biblioteca nativa
    }

    public static void main(String[] args) {
        ClasseConcreta obj = new ClasseConcreta();

        obj.metodoAbstrato();
        obj.metodoInterface();
        obj.metodoNativo();
        ClasseConcreta.metodoEstatico();
        obj.metodoFinal();
    }
}
