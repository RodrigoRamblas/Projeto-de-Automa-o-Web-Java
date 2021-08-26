#language: pt

@realizarCompras
Funcionalidade: Acessar a página da Amazon e realizar compras

@acessarAmazon
Cenário: Como um usuário quero acessar a página da Amazom.com para realizar compras
	Dado que busco pelo site "https://www.amazon.com.br/" no navegador
	Então devo ir para a tela principal da Amazon

@realizarLogin
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