package com.everis.steps;

import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hook {

	LoginSteps login = new LoginSteps();
	RegisterSteps register = new RegisterSteps();
	TestRule testRule = new TestRule();

	public void cadastrarUsuario() {
		if (TestRule.userCadastrado == false) {
			TestRule.openApplicationAndroid("/app/alura_esporte.apk");
			login.irParaCadastro();
			register.preencherDadosDoCadastro("fulano", "pass123", "pass123");
			register.clicarParaCastarUsuario();
			TestRule.userCadastrado = true;
		} else {
			System.out.println("usuario já cadstrado.");
		}
	}

	public void voltar() {
		AndroidDriver<MobileElement> botaoVoltar = TestRule.getDriver();
		botaoVoltar.navigate().back();

	}
}
