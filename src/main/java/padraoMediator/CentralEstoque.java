package padraoMediator;

public interface CentralEstoque {
    String receberEstoqueBaixo(String mensagem);
    String receberExcessoEstoque(String mensagem);
    String receberRupturaEstoque(String mensagem);
}
