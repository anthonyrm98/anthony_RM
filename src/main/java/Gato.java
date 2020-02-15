public class Gato extends Animal {
    private String name;
    private int code;
    private String color;

    public Gato(String n,int c,String co){
        super(n,c);
        name=n;
        code=c;
        color=co;
    }

    @Override
    public void animalType() {
        System.out.println("Nombre del Gato: "+ name);
        System.out.println("Codigo del Gato: "+ code);
        System.out.println("Color del Gato: "+ color);
    }
}

