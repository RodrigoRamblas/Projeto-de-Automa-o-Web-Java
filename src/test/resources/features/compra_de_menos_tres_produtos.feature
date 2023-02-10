#language: pt

@realizarCompras
Funcionalidade: Acessar a página da Automation Exercise e realizar compras
	Regra:
	1 - WEB Desenvolva, uma automação de testes para o e-commerce: https://automationexercise.com/

	O projeto deve conter, pelo menos, um cenário de teste para a seguinte História do Usuário:

	História do Usuário #1:
	Como um cliente cadastrado no https://automationexercise.com/
	Eu quero fazer a compra de ao menos três produtos
	Para que eu possa estar bem vestida

	Os seguintes produtos do e-commerce devem ser adicionados ao carrinho de compras com as seguintes quantidades.

	Stylish Dress  - 3 Itens
	Beautiful Peacock Blue Cotton Linen Saree - 2 itens
	Men Tshirt - 1

@acessarAutomationExercise
Cenário: Como um usuário quero acessar a página da automationexercise.com para realizar compras
	Dado que busco pelo site "https://automationexercise.com/" no navegador
	Então devo ir para a tela principal da Automation Exercise

@realizarOCadastroDoCliente
	Esquema do Cenario: Realizar o cadastro do cliente
		Dado que o usuário acessa o site "https://automationexercise.com/"
		Quando clica em " Signup / Login"
		* preenche o "name" e <email> e clica no botão "Signup"
		* preencher o <titulo> <password> <data_de_aniversario> <inscreva_se_para_nossas_novidades> <receba_ofertas_especiais_de_nossos_parceiros>
		Quando preencher os dados pessoais
		Então deve criar a conta

	Exemplos:
		|email            |titulo|password|data_de_aniversario|inscreva_se_para_nossas_novidades|receba_ofertas_especiais_de_nossos_parceiros|
		|"@gmail.com"     | "Mr."| "123"  | "09/03/1993"      | "Sim"                           | "Não"                                      |


@compraDeTresProdutos
Cenário: Como um usuário quero acessar a página da automationexercise.com para realizar compras
	Dado Como um cliente cadastrado no "https://automationexercise.com/"
    Quando Eu quero fazer a compra de ao menos três produtos
    Então Para que eu possa estar bem vestida



@realizarCompraDeMenosTresProdutos
Esquema do Cenário: Como um usário quero me logar para realizar compras
	Dado que busco pelo site "https://www.amazon.com.br/" no navegador
	Então devo ir para a tela principal da Amazon
	Quando clico no botão "Faça seu login"
	Então devo ir para a tela "Fazer login"
	Quando digito o meu "<e-mail ou número de telefone celular>" 
	E clico no botão "Continuar"
	E digito a minha "<Senha>"
	E clico no botão "Fazer login"
	Então devo me logar
	
	Exemplos:
		| e-mail ou número de telefone celular | Senha                    |
		| projetowebjava2021@gmail.com         | Ferrari!xLamborghini2021 |
		
@realizarBuscaPorProdutos
Esquema do Cenário: Como um usário quero me logar para realizar compras
	Dado que busco pelo site "https://www.amazon.com.br/" no navegador
	Então devo ir para a tela principal da Amazon
	Quando clico no botão "Faça seu login"
	Então devo ir para a tela "Fazer login"
	Quando digito o meu "<e-mail ou número de telefone celular>" 
	E clico no botão "Continuar"
	E digito a minha "<Senha>"
	E clico no botão "Fazer login"
	Então devo me logar
	Quando busco o "<Produto>"
	E seleciono o produto desejado
	Quando adiciono no carrinho
	E clico no "Carrinho"
	E clico em "Fechar pedido"
	Então devo selecionar um endereço de envio com "<Telefone>","<CEP>","<NumeroDaResidencia>"
	Quando clico no botão "Adicionar endereço"
	Exemplos:
		| e-mail ou número de telefone celular | Senha                    | Produto                          | Telefone    | CEP       | NumeroDaResidencia |
		| projetowebjava2021@gmail.com         | Ferrari!xLamborghini2021 | Apple iPhone 12 (128 GB, Branco) | 11970216812 | 08780-070 | 100                |