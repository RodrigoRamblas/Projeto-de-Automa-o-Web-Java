package br.projeto.automacao.page;

public class ComprasItens {
    public String BlueTop(){
        String blueTop = "//a[contains(text(),'Add to cart')])[2]";
        return blueTop;
    }
    public String ContinueShopping(){
        String continueShopping = "Continue Shopping";
        return continueShopping;
    }
    public String MenTshirt(){
        String menTshirt = "//a[contains(text(),'Add to cart')])[4]";
        return menTshirt;
    }
    public String SleevelessDress(){
        String sleevelessDress = "//a[contains(text(),'Add to cart')])[6]";
        return sleevelessDress;
    }
}
