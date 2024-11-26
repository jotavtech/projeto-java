package concessionaria;

import src.Veiculo;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String marca, double preco, int numeroPortas) {
        super(modelo, marca, preco);
        if (numeroPortas <= 0) {
            throw new IllegalArgumentException("O número de portas deve ser maior que zero.");
        }
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public TipoVeiculo getTipo() {
        return TipoVeiculo.CARRO;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + getTipo() + "\nNúmero de portas: " + numeroPortas;
    }
}
