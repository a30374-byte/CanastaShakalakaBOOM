import java.util.Scanner;

public class Canasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iCase;
        int iLanzamiento;
        int iCanastas = 0;

        int[] arrLanzamientos4 = {0, 1, 1, 1}; // 4 lanzamientos
        int[] arrLanzamientos5 = {1, 0, 0, 0, 1}; // 5 lanzamientos
        int[] arrLanzamientos6 = {0, 1, 1, 1, 0, 0}; // 6 lanzamientos
        int[] arrLanzamientos7 = {1, 1, 1, 0, 1, 1, 1}; // 7 lanzamientos
        int[] arrLanzamientos8 = {1, 0, 1, 1, 0, 1, 0, 0}; // 8 lanzamientos

        do {
            System.out.printf("ELEGIR CASO - MENU PRINCIPAL%n");
            System.out.println("1 - Contar Canastas");
            System.out.println("2 - Calcular Porcentaje");
            System.out.println("3 - Encontrar Mejor Racha");
            System.out.println("4 - Comprobar si Existe Racha");
            iCase = sc.nextInt();

            if (iCase < 1 || iCase > 4){
                System.out.println("Esa opción no existe.");
            }
        } while (iCase < 1 || iCase > 4);


        switch (iCase) {
            case 1:
                do {
                    System.out.println("¿Cuántos lanzamientos has realizado? (Entre 4 y 8)");
                    iLanzamiento = sc.nextInt();

                } while (iLanzamiento <= 2 || iLanzamiento > 8);

                switch (iLanzamiento) {
                    case 4:
                        int iLoopBreak4 = 0;
                        iCanastas = contarCanastas(arrLanzamientos4, iLoopBreak4);

                        System.out.printf("Ha realizado %d canastas en %d lanzamientos", iCanastas, arrLanzamientos4.length);


                        break;
                    case 5:
                        int iLoopBreak5 = 0;
                        iCanastas = contarCanastas(arrLanzamientos5, iLoopBreak5);

                        System.out.printf("Ha realizado %d canastas en %d lanzamientos", iCanastas, arrLanzamientos5.length);

                        break;
                    case 6:
                        int iLoopBreak6 = 0;
                        iCanastas = contarCanastas(arrLanzamientos6, iLoopBreak6);

                        System.out.printf("Ha realizado %d canastas en %d lanzamientos", iCanastas, arrLanzamientos6.length);

                        break;
                    case 7:
                        int iLoopBreak7 = 0;
                        iCanastas = contarCanastas(arrLanzamientos7, iLoopBreak7);

                        System.out.printf("Ha realizado %d canastas en %d lanzamientos", iCanastas, arrLanzamientos7.length);

                        break;
                    case 8:
                        int iLoopBreak8 = 0;
                        iCanastas = contarCanastas(arrLanzamientos8, iLoopBreak8);

                        System.out.printf("Ha realizado %d canastas en %d lanzamientos", iCanastas, arrLanzamientos8.length);

                        break;
                }
                break;
        }

    }

    public static int contarCanastas(int[] arrLanzamientos, int iLoopBreak){
        int iCanastas = 0;

        if (iLoopBreak >= arrLanzamientos.length) {
            return 0;
        }
        else {
            iCanastas += contarCanastas(arrLanzamientos, iLoopBreak + 1) + arrLanzamientos[iLoopBreak];
        }

        return iCanastas;
    }
    /*
    }
    public static int calcularPorcentaje( ){

    }

    public static int calcularRacha (int[] lanzamientos){

    }

    public static boolean existeRacha(int[] lanzamientos, int n){

    }
    */
}
