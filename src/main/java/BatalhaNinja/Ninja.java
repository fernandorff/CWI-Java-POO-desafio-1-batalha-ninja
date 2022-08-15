package BatalhaNinja;

public class Ninja {

    String nome;
    int chakraDoNinja = 100;
    Jutsu jutsuPrincipal;


    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void atacar(Ninja ninjaOponente) {
        this.chakraDoNinja -= this.jutsuPrincipal.chakraConsumido;
        ninjaOponente.receberGolpe(this.jutsuPrincipal.danoCausado);
    }

    public void receberGolpe(int danoRecebido) {
        this.chakraDoNinja -= danoRecebido;
    }

}
