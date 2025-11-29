package h3;

public class H3_main {

    public static void main(String[] args){
        Mensch e = new Mensch();
        e.setName("Elsa");
        e.setGebJahr(2010);
        e.setAlter();
        System.out.println(e.getName() + ": " + e.getGebJahr() + ", " + e.getAlter());
    }
}
