package controller;

import model.TipoVeiculo;
import model.Veiculo;

public class MovimentacaoVeiculosController {
  Veiculo veiculo;

  public void inicioMovimentacao(Veiculo veiculo) {
    System.out.println("Veículo iniciou a movimentação");
    System.out.println(veiculo);

    this.veiculo = veiculo;
  }

  public void movimentacaoVeiculo() {
    if (this.veiculo.getTipo().equals(TipoVeiculo.AUTOMOVEL)) {
      automovel();
    } else if (this.veiculo.getTipo().equals(TipoVeiculo.CAMINHAO)) {
      caminhao();
    } else if (this.veiculo.getTipo().equals(TipoVeiculo.MOTOCICLETA)) {
      motocicleta();
    } else if (this.veiculo.getTipo().equals(TipoVeiculo.VAN)) {
      van();
    }
  }

  private void automovel() {
    double segundos = gerarRandom(10, 30);
    double deslocamento = gerarRandom(50, 650);
    double passageiros = gerarRandom(1, 4);

    System.out.println(
        segundos + " segundos para atingir 100km/h. \n" +
            "Deslocamento: " + deslocamento + "km\n" +
            "Passageiros: " + passageiros);
  }

  private void caminhao() {
    double carga = gerarRandom(1000, 3000);
    double deslocamento = gerarRandom(500, 3000);
    double valorFrete = gerarRandom(2000, 5000);

    System.out.println(
        "Carga: " + carga + "kg\n" +
            "Deslocamento: " + deslocamento + "km\n" +
            "Valor do frete: R$ " + valorFrete);
  }

  private void motocicleta() {
    double deslocamento = gerarRandom(20, 100);
    double valorFrete = gerarRandom(30, 80);

    System.out.println(
        "Deslocamento: " + deslocamento + "km\n" +
            "Valor do frete: R$ " + valorFrete);
  }

  private void van() {
    double passageiros = gerarRandom(3, 12);
    double paradas = gerarRandom(3, 12);

    System.out.println(
        "Passageiros: " + passageiros + "\n" +
            "Paradas: " + paradas);
  }

  private double gerarRandom(double min, double max) {
    return (Math.random() * (max - min)) + min;
  }
}