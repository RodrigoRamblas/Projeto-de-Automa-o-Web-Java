package br.projeto.automacao.page;

import java.util.List;

public class SigupLogin {
    public String Name(){
        String name = "//div[3]/div/form/input[2]";
        return name;
    }
    public String Email(){
        String email = "//div[3]/div/form/input[3]";
        return email;
    }
    public String Signup(){
        String email = "//div[3]/div/form/input[3]";
        return email;
    }

    public String Mr(){
        String email = "id_gender1";
        return email;
    }

    public String Mrs(){
        String email = "id_gender2";
        return email;
    }

    public String Password(){
        String password = "password";
        return password;
    }

    public String Dia(){
        String dia = "days";
        return dia;
    }

    public String Mes(){
        String mes = "months";
        return mes;
    }

    public String Ano(){
        String ano = "years";
        return ano;
    }

    public String InscrevaSeParaNossasNovidades(){
        String inscrevaSeParaNossasNovidades = "newsletter";
        return inscrevaSeParaNossasNovidades;
    }

    public String RecebaOfertasEspeciaisDeNossosParceiros(){
        String recebaOfertasEspeciaisDeNossosParceiros = "optin";
        return recebaOfertasEspeciaisDeNossosParceiros;
    }

    public String PrimeiroNome(){
        String primeiroNome = "first_name";
        return primeiroNome;
    }

    public String UltimoNome(){
        String ultimoNome = "last_name";
        return ultimoNome;
    }

    public String Empresa(){
        String empresa = "company";
        return empresa;
    }

    public String Endereco(){
        String endereco = "address1";
        return endereco;
    }

    public String Endereco2(){
        String endereco2 = "address2";
        return endereco2;
    }

    public String Pais(){
        String pais = "country";
        return pais;
    }

    public String Estado(){
        String estado = "state";
        return estado;
    }

    public String Cidade(){
        String cidade = "city";
        return cidade;
    }

    public String CEP(){
        String cep = "zipcode";
        return cep;
    }

    public String Numero(){
        String numero = "mobile_number";
        return numero;
    }

    public String ContaCriadaComSucesso(){
        String contaCriadaComSucesso = "//*[@id='form']/div/div/div/h2";
        return contaCriadaComSucesso;
    }

    public String BotaoContinuar(){
        String botaoContinuar = "//*[@id=\"form\"]/div/div/div/div/a";
        return botaoContinuar;
    }
    public String ViewStylishDress(){
        String viewStylishDress = "/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[2]/ul/li/a";
        return viewStylishDress;
    }
    public String Quantidade(){
        String quantidade = "//*[@id=\"quantity\"]";
        return quantidade;
    }
    public String AddToCart(){
        String addToCart = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button";
        return addToCart;
    }
    public String ContinueShopping(){
        String continueShopping = "Continue Shopping";
        return continueShopping;
    }
    public String Products(){
        String products = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a";
        return products;
    }
    public String ViewBeautifulPeacockBlueCottonLinenSaree(){
        String viewBeautifulPeacockBlueCottonLinenSaree = "/html/body/section[2]/div/div/div[2]/div/div[33]/div/div[2]/ul/li/a";
        return viewBeautifulPeacockBlueCottonLinenSaree;
    }
    public String ViewMenTshirt(){
        String viewMenTshirt = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a";
        return viewMenTshirt;
    }
    public String Cart(){
        String cart = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a";
        return cart;
    }
    public String ProceedtoCheckout(){
        String proceedtoCheckout = "//*[@id=\"do_action\"]/div[1]/div/div/a";
        return proceedtoCheckout;
    }
    public String PlaceOrder() {
        String placeOrder = "//*[@id=\"cart_items\"]/div/div[7]/a";
        return placeOrder;
    }
    public String NomeCartao(){
        String nomeCartao = "//*[@id=\"payment-form\"]/div[1]/div/input";
        return nomeCartao;
    }
    public String NumeroCartao() {
        String numeroCartao = "//*[@id=\"payment-form\"]/div[2]/div/input";
        return numeroCartao;
    }
    public String CVC() {
        String cvc = "//*[@id=\"payment-form\"]/div[3]/div[1]/input";
        return cvc;
    }
    public String MesExpiracao() {
        String mesExpiracao = "//*[@id=\"payment-form\"]/div[3]/div[2]/input";
        return mesExpiracao;
    }
    public String AnoExpiracao() {
        String anoExpiracao = "//*[@id=\"payment-form\"]/div[3]/div[3]/input";
        return anoExpiracao;
    }
    public String Submit(){
        String submit = "//*[@id=\"submit\"]";
        return submit;
    }
    public String OrdemCriada(){
        String ordemCriada = "Order Placed!";
        return ordemCriada;
    }
    public String Continuar(){
        String continuar = "//*[@id=\"form\"]/div/div/div/div/a";
        return continuar;
    }


}
