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
	Men Tshirt - 1 Ite

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
	    * Eu quero fazer a compra de ao menos três produtos
	    * Para que eu possa estar bem vestida

	Exemplos:
		|email            |titulo|password|data_de_aniversario|inscreva_se_para_nossas_novidades|receba_ofertas_especiais_de_nossos_parceiros|
		|"@gmail.com"     | "Mr."| "123"  | "09/03/1993"      | "Sim"                           | "Não"                                      |


@compraDeTresProdutos
Cenário: Como um usuário quero acessar a página da automationexercise.com para realizar compras
	Dado que busco pelo site "https://automationexercise.com/" no navegador
	E devo ir para a tela principal da Automation Exercise
    Quando Eu quero fazer a compra de ao menos três produtos
    Então Para que eu possa estar bem vestida




@realizarOCadastroDoClienteEComprarTresProdutos
Esquema do Cenario: Como um usuário quero acessar a página da automationexercise.com para realizar compras
	Dado que o usuário acessa o site "https://automationexercise.com/"
	Quando clica em " Signup / Login"
	* preenche o "name" e <email> e clica no botão "Signup"
	* preencher o <titulo> <password> <data_de_aniversario> <inscreva_se_para_nossas_novidades> <receba_ofertas_especiais_de_nossos_parceiros>
	Quando preencher os dados pessoais
	Então deve criar a conta
	Quando Eu quero fazer a compra de ao menos três produtos
	Então Para que eu possa estar bem vestida

	Exemplos:
		|email            |titulo|password|data_de_aniversario|inscreva_se_para_nossas_novidades|receba_ofertas_especiais_de_nossos_parceiros|
		|"@gmail.com"     | "Mr."| "123"  | "09/03/1993"      | "Sim"                           | "Não"                                      |

