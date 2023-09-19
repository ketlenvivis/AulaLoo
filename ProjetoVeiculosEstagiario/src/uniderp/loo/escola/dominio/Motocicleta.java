package uniderp.loo.escola.dominio;

public class Motocicleta extends BaseDadosGerais {

    private String tipoGuidao;

        public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String fabricante, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF,
            String tipoVeiculo, double potencia, String chassi, String placa, int rodas, String codigoRenavam,
            String tipoGuidao) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, fabricante, tipoCombustivel, nomeProprietario,
                estadoUF, cidadeUF, tipoVeiculo, potencia, chassi, placa, rodas, codigoRenavam);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void Imprimir() {

    }


    
}
