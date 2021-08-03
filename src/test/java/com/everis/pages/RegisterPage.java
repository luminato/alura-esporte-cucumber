package com.everis.pages;

import com.everis.map.RegisterMap;

public class RegisterPage extends RegisterMap {

	public void preencherNome(String nome) {
		campoNome.sendKeys(nome);
	}

	public void preencherSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void preencherConfirmarSenha(String senha) {
		campoConfirmarSenha.sendKeys(senha);
	}

	public String menssagemDeErro() {
		return erroCadastro.getText();
	}

	public void clicarCadastar() {
		botaoCadastrar.click();

	}

}