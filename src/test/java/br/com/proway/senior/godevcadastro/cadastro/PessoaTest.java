package br.com.proway.senior.godevcadastro.cadastro;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PessoaTest {
	
	Pessoa pessoaTesteConstrutorPrincipal = new Pessoa("Marcos", "Ant�nio", LocalDate.of(2010, 8, 24), "Muriel", "N�o-Bin�rio", 'M', "Josilene Aparecida Santos", "01231545678", "Brasil", true);
	Pessoa pessoaTesteConstrutorSecundario = new Pessoa("Marco", "Antunes", LocalDate.of(2009, 4, 21), "Masculino", 'M', "Jucerl�ia Aparecida Santos", "87654321021", "Mo�ambique");
	
	@Test
	public void test() {
		assertEquals(pessoaTesteConstrutorPrincipal.getNome(), "Marcos");
		assertEquals(pessoaTesteConstrutorPrincipal.getSobrenome(), "Ant�nio");
		assertEquals(pessoaTesteConstrutorPrincipal.getDataDeNascimento(), LocalDate.of(2010, 8, 24));
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeSocial(), "Muriel");
		assertEquals(pessoaTesteConstrutorPrincipal.getGenero(), "N�o-Bin�rio");
		assertEquals(pessoaTesteConstrutorPrincipal.getSexo(), 'M');
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeDaMae(), "Josilene Aparecida Santos");
		assertEquals(pessoaTesteConstrutorPrincipal.getCpf(), "01231545678");
		assertEquals(pessoaTesteConstrutorPrincipal.getNacionalidade(), "Brasil");
		assertEquals(pessoaTesteConstrutorPrincipal.isPcd(), true);
		
		assertEquals(pessoaTesteConstrutorSecundario.getNome(), "Marco");
		assertEquals(pessoaTesteConstrutorSecundario.getSobrenome(), "Antunes");
		assertEquals(pessoaTesteConstrutorSecundario.getDataDeNascimento(), LocalDate.of(2009, 4, 21));
		assertEquals(pessoaTesteConstrutorSecundario.getGenero(), "Masculino");
		assertEquals(pessoaTesteConstrutorSecundario.getSexo(), 'M');
		assertEquals(pessoaTesteConstrutorSecundario.getNomeDaMae(), "Jucerl�ia Aparecida Santos");
		assertEquals(pessoaTesteConstrutorSecundario.getCpf(), "87654321021");
		assertEquals(pessoaTesteConstrutorSecundario.getNacionalidade(), "Mo�ambique");
		assertEquals(pessoaTesteConstrutorSecundario.isPcd(), false);
	}
}
