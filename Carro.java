public class Carro {
    private String marca;
    private String modelo;
    // private int ano;
    // private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        // this.ano = ano;
        // this.cor = cor;
    }
    // metodos
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligando...");
    }

    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligando...");
    }

    public void acelerar(double velocidade) {
        System.out.println(marca + " " + modelo + " está acelerando para " + velocidade + " km/h.");
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata");
        meuCarro.ligar();
        meuCarro.acelerar(60);
        meuCarro.desligar();
    }
}
