package tareasad.EjerciciosClase.Electrodomesticos3;

public class ElectrodTest {
    public static void main(String[] args) {
        Electrodomestico listaElectrodomestico[] = new Electrodomestico[4];

        listaElectrodomestico[0] = new Electrodomestico("Bosh", "2", 400, "Blanco", 150, 3, 1095, 0.14);
        listaElectrodomestico[1] = new Electrodomestico("LG", "54", 300, "Verde", 300, 4, 1460, 0.14);
        listaElectrodomestico[2] = new Electrodomestico("Tefal", "6", 240, "Azul", 70, 6, 2190, 0.14);
        listaElectrodomestico[3] = new Electrodomestico("Miele", "456", 1430, "Amarillo", 700, 10, 3650, 0.14);
        
       System.out.println(Electrodomestico.consumoAnual(150, 3)); 
       System.out.println(Electrodomestico.consumoAnual(300, 4)); 
       System.out.println(Electrodomestico.consumoAnual(70, 6)); 
       System.out.println(Electrodomestico.consumoAnual(700, 10)); 


        for(int i = 0; i < listaElectrodomestico.length; i++){
            ;  System.out.println(listaElectrodomestico[i]);
        }
    }


    
    

}
