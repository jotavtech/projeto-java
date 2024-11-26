package src;

import concessionaria.TipoVeiculo;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private double preco;

    public Veiculo(String modelo, String marca, double preco) {
        if (modelo == null || modelo.isEmpty() || marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Modelo e marca não podem ser nulos ou vazios.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
}

public abstract TipoVeiculo getTipo();

@Override
    public String toString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nPreço: " + preco;
    }

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public void setPreco(double preco) {
    this.preco = preco;
} }