package padraoMediator;

public class Deposito implements CentralEstoque {

    private static Deposito instancia = new Deposito();

    private Deposito() {};

    public static Deposito getInstancia() {
        return instancia;
    }

    public String receberEstoqueBaixo(String mensagem) {
       return "O Depósito apresentou uma quantidade de estoque inferior: " + mensagem;
    }

    public String receberExcessoEstoque(String mensagem) {
        return "O Depósito apresentou uma quantidade excessiva em estoque: " + mensagem;
    }

    public String receberRupturaEstoque(String mensagem) {
        return "O Depósito apresentou uma ruptura de estoque: " + mensagem;
    }
}
