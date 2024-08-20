public class ListaEncadeada<T> {
    private Celula<T> primeira;
    private Celula<T> ultima;
    private int totalElementos = 0;

    public void adicionarInicio(T elemento) {
        Celula<T> nova = new Celula<T>(elemento, null, this.primeira);
        this.primeira = nova;

        if (this.totalElementos == 0) {
            this.ultima = nova;
        } else {
            nova.getProxima().setAnterior(nova);
        }

        this.totalElementos++;
    }

    public void adicionarFinal(T elemento) {
        Celula<T> nova = new Celula<T>(elemento, this.ultima, null);
        this.ultima = nova;

        if (this.totalElementos == 0) {
            this.primeira = nova;
        } else {
            nova.getAnterior().setProxima(nova);
        }

        this.totalElementos++;
    }

    public void adicionarPosicao(T elemento, int posicao) {
        if (posicao == 0) {
            this.adicionarInicio(elemento);
            return;
        }
        if (posicao == this.totalElementos) {
            this.adicionarFinal(elemento);
            return;
        }

        Celula<T> aux = this.pesquisarCelula(posicao - 1);
        Celula<T> nova = new Celula<T>(elemento, aux, aux.getProxima());
        aux.getProxima().setAnterior(nova);
        aux.setProxima(nova);

        this.totalElementos++;
    }

    //TODO: remover por posição, remover do início e remover do final

    public Celula<T> pesquisarCelula(int posicao) {
        if (posicao <= (this.totalElementos - 1) / 2) {
            Celula<T> aux = this.primeira;
            for (int i = 0; i < posicao; i++) {
                aux = aux.getProxima();
            }
            return aux;
        } else {
            Celula<T> aux = this.ultima;
            for (int i = this.totalElementos - 1; i > posicao; i--) {
                aux = aux.getAnterior();
            }
            return aux;
        }
    }

    public void imprimir() {
        Celula<T> aux = this.primeira;

        System.out.print("[");
        for (int i = 0; i < this.totalElementos - 1; i++) {
            System.out.print(aux.getElemento() + ", ");
            aux = aux.getProxima();
        }
        System.out.println(aux.getElemento() + "]");
    }

    public int tamanho() {
        return this.totalElementos;
    }
}
