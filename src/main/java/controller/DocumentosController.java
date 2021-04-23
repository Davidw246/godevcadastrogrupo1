package controller;

import java.util.ArrayList;

import model.Documentos;

public class DocumentosController {

	/**
	 * Cria��o de um documento no ArrayList.
	 * 
	 * Adiciona uma inst�ncia de Documentos ao ArrayList
	 * @param listaDocumentos
	 * @param documento
	 */
	public void cadastrarDocumentos(ArrayList<Documentos> listaDocumentos, Documentos documento) {
		listaDocumentos.add(documento);
	}
	
	/**
	 * Mostrar todos os documentos na tela.
	 * 
	 * Mostra as informa��es de todos os documentos contidos em um 
	 * ArrayList de documentos.
	 * 
	 * @param ArrayList<Documentos> documentos: os documentos a serem mostrados
	 */
	
	public void listarDocumentos(ArrayList<Documentos> listaDocumentos) {
		for (Documentos documentos2 : listaDocumentos) {
			System.out.println(documentos2.toString());
		}
	}
	
	/**
	 * Atualiza documentos.
	 * 
	 * Atualiza a inst�ncia de Documentos informada por outro objeto.
	 * @param listaDocumentos
	 * @param documentoAntigo
	 * @param documentoNovo
	 */
	public void atualizarDocumentos(ArrayList<Documentos> listaDocumentos, Documentos documentoAntigo, Documentos documentoNovo) {
		int index = listaDocumentos.indexOf(documentoAntigo);
		listaDocumentos.set(index, documentoNovo);
	}
	
	/**
	 * Remover uma inst�ncia de Documentos.
	 * 
	 * Remove a inst�ncia de documentos informada do ArrayList<Documentos>
	 * @param listaDocumentos
	 * @param documento
	 */
	public void deletarDocumentos(ArrayList<Documentos> listaDocumentos, Documentos documento) {
		listaDocumentos.remove(documento);
	}
	
}
