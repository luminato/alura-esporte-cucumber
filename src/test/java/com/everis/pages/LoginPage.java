package com.everis.pages;

import com.everis.map.LoginMap;

public class LoginPage extends LoginMap {

	public void inserirNomeUsuario(String nome) {
		campoUsuario.sendKeys(nome);
		// log("inseriu usuario incorreto");
	}

	public void inserirSenha(String senha) {
		campoSenha.sendKeys(senha);
		// log("inseriu senha incorreto");
	}

	public void clicarNoBotaoLogar() {
		botaoLogar.click();
	}

	public String menssagemDeErro() {
		return menssagemErro.getText();
	}

	public void clicarCadastrarUsuario() {
		botaoCadastro.click();
	}

	public boolean contemBotaoLogar() {
		return botaoLogar.isDisplayed();
	}

}