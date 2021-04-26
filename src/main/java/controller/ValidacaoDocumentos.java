package controller;

public class ValidacaoDocumentos {
	FormataDocumentos formatadocumento = new FormataDocumentos();

	/**
	 * Validar CPF.
	 * 
	 * Utiliza o algoritmo para verificar se o CPF contido na String � v�lido.
	 * 
	 * @param CPF
	 * @return boolean
	 */
	public boolean validarCPF(String CPF) {
		
		String CPFFormatado = formatadocumento.formatarCPF(CPF);
		if (CPF.length() == 11) {

			int soma = 0;
			int mult = 10;
			for (int i = 0; i < 9; i++) {
				soma += mult * ((CPFFormatado.charAt(i) - 48));
				mult--;
			}
			if (11 - soma % 11 == CPFFormatado.charAt(9) - 48) {
				boolean valido;
			} else if (11 - soma % 11 == 10 && CPFFormatado.charAt(9) - 48 == 0) {
				boolean valido;
			} else {
				return false;
			}

			soma = 0;
			mult = 11;
			for (int i = 0; i < 10; i++) {
				soma += mult * ((CPFFormatado.charAt(i) - 48));
				mult--;
			}
			if (11 - soma % 11 == CPFFormatado.charAt(10) - 48) {
				boolean valido;
			} else if (11 - soma % 11 == 10 && CPFFormatado.charAt(10) - 48 == 0) {
				boolean valido;
			} else {
				return false;
			}

		} else {
			return false;
		}
		return true;
	}
	
	/**
	 * Valida o tamanho do telefone
	 * 
	 * Este m�todo verifica se h� 11 d�gitos no telefone. Se houver ele retorna true
	 * caso contr�rio, retorna false.
	 * 
	 * @param telefone
	 * @return boolean
	 */
	public boolean validarTamanhoTel(String telefone) {
		if(telefone.length() != 11) {
			return false;
		}
		return true;
	}
	
	/**
	 * Verifica se um n�mero de CNPJ � valido.
	 * 
	 * Retorna true, caso o CNPJ seja v�lido
	 * 
	 * @param cnpj
	 * @return
	 */
	public boolean validaCNPJ(String cnpj) {

		String cnpjFormatado = formatadocumento.formataCNPJ(cnpj);
		if (cnpjFormatado.length() == 14) {
			String cnpjInvertido = "";

			for (int i = 13; i >= 0; i--) {
				cnpjInvertido += cnpjFormatado.charAt(i);
			}

			int mult = 2;
			int soma = 0;
			for (int i = 2; i < 14; i++) {
				soma += mult * (cnpjInvertido.charAt(i) - 48);
				if (mult == 9) {
					mult = 2;
				} else {
					mult++;
				}
			}

			if (cnpjInvertido.charAt(1) - 48 != 11 - (soma % 11)) {
				return false;
			}

			// pt2
			mult = 2;
			soma = 0;
			for (int i = 1; i < 14; i++) {
				soma += mult * (cnpjInvertido.charAt(i) - 48);
				if (mult == 9) {
					mult = 2;
				} else {
					mult++;
				}
			}

			if (cnpjInvertido.charAt(0) - 48 != 11 - (soma % 11)) {
				return false;
			}

		}
		return true;
	}
	
	/**
	 * Validar email
	 * 
	 * Realiza valida��o do email para verificar se possui o caracter "@".
	 * 
	 * @param String email
	 * @return boolean
	 */
	public boolean validarEmail(String email) {
		if (!email.contentEquals("@")) {
			return false;
		}
		return true;
	}

	/**
	 * Verifica se CEP cont�m 8 d�gitos
	 * @param cep
	 * @return
	 */
	public boolean validarCEP(String cep) {
		if(formatadocumento.formatarCEP(cep).length() != 8) {
			return false;
		} 
		return true;
	}
	
}
