package human;

public abstract class Humans {

    public abstract void behavoir();


    public abstract void walking();

    public static void main(String[] args) {
        Humans h1 = new shuja();
        Humans h2 = new john();
        Humans h3 = new faraz();

        h1.behavoir();
        h2.behavoir();
        h3.behavoir();
    }
}
