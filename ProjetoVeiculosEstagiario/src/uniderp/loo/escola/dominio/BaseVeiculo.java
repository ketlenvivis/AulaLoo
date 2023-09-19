package uniderp.loo.escola.dominio;

public abstract class BaseVeiculo extends BaseIdentificador implements IImpressao {

protected String nome;
protected String modelo;
protected String cor;
protected int anoModelo;
protected int anoFabricacao;
protected String fabricante;
protected String tipoCombustivel;
protected String nomeProprietario;
protected String estadoUF;
protected String cidadeUF;
protected String tipoVeiculo;
protected double potencia;

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public int getAnoModelo() {
    return anoModelo;
}
public void setAnoModelo(int anoModelo) {
    this.anoModelo = anoModelo;
}
public int getAnoFabricacao() {
    return anoFabricacao;
}
public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
}
public String getFabricante() {
    return fabricante;
}
public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
}
public String getTipoCombustivel() {
    return tipoCombustivel;
}
public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
}
public String getNomeProprietario() {
    return nomeProprietario;
}
public void setNomeProprietario(String nomeProprietario) {
    this.nomeProprietario = nomeProprietario;
}
public String getEstadoUF() {
    return estadoUF;
}
public void setEstadoUF(String estadoUF) {
    this.estadoUF = estadoUF;
}
public String getCidadeUF() {
    return cidadeUF;
}
public void setCidadeUF(String cidadeUF) {
    this.cidadeUF = cidadeUF;
}
public String getTipoVeiculo() {
    return tipoVeiculo;
}
public void setTipoVeiculo(String tipoVeiculo) {
    this.tipoVeiculo = tipoVeiculo;
}
public double getPotencia() {
    return potencia;
}
public void setPotencia(double potencia) {
    this.potencia = potencia;
}

public BaseVeiculo(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
        String fabricante, String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF,
        String tipoVeiculo, double potencia) {
    super(codigo);
    this.nome = nome;
    this.modelo = modelo;
    this.cor = cor;
    this.anoModelo = anoModelo;
    this.anoFabricacao = anoFabricacao;
    this.fabricante = fabricante;
    this.tipoCombustivel = tipoCombustivel;
    this.nomeProprietario = nomeProprietario;
    this.estadoUF = estadoUF;
    this.cidadeUF = cidadeUF;
    this.tipoVeiculo = tipoVeiculo;
    this.potencia = potencia;
}  
}
