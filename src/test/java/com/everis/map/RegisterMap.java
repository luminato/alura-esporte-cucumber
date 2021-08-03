package com.everis.map;

import org.openqa.selenium.support.PageFactory;

import com.everis.BasePage;
import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterMap extends BasePage {

	public RegisterMap() {
		PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
	}

//	@AndroidFindBy(accessibility = "TextFields")
//	protected MobileElement textFields;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
	protected MobileElement campoNome;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
	protected MobileElement campoSenha;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
	protected MobileElement campoConfirmarSenha;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
	protected MobileElement botaoCadastrar;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/erro_cadastro")
	protected MobileElement erroCadastro;

}