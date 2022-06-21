package classes;

public class ContaCorrente extends ContaBancaria {
public void setLimite(double value) {
   this.limite = value;
   }
   
   public double getLimite() {
      return this.limite;
   }
   
   private double limite;
   
   
}
