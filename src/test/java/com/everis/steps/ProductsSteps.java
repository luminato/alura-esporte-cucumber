package com.everis.steps;

import static org.junit.Assert.assertTrue;

import com.everis.pages.ProductsPage;

import io.cucumber.java.Before;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ProductsSteps {

	@Before(value = "@teste_05")
	public void cadastrarUsuario() {
		Hook hooks = new Hook();
		hooks.cadastrarUsuario();
	}

	@Entao("^a tela de produtos é exibida$")
	public void verificarTelaDeProdutos() {
		ProductsPage productPage = new ProductsPage();
		assertTrue(productPage.estaNaListaDeProdutos());
	}

	@Quando("^clicar no produto \"(.*)\"$")
	public void clicarNoProduto(String produto) {
		ProductsPage productPage = new ProductsPage();
		productPage.acessarProduto(produto);
	}

	@E("^clicar para comprar$")
	public void continuarcompra() {
		ProductsPage productPage = new ProductsPage();
		productPage.clicarParaContinuarCompra();
	}

	@E("^preencher com numero do cartão \"(.*)\", data de validade \"(.*)\" e cvc \"(.*)\"$")
	public void preencherDadosDoCarta(String cartao, String validade, String cvc) {
		ProductsPage productPage = new ProductsPage();
		productPage.inserirDadosDoCartao(cartao, validade, cvc);
	}

	@E("^confirmar pagamento$")
	public void confirmarPagamento() {
		ProductsPage productPage = new ProductsPage();
		productPage.clicarParaFinalizarCompra();
	}

	@Entao("^o produto aparece na lista de pagamentos$")
	public void verificaProdutoNaTelaDePagamento() {
		ProductsPage productPage = new ProductsPage();
		assertTrue(productPage.estaNaListaDePagamentos());

	}
}