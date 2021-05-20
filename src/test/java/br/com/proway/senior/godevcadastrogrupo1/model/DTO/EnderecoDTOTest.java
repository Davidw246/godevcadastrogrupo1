package br.com.proway.senior.godevcadastrogrupo1.model.DTO;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.proway.senior.godevcadastrogrupo1.model.Endereco;
import br.com.proway.senior.godevcadastrogrupo1.model.EnderecoDTO;

public class EnderecoDTOTest {

	@Test
	public void testCriarEndereco() {
		Endereco endereco = new Endereco("Rua Braba", 11, "Lado esquerdo da rua", "89046852", "Velha Central"
				, "Brasil","Blumenau","SC");
		
		EnderecoDTO enderecoDto = new EnderecoDTO(endereco);
		assertEquals("Rua Braba", enderecoDto.getLogradouro());
		assertEquals("Lado esquerdo da rua", enderecoDto.getComplemento());
		assertEquals(11, 11);
		assertEquals("89046852", enderecoDto.getCep());
		assertEquals("Velha Central", enderecoDto.getBairro());
		assertEquals("Brasil", enderecoDto.getPais());
		assertEquals("Blumenau", enderecoDto.getCidade());
		assertEquals("SC", enderecoDto.getUf());
	}

}