public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adicionarInicio(1);
        lista.adicionarInicio(2);
        lista.adicionarInicio(3);
        lista.adicionarFinal(4);

        lista.adicionarPosicao(5, 2);

        lista.imprimir();
        System.out.println("Total de elementos da lista: " + lista.tamanho());
    }
}
