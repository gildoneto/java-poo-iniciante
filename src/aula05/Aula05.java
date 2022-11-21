package aula05;

class Aula05 {
  public static void main(String[] args) {
    ContaBanco cc = new ContaBanco();
    cc.setNumConta(1111);
    cc.setDono("Joao");
    cc.abrirConta("CC");

    ContaBanco cp = new ContaBanco();
    cp.setNumConta(2222);
    cp.setDono("Maria");
    cp.abrirConta("CP");
    
    cc.depositar(100);
    cp.depositar(500);
    
    cc.estadoAtual();
    cp.estadoAtual();
  }
}
