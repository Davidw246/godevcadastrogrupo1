package br.com.proway.senior.godevcadastrogrupo1.model.DTO;

import java.time.LocalDate;

import br.com.proway.senior.godevcadastrogrupo1.model.Empresa;
import br.com.proway.senior.godevcadastrogrupo1.model.Endereco;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumDadosPessoais.IdentidadeGenero;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumDadosPessoais.TiposDependentes;

/**
 * Classe EmpresaDTO.
 * 
 * Classe para intera��o via Controller API, referencia a {@link Empresa}.
 * Oferece as informa��es completas do dependente, podendo ser utilizada para 
 * relat�rios. As informa��es simplificadas para os demais m�dulos do sistema,
 * est�o dispon�veis em {@link DependenteSimplificadoDTO}.
 * 
 * @author Sarah Neuburger Brito <b>sarah.brito@senior.com.br</b>
 */
public class DependenteCompletoDTO {

	private int id;
	private String nome;
	private String sobrenome;
	private String nomeSocial;
	private LocalDate dataDeNascimento;
	private String nacionalidade;
	private String naturalidade;
	private Boolean pcd;
	private String genero;
	private IdentidadeGenero identidadeGenero;
	private Endereco endereco; 
	private String cpf; 
	private String rg;
	private TiposDependentes tipoDependente;
	private Boolean optanteIR;
	
}
