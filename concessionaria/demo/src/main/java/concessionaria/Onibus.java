package concessionaria;

import src.Veiculo;

public class Onibus extends Veiculo {
    private int numeroAssentos;

    public Onibus(String modelo, String marca, double preco, int numeroAssentos) {
        super(modelo, marca, preco);
        if (numeroAssentos <= 0) {
            throw new IllegalArgumentException("O número de assentos deve ser maior que zero.");
        }
        this.numeroAssentos = numeroAssentos;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    @Override
    public TipoVeiculo getTipo() {
        return TipoVeiculo.ONIBUS;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + getTipo() + ", Número de assentos: " + numeroAssentos;
    }
}
