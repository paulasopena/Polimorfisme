public class Cercle extends Figura{
    double radi;
    //Constructor, ya que no se trata de una clase abstracta.
    public Cercle(double radi){
        this.radi=radi;

    }

    public double area(){
        return Math.PI*radi*radi;
    }
}
