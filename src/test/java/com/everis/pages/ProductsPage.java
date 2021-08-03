package com.everis.pages;

import com.everis.map.ProductsMap;

public class ProductsPage extends ProductsMap {

	public void acessarProduto(String produto) {
		buscarProduto(produto).click();
	}

	public void inserirDadosDoCartao(String cartao, String validade, String cvc) {
		campoCartao.sendKeys(cartao);
		campoValidade.sendKeys(validade);
		campoCVC.sendKeys(cvc);
	}

	public void clicarParaContinuarCompra() {
		botaoComprar.click();
	}

	public void clicarParaFinalizarCompra() {
		botaoConfirmarPAgamento.click();
	}

	public boolean estaNaListaDePagamentos() {
		menuPagamentos.click();
		return listaDeItens.isDisplayed();
	}

	public boolean estaNaListaDeProdutos() {
		return produtos.isDisplayed();
	}

	public void clicarParaSair() {
		botaoSair.click();
	}

}