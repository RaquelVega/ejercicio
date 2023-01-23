public class Main {
    public static void main(String[] args) {

        /*
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */

        int numeroif = -9;

        if (numeroif<0){
            System.out.println("Numero es Negativo");
        }else if (numeroif == 0) {
            System.out.println("Numero es 0");
        }else{
            System.out.println("Numero es Positivo");
        }

     /*
    Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.
     */
        int numerowhile = 0;
        while (numerowhile<3){
            numerowhile++;
            System.out.println(numerowhile);
        }

        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
         */
        do {
            System.out.println(numerowhile);
            numerowhile++;
        }while (numerowhile<3);
    /*
    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
    que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */
        int numerofor = 0;
        for (int i =0; numerofor <= 3;numerofor++){
            System.out.println("Numero: " + numerofor + " menor o igual a 3");
        }

      /*
      Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
      Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
      También habrá que poner un default para cuando el valor de la variable no sea una estación.
       */

        String estacion =  "HOLA";
       switch (estacion){
           case "VERANO":
           case "INVIERNO":
           case "PRIMAVERA":
           case "OTONO":
               System.out.println("La estacion del ano es: " + estacion);
               break;
           default:
               System.out.println("Estamos en Default");
       }

    }
}