package com.everis.steps;

import static org.junit.Assert.assertEquals;

import com.everis.pages.LoginPage;
import com.everis.pages.ProductsPage;
import com.everis.util.TestRule;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

	@Before(value = "@teste_04")
	public void cadastrarUsuario() {
		Hook hooks = new Hook();
		hooks.cadastrarUsuario();
	}

	@After(value = "@teste_04")
	public void fazerLogOff() {
		ProductsPage produtosPage = new ProductsPage();
		produtosPage.clicarParaSair();
	}

	@Dado("^que acessei o app android$")
	public void acessarApp() {
		TestRule.openApplicationAndroid("/app/alura_esporte.apk");
	}

	@Quando("^o login é realizado com usuário \"(.*)\" e senha \"(.*)\"$")
	public void validarCampo(String nome, String senha) {
		LoginPage inicialPage = new LoginPage();
		inicialPage.inserirNomeUsuario(nome);
		inicialPage.inserirSenha(senha);
		inicialPage.clicarNoBotaoLogar();
	}

	@Entao("^a seguinte mensagem de erro \"(.*)\" é exibida na página de login$")
	public void verificaMensagemDeErro(String menssagemErro) {
		LoginPage inicialPage = new LoginPage();
		assertEquals(inicialPage.menssagemDeErro(), menssagemErro);
	}

	@E("^clicar no botão CADASTRAR USUARIO$")
	public void irParaCadastro() {
		LoginPage inicialPage = new LoginPage();
		inicialPage.clicarCadastrarUsuario();
	}

}
