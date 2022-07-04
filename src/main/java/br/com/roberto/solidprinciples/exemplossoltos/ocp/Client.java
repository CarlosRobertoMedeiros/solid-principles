package br.com.roberto.solidprinciples.exemplossoltos.ocp;

import br.com.roberto.solidprinciples.exemplossoltos.ocp.interactors.SeguroResidencial;
import br.com.roberto.solidprinciples.exemplossoltos.ocp.interactors.SeguroVeicular;

public class Client {

    public static void main(String[] args) {
        CalculadoraDeSegurosPremium calculadoraDeSegurosPremium = new CalculadoraDeSegurosPremium();
        Double percentualDesconto =  calculadoraDeSegurosPremium.calculaPercentualDesconto(new SeguroVeicular());
        System.out.println("Percentual de Desconto do Seguro: "+ percentualDesconto);
    }
}
