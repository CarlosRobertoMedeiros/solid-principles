package br.com.roberto.solidprinciples.exemplossoltos.ocp.interactors;

public class SeguroVeicular implements PerfilCliente {
    @Override
    public boolean isClienteLeal() {
        return true;
    }
}
