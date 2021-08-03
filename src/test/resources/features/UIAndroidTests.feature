# language: pt
#encoding: utf-8

@android
Funcionalidade: Navegar no aplicativo Alura esporte

	@teste_01
  Cenario: Validar login no sistema com usuário incorreto 
		Dado que acessei o app android
		Quando o login é realizado com usuário "fulano" e senha "incorreto"
		Entao a seguinte mensagem de erro "Usuário ou senha inválidos" é exibida na página de login
		
	@teste_02
	Cenario: Cadastrar usuario no sistema com senha iguais
		Dado que acessei o app android
		E clicar no botão CADASTRAR USUARIO
		Quando preencher o nome com "fulano", senha "pass123" e confirmar senha com "pass123"
		E clicar no botão CADASTRAR
		Entao o aplicativo volta para a tela inicial
		
	@teste_03
	Cenario: Menssagens de erro ao cadastrar usuario
		Dado que acessei o app android
		E clicar no botão CADASTRAR USUARIO
		Quando preencher o nome com "<nome>", senha "<senha>" e confirmar senha com "<confSenha>"
		E clicar no botão CADASTRAR
		Entao a seguinte mensagem de erro "<menssagem>" é exibida na tela de cadastro
		
		Exemplos:
		|  nome  |  senha  | confSenha |       menssagem       |
		| fulano | pass123 |  pass123  | Usuario já Cadastrado |
		| beto   | pass123 |  321pass  |  Senhas não conferem  |
		
		
	@teste_04 
	Cenario: Validar login no sistema com usuário cadastrado
		Dado que acessei o app android
		Quando o login é realizado com usuário "fulano" e senha "pass123"
		Entao a tela de produtos é exibida
		
	@teste_05
	Cenario: Realizar uma compra na tela de produtos
		Dado que acessei o app android
		* o login é realizado com usuário "fulano" e senha "pass123"
		Quando clicar no produto "Chuteira"
		* clicar para comprar
		* preencher com numero do cartão "123456789", data de validade "01/08/2022" e cvc "0800"
		* confirmar pagamento
		Entao o produto aparece na lista de pagamentos
		
		