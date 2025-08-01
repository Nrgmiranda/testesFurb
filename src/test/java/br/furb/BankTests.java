package br.furb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Cenários do Sistema Bancário:
 * 1. Criação de Conta:
 * Dado que o sistema bancário está operacional,
 * Quando um cliente cria uma nova conta com um depósito inicial,
 * Então a conta deve ser criada com sucesso e o saldo deve ser igual ao depósito inicial.
 *
 * 2. Consulta de Saldo:
 * Dado que existe uma conta com um saldo conhecido,
 * Quando o cliente consulta o saldo dessa conta,
 * Então o sistema deve retornar o valor exato do saldo.
 *
 * 3. Depósito:
 * Dado que existe uma conta com um saldo inicial,
 * Quando o cliente deposita um valor nessa conta,
 * Então o saldo da conta deve ser atualizado, somando o valor do depósito.
 *
 * 4. Saque:
 * Dado que existe uma conta com saldo suficiente,
 * Quando o cliente saca um valor dessa conta,
 * Então o saldo da conta deve ser atualizado, subtraindo o valor do saque.
 *
 * 5. Transferência:
 * Dado que existem duas contas, uma de origem com saldo suficiente e uma de destino,
 * Quando o cliente transfere um valor da conta de origem para a de destino,
 * Então o saldo da conta de origem deve ser debitado e o saldo da conta de destino deve ser creditado com o valor da transferência.
 */
@DisplayName("Bank system tests")
public class BankTests {
    double numeroContaMock = 12345;
    Banco banco;

    public BankTests() {
        this.banco = new Banco();
    }

    @Test
    public void criacaoContaTest() {        
        int numeroContaMock = 12345;
        double saldoInicialContaMock = 200.20;
        this.banco.criarConta(numeroContaMock, saldoInicialContaMock);

        double saldoContaEspecifica = this.banco.obterSaldoContaPeloNumero(this.numeroContaMock);
        assertEquals(saldoContaEspecifica, saldoInicialContaMock);
    }

    @Test
    public void consultaSaldoContaTest() {
        double saldoConta = this.banco.obterSaldoontaPeloNumero(this.numeroContaMock);

        
    }
}
