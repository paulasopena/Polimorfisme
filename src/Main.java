import java.util.Arrays;

public class Main {


    public static void sort(Figura[] f){
        Arrays.sort(f);
    }


    public static void main(String[] args) {
        Figura[] f = new Figura[3];
        f[0]= new Rectangle(4,3);
        f[2]= new Rectangle(2,3);
        f[1]= new Quadrat(1);
        sort(f);
    }
}