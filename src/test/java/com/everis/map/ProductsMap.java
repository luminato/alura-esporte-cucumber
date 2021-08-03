package com.everis.map;

import org.openqa.selenium.support.PageFactory;

import com.everis.BasePage;
import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductsMap extends BasePage {

	public ProductsMap() {
		PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
	}

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/lista_produtos_recyclerview")
	protected MobileElement produtos;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/detalhes_produto_botao_comprar")
	protected MobileElement botaoComprar;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/menu_principal_deslogar")
	protected MobileElement botaoSair;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/pagamento_botao_confirma_pagamento")
	protected MobileElement botaoConfirmarPAgamento;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	protected MobileElement campoCartao;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	protected MobileElement campoValidade;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	protected MobileElement campoCVC;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/listaPagamentos")
	protected MobileElement menuPagamentos;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/item_pagamento_id")
	protected MobileElement listaDeItens;

	protected MobileElement buscarProduto(String nome) {
		MobileElement item = produtos.findElementByXPath("//android.widget.TextView[contains(@text, '" + nome + "')]");
		return item;
	}

}