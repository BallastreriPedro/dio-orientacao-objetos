package abstracao;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("6436223");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("4523537");
        z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
