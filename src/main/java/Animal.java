public abstract class Animal {
    protected String name;
    protected int code;

    public Animal(String n,int c){
        name=n;
        code=c;
    }

    public abstract void animalType();
}
