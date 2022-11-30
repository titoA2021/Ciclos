public class ciclo_while {
    public static void main(String[] args) {
        int i = 1;

        while (i<=10){
            System.out.println("Numero: " + i);
            i++;
        }

        /* do while
        do{
            Instrucciones;
          } while(condicion);

          Primero ejecuta la acción y luego evalua la condición, menú de opciones,

         */
        do{
            System.out.println("numerito " + i);
        } while (i<=10);

        for (int j=1; j<11; j++){
            System.out.println("numerote: " + j);
        }
    }
}