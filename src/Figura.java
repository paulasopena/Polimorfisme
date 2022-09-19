public abstract class Figura implements Comparable<Figura>{
    // no se fa el new
    public abstract double area();

    @Override
    public int compareTo(Figura o) {
        return(Double.compare(o.area(),this.area()));
    }

}
