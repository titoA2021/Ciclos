import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura:
        -> codigo del articulo (CA)
        -> cantidad ventidad en litros (CVL)
        -> precio por litro (PPL)

        Se pide 5 facturas introducidas:
        -> Facturación total (FT)
        -> cantidad en litros vendidos del articulo 1 (CVA1)
        -> cuantas facturas se emitieron de mas de $600
         */

        int CA, CVL, CVA1=0, cont1=0;
        float PPL, factParcial, FT=0.0f;

        for (int i=1; i<=5; i++){
            CA = Integer.parseInt(JOptionPane.showInputDialog("Articulo #"+i+", codigo: "));
            CVL = Integer.parseInt(JOptionPane.showInputDialog("Cuantos litros se vendió del articulo " + i));
            PPL = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro del articulo " + i));

            factParcial = CVL*PPL;
            FT += factParcial;

            if (CA == 1){
                CVA1 += CVL;
            }
            if (factParcial > 600){
                cont1 ++;
            }
        }
        System.out.println("La factura total es: " + FT);
        System.out.println("La Cantidad Vendida en Litros para el articulo 1 es de: " + CVA1);
        System.out.println("La cantidad de ventas supierores a $600 es: " + cont1);
    }
}