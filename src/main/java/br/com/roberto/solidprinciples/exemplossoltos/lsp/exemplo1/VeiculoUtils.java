package br.com.roberto.solidprinciples.exemplossoltos.lsp.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class VeiculoUtils {

    public static void main(String[] args) {
        Veiculo primeiro = new Carro();
        Veiculo segundo = new Carro();
        Veiculo terceiro = new CarroDeCorrida();

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(primeiro);
        veiculos.add(segundo);
        veiculos.add(terceiro);

        //Não deu erro pois para CarroDeCorrida foi adaptado
        //o getComprimentoInterior para todos os veículos
        //A diferença está que para Carro o getComprimentoInterior usa getComprimentoDaCabine
        //Enquanto que para Carro de Corrida o getComprimentoInterior usa getComprimentoDoCockpit
        //Assim reajustamos a lógica e refizemos o conceito da herança
        veiculos.stream().forEach(veiculo -> {
            System.out.println(veiculo.getComprimentoInterior());
        });

    }
}
