package model;

import java.time.LocalDate;

/**
 * Classe que abstrai as informa��es de uma Empresa contratada. Esta Classe ser�
 * instanciada na Classe PrestadorServico, e instanciar� as classes Endereco e
 * Contato
 *
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gon�alves.
 *
 */
public class Empresa{

	private long empresaId;
	private String nomeEmpresa;
	private LocalDate dataInicioContrato;
	private String cnpj;
	private Endereco endereco;
	private Contatos contato;

	public Empresa(long empresaId, String nomeEmpresa, LocalDate dataInicioContrato, String cnpj, Endereco endereco,
			Contatos contato) {
		super();
		this.empresaId = empresaId;
		this.nomeEmpresa = nomeEmpresa;
		this.dataInicioContrato = dataInicioContrato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Empresa() {
		super();
	}

	public long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(long empresaId) {
		this.empresaId = empresaId;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public LocalDate getDataInicioContrato() {
		return dataInicioContrato;
	}

	public void setDataInicioContrato(LocalDate dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contatos getContato() {
		return contato;
	}

	public void setContato(Contatos contato) {
		this.contato = contato;
	}
	
	public static class EmpresaBuilder {
		private long empresaId;
		private String nomeEmpresa;
		private LocalDate dataInicioContrato;
		private String cnpj;
		private Endereco endereco;
		private Contatos contato;
	
		public EmpresaBuilder empresaId(long empresaId) {
			this.empresaId = empresaId;
			return this;
		}
		
		public EmpresaBuilder nomeEmpresa(String nomeEmpresa) {
			this.nomeEmpresa = nomeEmpresa;
			return this;
		}
		
		public EmpresaBuilder dataInicioContrato(LocalDate dataInicioContrato) {
			this.dataInicioContrato = dataInicioContrato;
			return this;
		}
		
		public EmpresaBuilder cnpj(String cnpj) {
			this.cnpj = cnpj;
			return this;
		}
		
		public EmpresaBuilder endereco(Endereco endereco) {
			this.endereco = endereco;
			return this;
		}
		
		public EmpresaBuilder contato(Contatos contato) {
			this.contato = contato;
			return this;
		}
		
		public Empresa criarEmpresa() {
			return new Empresa(empresaId, nomeEmpresa, dataInicioContrato, cnpj, endereco, contato);
		}
	}
	
	@Override
	public String toString() {
		return "Empresa [empresaId=" + empresaId + ", nomeEmpresa=" + nomeEmpresa + ", dataInicioContrato="
				+ dataInicioContrato + ", cnpj=" + cnpj + ", endereco=" + endereco + ", contato= " + contato + "]";
	}

}
