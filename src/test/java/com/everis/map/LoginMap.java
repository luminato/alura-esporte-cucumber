package com.everis.map;

import org.openqa.selenium.support.PageFactory;

import com.everis.BasePage;
import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginMap extends BasePage {

	public LoginMap() {
		PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
	}

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_usuario")
	protected MobileElement campoUsuario;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
	protected MobileElement campoSenha;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_logar")
	protected MobileElement botaoLogar;

	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/mensagem_erro_login")
	protected MobileElement menssagemErro;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")
	protected MobileElement botaoCadastro;

}