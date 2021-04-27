package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import enums.EMDadosGeograficos.Cidades;
import enums.EMDadosGeograficos.Pais;
import enums.EMDadosGeograficos.UF;
import model.Endereco;

public class EnderecoTest {

	Endereco enderecoSemComplemento = new Endereco("S�tio C�rrego de Santo Ant�nio", 10, "C�rrego de Santo Antonio",
			Cidades.FLORIANOPOLIS, UF.SC, "28666971", Pais.BRASIl);

	Endereco enderecoCompleto = new Endereco("Rua Jos� Delepranni, s/n", null, "Alto Caldeir�o", Cidades.PORTO_ALEGRE,
			UF.RS, "Casa", "29656980", Pais.BRASIl);

	

	@Test
	public void testeEnderecoSemComplemento() {
		assertEquals("S�tio C�rrego de Santo Ant�nio", enderecoSemComplemento.getLogradouro());
		assertEquals(10, enderecoSemComplemento.getNumero().intValue());
		assertEquals("C�rrego de Santo Antonio", enderecoSemComplemento.getBairro());
		assertEquals(Cidades.FLORIANOPOLIS, enderecoSemComplemento.getCidade());
		assertEquals(UF.SC, enderecoSemComplemento.getUf());
		assertEquals("28666971", enderecoSemComplemento.getCep());
		assertEquals(Pais.BRASIl, enderecoSemComplemento.getPais());
	}

	@Test
	public void testeEnderecoCompleto() {
		assertEquals("Rua Jos� Delepranni, s/n", enderecoCompleto.getLogradouro());
		assertEquals(null, enderecoCompleto.getNumero());
		assertEquals("Alto Caldeir�o", enderecoCompleto.getBairro());
		assertEquals(Cidades.PORTO_ALEGRE, enderecoCompleto.getCidade());
		assertEquals(UF.RS, enderecoCompleto.getUf());
		assertEquals("Casa", enderecoCompleto.getComplemento());
		assertEquals("29656980", enderecoCompleto.getCep());
		assertEquals(Pais.BRASIl, enderecoCompleto.getPais());
	}
}
