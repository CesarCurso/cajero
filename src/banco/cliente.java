
package banco;


public class cliente {
    private String nombre;
    private String apellido;
    private String cuenta;
    private int saldo;
    
    public cliente(String nom, String ape, String cue) {
       
       nombre=nom;
       apellido = ape;
       cuenta =cue;
       saldo =1500;
       }
    
    public String dicecliente(){ //string dice el tipo de variable que devuelve
      return "El cliente es: "+nombre+" El apellido es: "+apellido+
              " Número de cuenta es: "+cuenta;
    }
    public String dicesaldo(){
        return "El saldo disponible es: "+ saldo;
    }
    public void deposito(int plata){
    saldo =saldo + plata;
    }
    public String retira (int reti){
    int resto= saldo-reti; 
        
        if (resto >0){
            saldo= saldo - reti;
            return "Se depositaron: "+ saldo;
        }else{
            return "El retiro es mayor que el saldo la operacion se cancelo.";    
        }
      }//fin retira
    
   
    public void tranfeentra(int canta){
    
            saldo=saldo+canta;
    }
    
public boolean tansferencia (int reti){
    int resto= saldo-reti; 
        if (resto >0){
            saldo= saldo - reti;
            return true;
        }else{
            return false;    
        }
      }//fin retira
        
    
    
    
}//fin clase

