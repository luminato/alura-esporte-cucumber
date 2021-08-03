package com.everis.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.everis.pages.LoginPage;
import com.everis.pages.RegisterPage;
import com.everis.util.TestRule;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class RegisterSteps {

	@Before(value = "@teste_03")
	public void cadastrarUsuario() {
		Hook hooks = new Hook();
		hooks.cadastrarUsuario();
	}

	@After(value = "@teste_03")
	public void voltarParaInicio() {
		Hook hooks = new Hook();
		hooks.voltar();
	}

	@Quando("^preencher o nome com \"(.*)\", senha \"(.*)\" e confirmar senha com \"(.*)\"$")
	public void preencherDadosDoCadastro(String nome, String senha, String confirmaSenha) {
		RegisterPage registerPage = new RegisterPage();
		registerPage.preencherNome(nome);
		registerPage.preencherSenha(senha);
		registerPage.preencherConfirmarSenha(confirmaSenha);
		TestRule.userCadastrado = true;
	}

	@E("^clicar no botão CADASTRAR$")
	public void clicarParaCastarUsuario() {
		RegisterPage registerPage = new RegisterPage();
		registerPage.clicarCadastar();
	}

	@Entao("^o aplicativo volta para a tela inicial$")
	public void verificaItemDaTelaInicial() {
		LoginPage inicialPage = new LoginPage();
		assertTrue(inicialPage.contemBotaoLogar());
	}

	@Entao("^a seguinte mensagem de erro \"(.*)\" é exibida na tela de cadastro$")
	public void verificaMensagemDeErro(String menssagemErro) {
		RegisterPage registerPage = new RegisterPage();
		assertEquals(registerPage.menssagemDeErro(), menssagemErro);
	}

}