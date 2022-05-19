package view;

import controller.MovimentacaoVeiculosController;
import model.TipoVeiculo;
import model.Veiculo;
import model.VeiculoBuilder;

public class Principal {
    public static void main(String[] args) {
        MovimentacaoVeiculosController mvc = new MovimentacaoVeiculosController();

        Veiculo caminhao = VeiculoBuilder.builder()
                .addVeiculo(
                        TipoVeiculo.CAMINHAO,
                        "LCM0001",
                        "SCANIA",
                        "R450",
                        "Azul",
                        160)
                .addEixos(9)
                .addCargaMaxima(13600)
                .get();

        mvc.inicioMovimentacao(caminhao);
        mvc.movimentacaoVeiculo();
    }
}