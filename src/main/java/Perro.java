public class Perro extends Animal {
    private String name;
    private int code;
    private String color;

    public Perro(String n,int c,String co){
        super(n,c);
        name=n;
        code=c;
        color=co;
    }

    @Override
    public void animalType() {
        System.out.println("Nombre del Perro: "+ name);
        System.out.println("Codigo del Perro: "+ code);
        System.out.println("Color del Perro: "+ color);
    }
}
