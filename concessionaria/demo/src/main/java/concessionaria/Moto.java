package concessionaria;

 import src.Veiculo;

public class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String modelo, String marca, double preco, boolean temCarenagem) {
        super(modelo, marca, preco);
        this.temCarenagem = temCarenagem;
    }

    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    @Override
    public TipoVeiculo getTipo() {
        return TipoVeiculo.MOTO;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + getTipo() + ", Tem carenagem: " + temCarenagem;
    }
}