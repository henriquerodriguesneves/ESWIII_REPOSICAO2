package view;

import controller.IImposto;
import controller.ImpostoSaoPaulo;
import model.Propriedade;
import model.PropriedadeBuilder;

public class Principal {
  public static void main(String[] args) {
    Propriedade propriedade = PropriedadeBuilder.builder()
        .addAreaTotal(10000)
        .addNumeroComodos(5)
        .get();

    IImposto impostoStrategy = new ImpostoSaoPaulo();
    // IImposto impostoStrategy = new ImpostoBeloHorizonte();
    // IImposto impostoStrategy = new ImpostoCuritiba();
    // IImposto impostoStrategy = new ImpostoPortoAlegre();

    System.out.println(impostoStrategy.calcularImposto(propriedade));

  }
}