/*
 * This source file was generated by the Gradle 'init' task
 */
package taller4;
import java.text.DecimalFormat;


public class App {
    

    public static void main(String[] args) {
        
        try {
            System.out.println(Numeros_pares(13,41));
            System.out.println(Loteria());
             System.out.println(Fibonacci(5));
             System.out.println(Separar_impares(120));
             System.out.println(Sumar_alea(7));
            int numero_aleatorio=(int)(Math.random()*(30-20+1)+20);
            for(int i=0;i<numero_aleatorio;i++){
                  System.out.println(Buscar_raiz());
                }
            
        } 
        
        catch (Exception e) {
            System.out.println("hubo un error"+e);
        }

    }

    /* TODAS LAS FUNCIONES DEBEN LLEVAR CONTROL DE ERRORES, SI EL ENUNCIADO NO LO ESPECIFICA, LO DEBES PONER
     * DE ACUERDO CON TU CRITERIO
     */

    /* 
     * 1.	Escriba una función que reciba un entero positivo entre 100 y 500 y retorne en un texto todos los números impares desde 1 
     * hasta ese número separados por comas en grupos de hasta 8 números.
     * 
    */

    public static String Separar_impares(int numero){
      try{
          int numero_min=100;
          int numero_max=500;
          String txt_retornar="";
          int lote=0;

          if(numero<numero_min || numero>numero_max){
              return "numero no valido";
          }

          for(int i=1;i<=numero;i++){
              if(i%2==1){
                  txt_retornar+=i +"-";
                  lote++;
              }else if(lote%8==0){
                  txt_retornar+="\n";
              }
          }
          return txt_retornar;

      }
      catch(Exception e){
          return "error en separar funcion";
      }
  }

    /* 2. 	Escriba una función que reciba un entero N mayor de 2  y retorne un string cono esos N términos de la 
    serie de Fibonacci (La sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 
    y continúa añadiendo números que son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 
    987, 1597…)
     * 
     * 
    */
    public static String Fibonacci(int numero){
    try{
      int suma_numeros=1;
      int nro_anterior=0;
      String txt_retornar="0-1-";
      

      for(int i=0;i<numero;i++){
        suma_numeros=suma_numeros+nro_anterior;
        nro_anterior=suma_numeros-nro_anterior;
        txt_retornar+=suma_numeros+"-";

      }
      return txt_retornar;
      
    }
    catch(Exception e){
      return "error en la funcion";
      
    }
  }

    /* 
     * 3.	Diseñar y desarrollar una función que NO reciba datos de entrada, genere aleatoriamente un número entre 2 y 355, 
       le calcule su raíz cuadrada y retorne este valor. Para calcular las raíces usar la función Sqrt de la biblioteca Math.

       En el main, antes de invocar la función, se debe calcular un aleatorio entre 20 y 30 el cual establecerá la cantidad 
       de veces que va a llamar a la función y en un ciclo, mostrar los resultados.

    */
    public static double Buscar_raiz(){
    try{
      int numero_min=2;
      int numero_max=355;
      int numero_random=(int)(Math.random()*(numero_max-numero_min+1)+numero_min);
      double raiz=Math.sqrt(numero_random);
      
      return raiz;
    }
    catch(Exception e){
      return 0;
    }
  }




    /*4.	Diseñar y desarrollar una función que reciba un valor inicial y un valor final, para generar 900 números aleatorios 
        en este rango y retorne un texto que diga cuántos números pares fueron generados. Controle que el nro inicial sea menor que 
        nro final para establecer el rango.

        Llame la función desde el main e imprimir el resultado arrojado.
    */
    public static String Numeros_pares(int numero_inicial,int    numero_final){
    try{
      if(numero_inicial>numero_final){
        return "error al colocar numeros";
      }else{
      String txt_retornar="";
      int contador_pares=0;
      int nro_random=(int)(Math.random()*(numero_final-numero_inicial+1)+numero_inicial);
      
      for(int i=0;i<900;i++){
        if(nro_random%2==0){
          contador_pares++;
        }
        nro_random=(int)(Math.random()*(numero_final-numero_inicial+1)+numero_inicial);
        
      }
      txt_retornar="La cantidad de numeros pares es: "+contador_pares;
      return txt_retornar;
      }
    }
    catch(Exception e){
      return "error en la funcion ";
    }
  }




    /* 5.	Diseñar y desarrollar una función que calcule una cantidad de números aleatorios que viene como parámetro de entrada 
        y los sume.  La función deberá retornar el total de la suma. Usted defina los rangos que va a usar en el cálculo.

        Llame la función desde el main e imprimir el resultado arrojado.

      
    */
    public static  int Sumar_alea(int cant_nros){
    try{
     int suma=0;
     int nro_random=0;
     for(int i=0;i<cant_nros;i++){
       nro_random=(int)(Math.random()*(100-1+1)+1); 
       suma+=nro_random;
     }
      return suma;
    }
    catch(Exception e){
      return -1;
    }
    
  }


    /* 6.	Se requiere una función para simular el sorteo de una lotería, de acuerdo con las siguientes condiciones:

            La lotería tiene 20 premios. 

            Cada premio que calcula el programa debe tener el número de 4 cifras entre 0000 y 9999 acompañado de la serie 
            que es un número entre 100 y 150.

            Ejemplo: 5698-101

            Cada premio lo debe imprimir el programa de la siguiente forma (n representa un número cualquiera):

            Sorteo # nn - Número Premiado nnnn - Serie nnn

            Ejm: Sorteo # 19  - Número Premiado 5698 - Serie 101

            Para tener en cuenta la forma en la cual se informan los 20 resultados: 

            Del premio 20 al 6 el programa imprime: 

            ======PREMIOS MENORES=======
            y la lista de los 15 premios 

            Del premio 5 al 2 el programa imprime:
            ======PREMIOS SECOS=========
            y la lista de los 4 premios secos

            AL llegar al premio 1, el programa imprime:
            ======Premio mayor==========
            Y el premio mayor

            Nota: para sacar el premio mayor calcule el random por cada número, como lo hacen en la realidad los sorteos.

            La función no recibe parámetros y devuelve un string con toda la lista de premios. El main, invoca la función 
            e imprime el resultado que esta arroje. 


     * 
     * 
    */
    public static String Loteria(){
    try{
      int numero_premios=20;
      String txt_retornar="";
      String premios_menores="===PREMIOS MENORES==="+ "\n";
      String premios_secos="===PREMIOS SECOS==="+ "\n";
      String premio_mayor="===PREMIO MAYOR==="+ "\n";
      
      int min_premio = 1;
      int max_premio = 9999;
      int min_serie = 100;
      int max_serie = 150;
      int numero_random_premio = (int) (Math.random() * (max_premio - min_premio + 1)) + min_premio;
      int numero_random_serie = (int) (Math.random() * (max_serie - min_serie+1)+min_serie);
      DecimalFormat df = new DecimalFormat("0000");
      String numero_formateado =df.format(numero_random_premio);

      

      for(int i=numero_premios;i>0;i--){
        numero_random_premio= (int) (Math.random() * (max_premio - min_premio + 1)) + min_premio;
        numero_formateado = df.format(numero_random_premio);
        numero_random_serie = (int) (Math.random() * (max_serie - min_serie+1)+min_serie);
        
        if(i>=6){
          premios_menores+="sorteo #"+i+" - numero premiado " + numero_formateado+  " - serie  "+numero_random_serie + "\n " ;
          
        }
        else if(i>=2 && i<6){
          premios_secos+="sorteo #"+i+" - numero premiado  "+numero_formateado+ "  - serie  "+ numero_random_serie+ "\n ";
        }
        else{
          premio_mayor+="sorteo #"+i+" - numero premiado    "+numero_formateado+ "  - serie  "+numero_random_serie+ " \n ";
        }
      }
      txt_retornar=premios_menores+premios_secos+premio_mayor;

      return txt_retornar;
      
    }
    catch(Exception e){
      return "error en la funcion";
      
    }
  }

}
