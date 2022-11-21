package aula02;

class Aula02 {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "BIC";
    c1.cor = "Azul";
    c1.ponta = 0.7f;
    c1.carga = 90;
    c1.modelo = "BIC";
    c1.tampar();
    c1.rabiscar();
  }
}