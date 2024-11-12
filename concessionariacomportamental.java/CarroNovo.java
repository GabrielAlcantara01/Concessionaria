public class CarroNovo implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.10; // 10%
    }
}

