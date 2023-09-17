package Classes;

public class ConcecionariaDirector {
    protected CarroBuilder montadora;
    public ConcecionariaDirector (CarroBuilder montadora) {
        this.montadora = montadora;
    }

    public void construirCarro(){
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }

    public CarroProduct getCarro(){
        return montadora.getCarro();
    }
}
