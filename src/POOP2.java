/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author estudiante
 */
public class POOP2 {
    public static void main(String[] args) {
        
        System.out.println("hola mundo!");
        System.out.println("######## if ########");
        int a = 5;
        int b = 3;
        if (a>b) {
            System.out.println("a es mayor que b");          
        } else {
            System.out.println("b es mayor que a");
        }
        
        System.out.println("######## if ########");
        if (menor(a,b)) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("b es menor que a");
        }
        
        System.out.println("######## switch ########");
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("No es un dia de la semana");
        }
        
        System.out.println("######## switch ########");
        char vocal = 'a';
        switch (vocal) {
            case 'a':
                System.out.println("Elegiste la vocal A");
                break;
            case 'e':
                System.out.println("Elegiste la vocal E");
                break;
            case 'i':
                System.out.println("Elegiste la vocal I");
                break;
            case 'o':
                System.out.println("Elegiste la vocal O");
                break;
            case 'u':
                System.out.println("Elegiste la vocal U");
                break;
            default:
                System.out.println("No elegiste una vocal");
        }
        System.out.println("############## while ##############");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
        
        System.out.println("############## do-while ##############");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        
        System.out.println("############## for ##############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
        System.out.println("############## for ##############");
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        
        System.out.println("############## or-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
    }

    private static boolean menor(int a, int b) {
        return (a<b);
    }
    
}