package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.endereco.Endereco;

public class EnderecoTest {

	Endereco enderecoSemComplemento = new Endereco("S�tio C�rrego de Santo Ant�nio", 10, "C�rrego de Santo Antonio",
			"Barra Alegre", "rj", "28666971", "Brasil");

	Endereco enderecoCompleto = new Endereco("Rua Jos� Delepranni, s/n", (Integer) null, "Alto Caldeir�o", "Alto Caldeir�o", "es",
			"Casa", "29656980", "Brasil");

	@Test
	public void testeEnderecoSemComplemento() {
		assertEquals("S�tio C�rrego de Santo Ant�nio", enderecoSemComplemento.getLogradouro());
		assertEquals(10, enderecoSemComplemento.getNumero().intValue());
		assertEquals("C�rrego de Santo Antonio", enderecoSemComplemento.getBairro());
		assertEquals("Barra Alegre", enderecoSemComplemento.getCidade());
		assertEquals("rj", enderecoSemComplemento.getUf());
		assertEquals("28666971", enderecoSemComplemento.getCep());
		assertEquals("Brasil", enderecoSemComplemento.getPais());
	}

	@Test
	public void testeEnderecoCompleto() {
		assertEquals("Rua Jos� Delepranni, s/n", enderecoCompleto.getLogradouro());
		assertEquals(null, enderecoCompleto.getNumero());
		assertEquals("Alto Caldeir�o", enderecoCompleto.getBairro());
		assertEquals("Alto Caldeir�o", enderecoCompleto.getCidade());
		assertEquals("es", enderecoCompleto.getUf());
		assertEquals("Casa", enderecoCompleto.getComplemento());
		assertEquals("29656980", enderecoCompleto.getCep());
		assertEquals("Brasil", enderecoCompleto.getPais());
	}

}
