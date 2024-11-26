package concessionaria;

import src.Veiculo;

public class Caminhao extends Veiculo {
    private double capacidadeCarga; // Em toneladas

    public Caminhao(String modelo, String marca, double preco, double capacidadeCarga) {
        super(modelo, marca, preco);
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("A capacidade de carga deve ser maior que zero.");
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public TipoVeiculo getTipo() {
        return TipoVeiculo.CAMINHAO;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + getTipo() + ", Capacidade de carga: " + capacidadeCarga + " toneladas";
    }
}
