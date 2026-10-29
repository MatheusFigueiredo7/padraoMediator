package padraoMediator;

public class PainelControleEstoque {

    private static PainelControleEstoque instancia = new PainelControleEstoque();

    private PainelControleEstoque() {};

    public static PainelControleEstoque getInstancia() {
        return instancia;
    }

    public String receberEstoqueBaixoFilial(String mensagem) {
        return "Painel de Controle de Estoque\n" +
                "A Filial apresentou o seguinte status de estoque:\n" +
                ">>" + Deposito.getInstancia().receberEstoqueBaixo(mensagem);
    }

    public String receberExcessoEstoqueFilial(String mensagem) {
        return "Painel de Controle de Estoque\n" +
                "A Filial apresentou o seguinte status de estoque:\n" +
                ">>" + Deposito.getInstancia().receberExcessoEstoque(mensagem);
    }

    public String receberRupturaEstoqueFilial(String mensagem) {
        return "Painel de Controle de Estoque\n" +
                "A Filial apresentou o seguinte status de estoque:\n" +
                ">>" + Deposito.getInstancia().receberRupturaEstoque(mensagem);
    }
}
