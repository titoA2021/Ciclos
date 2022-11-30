import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura:
        -> codigo del articulo (CA)
        -> cantidad ventidad en litros (CVL)
        solo hay 3 productos:
        1- 0.6 x litro
        2- 3 x litro
        3- 1.25 x litro

        Se pide 5 facturas introducidas:
        -> Facturación total (FT)
        -> cantidad en litros vendidos del articulo 1 (CVA1)
        -> cuantas facturas se emitieron de mas de $600
         */

        int CA, CVL, CVA1=0, cont1=0;
        float factParcial = 0.0f, FT=0.0f;
        boolean flag = true;

        while (flag){
            for (int i=1; i<=5; i++){
                CA = Integer.parseInt(JOptionPane.showInputDialog("Articulo #"+i+", codigo (1-3): "));
                while (CA < 1 || CA > 3){
                    JOptionPane.showMessageDialog(null, "Solo son 3 articulos con 3 codigos");
                    CA = Integer.parseInt(JOptionPane.showInputDialog("Articulo #"+i+", codigo (1-3): "));
                }
                CVL = Integer.parseInt(JOptionPane.showInputDialog("Cuantos litros se vendió del articulo " + i));
                switch (CA){
                    case 1: factParcial = 0.6f*CVL;
                            CVA1 += CVL;
                            break;
                    case 2: factParcial = 3.0f*CVL;
                            break;
                    case 3: factParcial = 1.25f*CVL;
                            break;
                }
                FT += factParcial;
                if (factParcial > 600){
                    cont1 ++;
                }
            }
            flag = false;
        }
        System.out.println("La factura total es: " + FT);
        System.out.println("La Cantidad Vendida en Litros para el articulo 1 es de: " + CVA1);
        System.out.println("La cantidad de ventas supierores a $600 es: " + cont1);
    }
}