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
        String primeiroNome = "#first_name";
        return primeiroNome;
    }

    public String UltimoNome(){
        String ultimoNome = "#last_name";
        return ultimoNome;
    }

    public String Empresa(){
        String empresa = "#company";
        return empresa;
    }

    public String Endereco(){
        String endereco = "#adress1";
        return endereco;
    }

    public String Endereco2(){
        String endereco2 = "#adress2";
        return endereco2;
    }

    public String Pais(){
        String pais = "#country";
        return pais;
    }

    public String Estado(){
        String estado = "#state";
        return estado;
    }

    public String Cidade(){
        String cidade = "#city";
        return cidade;
    }

    public String CEP(){
        String cep = "#zipcode";
        return cep;
    }

    public String Numero(){
        String numero = "#mobile_numebr";
        return numero;
    }
}
