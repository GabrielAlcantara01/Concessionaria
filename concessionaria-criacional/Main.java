public class Main {
    public static void main(String[] args) {
        VeiculoFactory factory = new VeiculoFactory();
        
        // Criando um Carro Sedan
        Veiculo carroSedan = factory.criarVeiculo("sedan");
        System.out.println(carroSedan.getDescricao());
        
        // Criando um Carro SUV
        Veiculo carroSUV = factory.criarVeiculo("suv");
        System.out.println(carroSUV.getDescricao());
    }
}
