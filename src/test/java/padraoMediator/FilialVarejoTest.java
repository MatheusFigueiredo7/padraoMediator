package padraoMediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilialVarejoTest {

    @Test
    void deveInformarEstoqueBaixoFilial() {
        FilialVarejo filialVarejo = new FilialVarejo();
        assertEquals("Painel de Controle de Estoque\n" +
                        "A Filial apresentou o seguinte status de estoque:\n" +
                        ">>" + "O Depósito apresentou uma quantidade de estoque inferior: Produto X abaixo do mínimo",
                filialVarejo.informarEstoqueBaixo("Produto X abaixo do mínimo"));
    }

    @Test
    void deveInformarExcessoEstoqueFilial() {
        FilialVarejo filialVarejo = new FilialVarejo();
        assertEquals("Painel de Controle de Estoque\n" +
                        "A Filial apresentou o seguinte status de estoque:\n" +
                        ">>" + "O Depósito apresentou uma quantidade excessiva em estoque: Produto Y acima do limite",
                filialVarejo.informarExcessoEstoque("Produto Y acima do limite"));
    }

    @Test
    void deveInformarRupturaEstoqueFilial() {
        FilialVarejo filialVarejo = new FilialVarejo();
        assertEquals("Painel de Controle de Estoque\n" +
                        "A Filial apresentou o seguinte status de estoque:\n" +
                        ">>" + "O Depósito apresentou uma ruptura de estoque: Produto Z zerado",
                filialVarejo.informarRupturaEstoque("Produto Z zerado"));
    }
}
