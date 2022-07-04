package br.com.roberto.solidprinciples.exemplossoltos.ocp;

import br.com.roberto.solidprinciples.exemplossoltos.ocp.interactors.PerfilCliente;

public class CalculadoraDeSegurosPremium {

    Double calculaPercentualDesconto(PerfilCliente cliente){

        if (cliente.isClienteLeal()){
            return 0.20;
        }
        return 0.0;
    }
}
