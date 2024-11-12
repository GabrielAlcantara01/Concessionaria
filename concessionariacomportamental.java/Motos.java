public class Motos implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.05; // 5%
    }
}
