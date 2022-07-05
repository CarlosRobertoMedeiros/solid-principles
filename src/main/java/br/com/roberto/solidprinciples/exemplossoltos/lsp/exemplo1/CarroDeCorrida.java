package br.com.roberto.solidprinciples.exemplossoltos.lsp.exemplo1;

public class CarroDeCorrida extends Veiculo{

    @Override
    public double getComprimentoInterior() {
        return this.getComprimentoDoCockpit();
    }

    private double getComprimentoDoCockpit() {
        return 12;
    }
}
