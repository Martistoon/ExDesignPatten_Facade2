package Facade;

public class Combo {
    private String buguer;
    private String sobremesa;
    private String bebida;

    public Combo(int tipo) {
        CriarCombo(tipo);
    }

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                this.buguer = "Hamburguer de Frango";
                this.sobremesa = "Sorvete de Baunilha";
                this.bebida = "Refrigerante de Laranja";
                break;
            case 2:
                this.buguer = "Hamburguer de Carne";
                this.sobremesa = "Pudim de Leite";
                this.bebida = "Suco de Uva";
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    }

    public void setBuguer(String buguer) {
        this.buguer = buguer;
    }

    public String getBuguer() {
        return buguer;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getBebida() {
        return bebida;
    }
}
