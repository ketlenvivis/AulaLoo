package uniderp.loo.escola.dominio;

public class Aviao extends BaseVeiculo{

    private int assentos;
    private int qtdeMotores;

    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public Aviao(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String fabricante, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF,
            String tipoVeiculo, double potencia, int assentos, int qtdeMotores) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, nomeProprietario,
                estadoUF, cidadeUF, tipoVeiculo, potencia);
        this.assentos = assentos;
        this.qtdeMotores = qtdeMotores;
    }

    @Override
    public void Imprimir() {

    }
    
}
