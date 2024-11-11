public class VeiculoFactory {
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("sedan")) {
            return new CarroSedan();
        } else if (tipo.equalsIgnoreCase("suv")) {
            return new CarroSUV();
        } else {
            return null;
        }
    }
}
