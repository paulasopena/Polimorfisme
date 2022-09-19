public class Rectangle extends Figura{
    double c1, c2;
    //Constructor, ya que no se trata de una clase abstracta.
    public Rectangle(double c1, double c2){
        this.c1=c1;
        this.c2=c2;
    }

    public double area(){
        return c1*c2;
    }
}
