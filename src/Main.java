import java.util.Arrays;

public class Main {


    public static void sort(Figura[] f){
        Arrays.sort(f);
    }
    public static double suma(Figura[] figuras){
        double sum=0;

        for (int i =0; i<figuras.length; i++){
            sum=sum+figuras[i].area();
        }
        return sum;

    }

    public static void main(String[] args) {
        Figura[] f = new Figura[3];
        f[0]= new Rectangle(4,3);
        f[2]= new Rectangle(2,3);
        f[1]= new Quadrat(1);

        System.out.println("Aquí podemos ver el área total:");
        System.out.println(suma(f));
        System.out.println("Aquí podemos ver el vector de áreas sin ordenar:");
        for(int j=0; j<f.length;j++) {
            System.out.println(f[j].area());
        }
        sort(f);
        System.out.println("Aquí ver ordenado el vector de áreas:");
        for(int j=0; j<f.length;j++) {
            System.out.println(f[j].area());
        }


    }
}