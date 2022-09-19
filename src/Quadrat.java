public class Quadrat extends Rectangle{

    //Constructor, ya que no se trata de una clase abstracta.
    public Quadrat(double c){
        super(c,c);
    }

    public double area(){
        return c1*c2;
    }
}
