package uniderp.loo.escola.dominio;


public abstract class BaseDadosGerais extends BaseVeiculo {

    protected String chassi;
    protected String placa;
    protected int rodas;
    protected String codigoRenavam;

      public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public BaseDadosGerais(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String fabricante, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF,
            String tipoVeiculo, double potencia, String chassi, String placa, int rodas, String codigoRenavam) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, nomeProprietario,
                estadoUF, cidadeUF, tipoVeiculo, potencia);
        this.chassi = chassi;
        this.placa = placa;
        this.rodas = rodas;
        this.codigoRenavam = codigoRenavam;
    }  
}
