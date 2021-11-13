
package banco;

import java.util.Scanner;

public class cuenta {
     private static String elecuenta; 
     private static cliente cuero;
     private static cliente cuero2;
     private static String cuentacomp;
     public static void main(String[] args){
            cliente clienteuno= new cliente("Ali","Altami","0100"); 
            cliente clientedos= new cliente("Pepe","Princi","0200");
     
    /* System.out.println(clientedos.dicecliente());
     System.out.println(clientedos.dicecliente());
     System.out.println(clientedos.dicesaldo());*/
     System.out.println("Ingrese su numero de cuenta");
     
     Scanner cuen= new Scanner(System.in);
     String ncuenta= cuen.nextLine();
     if(ncuenta.equals("0100")){
      cuero= clienteuno;
      cuero2=clientedos;
      cuentacomp="0100";
      System.out.println(cuero.dicecliente()); 
     }else if(ncuenta.equals("0200")){
         cuero= clientedos;
         cuero2=clienteuno;
         cuentacomp="0200";
         System.out.println(cuero.dicecliente());
     }else{
     System.out.println("Ingreso mal operacion cancelada");
     System.exit(0);
     }// fin if
     cuenta.menu(); 
     }//fin main
     
     private static void menu(){
       Scanner entra= new Scanner(System.in);
       System.out.println("Menu funciones:");
       System.out.println("1 Consultar saldo");
       System.out.println("2 Depositar dinero");
       System.out.println("3 Retirar dinero");
       System.out.println("4 Transferir dinero");
       System.out.println("5 Salir del menu");
       String dato= entra.nextLine();
             
       switch(dato){
          case "1" :
                    //System.out.println("eligio saber el saldo uno");
                    System.out.println(cuero.dicesaldo());
                    cuenta.menu();
                    break; 
         case "2" :
                   System.out.println("Ingrese la cantidad a depositar: ");
                   Scanner monto= new Scanner(System.in);
                   int canti= monto.nextInt();
                   cuero.deposito(canti);
                   System.out.println(cuero.dicesaldo());
                   cuenta.menu();
                   break; // break es opcional
         case "3" :
                   System.out.println("Ingrese el monto a retirar:");
                   Scanner reti= new Scanner(System.in);
                   int retira= reti.nextInt();
                   cuero.retira(retira);
                   System.out.println(cuero.dicesaldo());
                   cuenta.menu();
                   break; // break es opcional
        case "4" :
                  System.out.println("Ingrese la cantidad al tranferir:");
                  Scanner transfe= new Scanner(System.in);
                  int trafe= transfe.nextInt();
                  if(cuentacomp.equals("0100")){
                      
                      
                   if(   cuero.tansferencia(trafe)){;
                      cuero2.tranfeentra(trafe);
                      System.out.println("Se tranfirieron: "+trafe);
                      System.out.println(cuero.dicesaldo());
                   
                   }  else{ System.out.println("La transferencia supera los fondos Cancelada");}
                  }else if(cuentacomp.equals("0200")){
                     
                      if(   cuero.tansferencia(trafe)){;
                      cuero2.tranfeentra(trafe);
                      System.out.println("Se tranfirieron: "+trafe);
                      System.out.println(cuero.dicesaldo());
                      } else{ System.out.println("La transferencia supera los fondos Cancelada");}
                   
                   }else {
                     System.out.println("Error en datos se cancelo");
                  }
                  cuenta.menu();
                  break; // break es opcional
        case "5" :
                 System.out.println("Salio del sistema.");
                 System.exit(0);
        default : 
        } //fin del switch
     }//   fin menu jprocedi
     
             
      
}
