package es;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaTest {

	private Conta Ivo;
	@BeforeEach
	void setUp() throws Exception {
		Ivo = new Conta();
	}

	@Test
	void testConta() {
		assertEquals(100.0, Ivo.getSaldo(), "Saldo Minimo para abrir Conta");
//		fail("Not yet implemented");
	}

	@Test
	void testContaDouble() {
		assertEquals(Ivo.getSaldo(),"Conta com saldo inicial igual ao valor passado como parâmetro");
//		fail("Not yet implemented");
	}

	@Test
	void testDepositar() {
		assertEquals(Ivo.depositar(200),"Depositar uma determinada quantia na conta");
//		fail("Not yet implemented");
	}

	@Test
	void testLevantar() {
		assertEquals(Ivo.levantar(100), "Levantar uma determinada quantia na conta");
//		fail("Not yet implemented");
	}

	@Test
	void testTransferir() {
		assertEquals(Ivo.transferir(Ivo, 100), "Transferir da conta corrente para a conta destino");
//		fail("Not yet implemented");
	}

}
