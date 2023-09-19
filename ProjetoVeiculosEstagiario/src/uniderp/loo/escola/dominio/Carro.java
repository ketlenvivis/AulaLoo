package uniderp.loo.escola.dominio;

public class Carro extends BaseDadosGerais {

    private int portas;
    private int assentos;

        public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public Carro(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String fabricante, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF,
            String tipoVeiculo, double potencia, String chassi, String placa, int rodas, String codigoRenavam,
            int portas, int assentos) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, nomeProprietario,
                estadoUF, cidadeUF, tipoVeiculo, potencia, chassi, placa, rodas, codigoRenavam);
        this.portas = portas;
        this.assentos = assentos;
    }

    @Override
    public void Imprimir() {

    }
    
}
