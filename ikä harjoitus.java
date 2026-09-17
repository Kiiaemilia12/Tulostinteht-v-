 public class ikä {
    public static void main(String[] args) throws Exception {
        int ika = 40;

        // Tulostusehdot
        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa"); 
            }

            if (ika > 15){
                System.out.println("Voit ajaa kevaria");
            }

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
            if (ika == 65){
                System.out.println("Hyviä eläkepäiviä!");
            }
            if (ika == 100){
                System.out.println("Olet 100-vuotias!");
                System.out.println("Paljon onnea");
                System.out.println("!!!!!!!!!!");
            }
        } else if (ika == 18){
            System.out.println("Olet juuri tullut täysi-ikäiseksi, saat ajaa autoa!");
        } else {
            System.out.println("Olet aikuinen");
            if (ika % 10 == 0){
                System.out.println("Onnea tasavuosikymmenestä!");
            }
            if (ika >= 40 && ika <= 50){
                System.out.println("Parasta keski-ikää!");
            }
            if (ika > 58 && ika < 65) {
                System.out.println("Voit mennä varhaiseläkkeelle");
            }
        }
    }
}
    


