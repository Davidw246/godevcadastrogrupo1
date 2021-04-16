package br.com.proway.senior.godevcadastro.cadastro;

import java.time.LocalDate;

/**
 * Classe que engloba e abstrai os documentos necess�rios para o Colaborador.
 * 
 * � instanciada na classe Colaborador.
 * 
 * @author Vitor Nathan Gon�alves
 *
 */
public class Documentos {

	/**
	 * N�mero da carteira de trabalho do colaborador
	 */
	private int ctpsNumero;
	
	/**
	 * S�rie da carteira de trabalho do colaborador
	 */
	private int ctpsSerie;
	
	/**
	 * Data de emiss�o da carteira de trabalho
	 */
	private LocalDate dataEmissaoCTPS;
	
	/**
	 * Nome do banco para pagamento do sal�rio do colaborador
	 */
	private String bancoNome;
	
	/**
	 * N�mero da ag�ncia do banco 
	 */
	private int bancoAgencia;
	
	/**
	 * N�mero da conta da pessoa
	 */
	private int bancoNumeroConta;
	
	/**
	 * N�mero do t�tulo de eleitor da pessoa
	 */
	private long tituloNumero;
	
	/**
	 * N�mero da zona eleitoral da pessoa
	 */
	private int tituloZona;
	
	/**
	 * N�mero da se��o eleitoral da pessoa
	 */
	private int tituloSecao;
	
	/**
	 * N�mero do registro de alistamento da pessoa
	 */
	private long raNumero;
	
	/**
	 * N�mero do RG da pessoa
	 */
	private long rgNumero;
	
	/**
	 * �rg�o emissor do RG da pessoa
	 */
	private String orgaoEmissorRG;
	
	/**
	 * Data de emiss�o do RG da pessoa
	 */
	private LocalDate dataEmissaoRG;

	/**
	 * Construtor padr�o da classe.
	 * 
	 * Inclui o registro de alistamento.
	 * 
	 * @param ctpsNumero
	 * @param ctpsSerie
	 * @param dataEmissao
	 * @param bancoNome
	 * @param bancoAgencia
	 * @param bancoNumeroConta
	 * @param tituloNumero
	 * @param tituloZona
	 * @param tituloSecao
	 * @param raNumero
	 * @param rgNumero
	 * @param orgaoEmissorRG
	 * @param dataEmissaoRG
	 */
	public Documentos(int ctpsNumero, int ctpsSerie, LocalDate dataEmissao, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long raNumero, long rgNumero,
			String orgaoEmissorRG, LocalDate dataEmissaoRG) {
		this.ctpsNumero = ctpsNumero;
		this.ctpsSerie = ctpsSerie;
		this.dataEmissaoCTPS = dataEmissao;
		this.bancoNome = bancoNome;
		this.bancoAgencia = bancoAgencia;
		this.bancoNumeroConta = bancoNumeroConta;
		this.tituloNumero = tituloNumero;
		this.tituloZona = tituloZona;
		this.tituloSecao = tituloSecao;
		this.raNumero = raNumero;
		this.rgNumero = rgNumero;
		this.orgaoEmissorRG = orgaoEmissorRG;
		this.dataEmissaoRG = dataEmissaoRG;
	}

	/**
	 * Construtor secund�rio da classe.
	 * 
	 * N�O inclui o registro de alistamento.
	 * 
	 * @param ctpsNumero
	 * @param ctpsSerie
	 * @param dataEmissao
	 * @param bancoNome
	 * @param bancoAgencia
	 * @param bancoNumeroConta
	 * @param tituloNumero
	 * @param tituloZona
	 * @param tituloSecao
	 * @param raNumero
	 * @param rgNumero
	 * @param orgaoEmissorRG
	 * @param dataEmissaoRG
	 */
	public Documentos(int ctpsNumero, int ctpsSerie, LocalDate dataEmissaoCTPS, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long rgNumero,
			String orgaoEmissorRG, LocalDate dataEmissaoRG) {
		this.ctpsNumero = ctpsNumero;
		this.ctpsSerie = ctpsSerie;
		this.dataEmissaoCTPS = dataEmissaoCTPS;
		this.bancoNome = bancoNome;
		this.bancoAgencia = bancoAgencia;
		this.bancoNumeroConta = bancoNumeroConta;
		this.tituloNumero = tituloNumero;
		this.tituloZona = tituloZona;
		this.tituloSecao = tituloSecao;
		this.rgNumero = rgNumero;
		this.raNumero = 0;
		this.orgaoEmissorRG = orgaoEmissorRG;
		this.dataEmissaoRG = dataEmissaoRG;
	}

	public int getCtpsNumero() {
		return ctpsNumero;
	}

	public void setCtpsNumero(int ctpsNumero) {
		this.ctpsNumero = ctpsNumero;
	}

	public int getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(int ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public LocalDate getDataEmissaoCTPS() {
		return dataEmissaoCTPS;
	}

	public void setDataEmissaoCTPS(LocalDate dataEmissaoCTPS) {
		this.dataEmissaoCTPS = dataEmissaoCTPS;
	}

	public String getBancoNome() {
		return bancoNome;
	}

	public void setBancoNome(String bancoNome) {
		this.bancoNome = bancoNome;
	}

	public int getBancoAgencia() {
		return bancoAgencia;
	}

	public void setBancoAgencia(int bancoAgencia) {
		this.bancoAgencia = bancoAgencia;
	}

	public int getBancoNumeroConta() {
		return bancoNumeroConta;
	}

	public void setBancoNumeroConta(int bancoNumeroConta) {
		this.bancoNumeroConta = bancoNumeroConta;
	}

	public long getTituloNumero() {
		return tituloNumero;
	}

	public void setTituloNumero(long tituloNumero) {
		this.tituloNumero = tituloNumero;
	}

	public int getTituloZona() {
		return tituloZona;
	}

	public void setTituloZona(int tituloZona) {
		this.tituloZona = tituloZona;
	}

	public int getTituloSecao() {
		return tituloSecao;
	}

	public void setTituloSecao(int tituloSecao) {
		this.tituloSecao = tituloSecao;
	}

	public long getRaNumero() {
		return raNumero;
	}

	public void setRaNumero(long raNumero) {
		this.raNumero = raNumero;
	}

	public long getRgNumero() {
		return rgNumero;
	}

	public void setRgNumero(long rgNumero) {
		this.rgNumero = rgNumero;
	}

	public String getOrgaoEmissorRG() {
		return orgaoEmissorRG;
	}

	public void setOrgaoEmissorRG(String orgaoEmissorRG) {
		this.orgaoEmissorRG = orgaoEmissorRG;
	}

	public LocalDate getDataEmissaoRG() {
		return dataEmissaoRG;
	}

	public void setDataEmissaoRG(LocalDate dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}
}
