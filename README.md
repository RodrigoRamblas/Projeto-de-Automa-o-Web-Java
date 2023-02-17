# Projeto de Automação Web
Neste projeto é uma automação do site https://automationexercise.com/ com as melhores práticas de código limpo e automação Web.
## Vamos começar!!!
![image](https://user-images.githubusercontent.com/50155338/219525769-26811b4d-e84e-4d4f-a691-c488fca1b6e3.png)

## IDE utilizada neste projeto
  * Intellij
## Versão do Java
  * 11.0.17 2022-10-18 LTS
## Versão do Google Chrome e ChromeDriver
  * 110.0.5481.104 (Official Build) (32-bit)

---------------------------------------------------------------------------------------------------------------------
## Como eu faço para baixar o projeto?
### Para baixar o projeto você deve ter o git instalado na sua máquina, você pode baixar o git em 
```
https://git-scm.com/downloads
```
### Após a instalação do git você pode abrir o Git Bash e executar o comando 
```
git clone https://github.com/RodrigoRamblas/Projeto-de-Automa-o-Web-Java.git
```
---------------------------------------------------------------------------------------------------------------------
# Conhecendo a estrutura do projeto
## BDD
#### Temos neste projeto a implementação do BDD (Behavior Driven Development ou Desenvolvimento Orientado ao Comportamento) é uma metodologia baseada em comportamento muito utilizada pelas empresas.
  * Os arquivos .feature são os arquivos BDDs que estão no caminho src\test\resources\features
![image](https://user-images.githubusercontent.com/50155338/219530637-7433fef4-53f9-4dd7-8705-dfcdeb248f53.png)
## Classes
#### A classe Driver é responsável por inicializar o driver e ter os métodos comuns ao projeto.
![image](https://user-images.githubusercontent.com/50155338/219531635-034a2b52-e8f6-455c-b507-499410c2f339.png)
#### RunnerTest é uma classe que estende a classe abstrata Runner do JUnit e é responsável por executar testes.
![image](https://user-images.githubusercontent.com/50155338/219532941-fbbfb5f1-9b70-41df-b32f-4e7812021d83.png)
## PageObject
#### PageObject é um padrão de design que ajuda a aprimorar a manutenção de testes e reduzir a duplicação de código, também pode ser utilizado para descrever e documentar o fluxo de uma aplicação.
![image](https://user-images.githubusercontent.com/50155338/219531987-62a3a148-2d1b-4b1e-8b13-6e57b747cb7f.png)
## Passos
#### A implementação dos passos do BDD em programação java está no pacote steps.
![image](https://user-images.githubusercontent.com/50155338/219532401-b1d19921-04e9-463e-9fe3-20afa4081bb1.png)
## Como executar o projeto?
#### O projeto deve ser executado pela classe RunnerTest
![image](https://user-images.githubusercontent.com/50155338/219535524-f7576792-cd51-47f6-98e2-c73baf5b6ac3.png)



