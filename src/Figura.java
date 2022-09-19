public abstract class Figura implements Compñarable<Figura>{
    // no se fa el new
    public abstract double area();

    @Override
    public int compareTo(Figura o) {
        System.out.println();

        return(Double.compare(this.area(),o.area()));
    }

}
