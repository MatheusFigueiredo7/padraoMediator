package padraoMediator;

public class Filial {

    public String informarEstoqueBaixo(String mensagem) {
        return PainelControleEstoque.getInstancia().receberEstoqueBaixoFilial(mensagem);
    }

    public String informarExcessoEstoque(String mensagem) {
        return PainelControleEstoque.getInstancia().receberExcessoEstoqueFilial(mensagem);
    }

    public String informarRupturaEstoque(String mensagem) {
        return PainelControleEstoque.getInstancia().receberRupturaEstoqueFilial(mensagem);
    }
}
