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


}
