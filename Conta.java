
class Conta {
  int numero;
  String cliente;
  double saldo;
  double limite;

  boolean saca(double valor) {
    if (this.saldo < valor) {
      return false;
    } else {
      this.saldo -= valor;
      return true;
    }
  }

  void deposita(double quantidade) { // método
    this.saldo += quantidade;

  }
  /*
   * void saca(double quantidade) {// método
   * double novoSaldo = this.saldo - quantidade;
   * this.saldo = novoSaldo;
   * }
   */
  
  /*
   * public class transferir(){
   * Conta c1 =new Conta(1000);
   * Conta c2 =new Conta(500);
   * c2.transferir(c1 ,300);
   */

  /*
   * public class conta(double saldo){
   * this.saldo = saldo;
   * }
   * public void tranferir(conta destino, int valor){
   * this.saldo -=valor;
   * this.saldo +=valor;
   * }
   */
}
