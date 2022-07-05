package br.com.roberto.solidprinciples.exemplossoltos.lsp.exemplo1;

public class Carro extends Veiculo{
    @Override
    public double getComprimentoInterior() {
        return this.getComprimentoDaCabine();
    }

    private double getComprimentoDaCabine() {
        return 20;
    }
}
