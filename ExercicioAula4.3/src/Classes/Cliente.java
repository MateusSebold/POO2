package Classes;

public class Cliente {
    public static void main(String[] args) {
        ConcecionariaDirector concecionaria = new ConcecionariaDirector(new FiatBuilder());
        concecionaria.construirCarro();
        CarroProduct carro = concecionaria.getCarro();
        System.out.println(carro);

        concecionaria = new ConcecionariaDirector(new VolksBuilder());
        concecionaria.construirCarro();
        carro = concecionaria.getCarro();
        System.out.println(carro);
    }
}
