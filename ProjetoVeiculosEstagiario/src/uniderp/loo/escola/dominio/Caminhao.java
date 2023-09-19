package uniderp.loo.escola.dominio;

public class Caminhao extends BaseDadosGerais {
    
    private double pesoLiquido;
    private double pesoTotal;
    private int eixos;

    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public Caminhao(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String fabricante, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF,
            String tipoVeiculo, double potencia, String chassi, String placa, int rodas, String codigoRenavam,
            double pesoLiquido, double pesoTotal, int eixos) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, nomeProprietario,
                estadoUF, cidadeUF, tipoVeiculo, potencia, chassi, placa, rodas, codigoRenavam);
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.eixos = eixos;
    }
    @Override
    public void Imprimir() {
    
    }

    
}
