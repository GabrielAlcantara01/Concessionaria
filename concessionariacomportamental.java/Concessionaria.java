public class Concessionaria {
    private Desconto estrategia;

    public void setEstrategia(Desconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotalComDesconto(double valorTotal) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de desconto não definida.");
        }
        double desconto = estrategia.aplicarDesconto(valorTotal);
        return valorTotal - desconto;
    }
}
