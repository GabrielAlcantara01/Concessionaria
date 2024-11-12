public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        double valorTotal = 50000;

        concessionaria.setEstrategia(new CarroDeLeilao());
        System.out.println(concessionaria.calcularTotalComDesconto(valorTotal));

        concessionaria.setEstrategia(new CarroImportado());
        System.out.println(concessionaria.calcularTotalComDesconto(valorTotal));

        concessionaria.setEstrategia(new CarroNovo());
        System.out.println(concessionaria.calcularTotalComDesconto(valorTotal));

        concessionaria.setEstrategia(new Motos());
        System.out.println(concessionaria.calcularTotalComDesconto(valorTotal));
    }
}
