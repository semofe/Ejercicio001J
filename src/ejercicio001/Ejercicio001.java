package ejercicio001;

public class Ejercicio001 {

    public static void main(String[] args) {
        
        Poke p1 = new Poke();
        
        p1.name = "Charizard";
        p1.type = "Fire" ;

        System.out.println("Name: " + p1.name + " - " + "Type: "+ p1.type + " - " + "Level: " + p1.lvl + " - " + "Evolution: " + p1.evo);
    }
}