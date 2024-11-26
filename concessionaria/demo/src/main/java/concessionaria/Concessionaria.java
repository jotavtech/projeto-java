package concessionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import src.Veiculo;

public class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo.");
        }
        veiculos.add(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return Collections.unmodifiableList(veiculos);
    }
}
