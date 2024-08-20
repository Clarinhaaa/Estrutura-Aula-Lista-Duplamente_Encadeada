public class Celula<T> {
    private T elemento;
    private Celula<T> anterior;
    private Celula<T> proxima;

    public Celula(T elemento, Celula<T> anterior, Celula<T> proxima) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.proxima = proxima;
    }

    public Celula(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Celula<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula<T> anterior) {
        this.anterior = anterior;
    }

    public Celula<T> getProxima() {
        return proxima;
    }

    public void setProxima(Celula<T> proxima) {
        this.proxima = proxima;
    }

}
