package model;

public class Veiculo {
  private String placa;
  private String marca;
  private String modelo;
  private String cor;
  private TipoVeiculo tipo;
  private int velocidadeMaxima;
  private int portas;
  private int ano;
  private int eixos;
  private int cargaMaxima;
  private int cilindradas;
  private int passageiros;
  private int paradas;

  public String getPlaca() {
    return this.placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public TipoVeiculo getTipo() {
    return this.tipo;
  }

  public void setTipo(TipoVeiculo tipo) {
    this.tipo = tipo;
  }

  public int getVelocidadeMaxima() {
    return this.velocidadeMaxima;
  }

  public void setVelocidadeMaxima(int velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public int getPortas() {
    return this.portas;
  }

  public void setPortas(int portas) {
    this.portas = portas;
  }

  public int getAno() {
    return this.ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getEixos() {
    return this.eixos;
  }

  public void setEixos(int eixos) {
    this.eixos = eixos;
  }

  public int getCargaMaxima() {
    return this.cargaMaxima;
  }

  public void setCargaMaxima(int cargaMaxima) {
    this.cargaMaxima = cargaMaxima;
  }

  public int getCilindradas() {
    return this.cilindradas;
  }

  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }

  public int getPassageiros() {
    return this.passageiros;
  }

  public void setPassageiros(int passageiros) {
    this.passageiros = passageiros;
  }

  public int getParadas() {
    return this.paradas;
  }

  public void setParadas(int paradas) {
    this.paradas = paradas;
  }

  @Override
  public String toString() {
    return "{" +
        " placa='" + getPlaca() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", cor='" + getCor() + "'" +
        ", tipo='" + getTipo() + "'" +
        ", velocidadeMaxima='" + getVelocidadeMaxima() + "'" +
        ", portas='" + getPortas() + "'" +
        ", ano='" + getAno() + "'" +
        ", eixos='" + getEixos() + "'" +
        ", cargaMaxima='" + getCargaMaxima() + "'" +
        ", cilindradas='" + getCilindradas() + "'" +
        ", passageiros='" + getPassageiros() + "'" +
        ", paradas='" + getParadas() + "'" +
        "}";
  }
}