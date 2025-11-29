package h3;

public class Mensch {
    public Mensch(){

    }
    public String name;
    public int gebJahr, alter;
    public void setName(String a){
        name = a;
    }
    public void setGebJahr(int a){
        gebJahr = a;
    }
    public void setAlter(){
        alter = 2025 - gebJahr;
    }
    public String getName(){
        return name;
    }

    public int getGebJahr(){
        return gebJahr;
    }
    public int getAlter(){
        return alter;
    }
}
