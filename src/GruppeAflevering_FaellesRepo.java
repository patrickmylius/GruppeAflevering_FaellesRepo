public class GruppeAflevering_FaellesRepo {
    //kode start
    public static void main(String[] args) {
        //instans af variable (String)
        String output = "KODNING GRUPPE OPGAVE";

        //If loop. hvis output = "KODNING GRUPPE OPGAVE" køres loop og souts printes.
        if (output == "KODNING GRUPPE OPGAVE") {
            System.out.println("Hej Mikkel Her Igen");
            System.out.println("Jeg vil gerne have fri nu! Hilsen Danijel");
            System.out.println("Hej Usamah her");
            System.out.println(" This is difficult ");
        }
        //Brug af metode som introducere gruppe
        gruppeIntroduktion();

        //Brug af metode som tager imod et "navn"
        bevisPaaString("Danijel");
        bevisPaaString("Mikkel");
        bevisPaaString("Daniella");
        bevisPaaString("Usamah");
        bevisPaaString("Patrick");

    }
    //Metode som printer souts.
    public static void gruppeIntroduktion() {
        System.out.println("******* VI ER GRUPPE *******");
        System.out.println("******* COPY PASTE   *******");
        System.out.println("            ***             ");
        System.out.println("            ***             ");
        System.out.println("            ***             ");
        System.out.println("            ***             ");
        System.out.println("            ***             ");
        System.out.println("       *************        ");
        System.out.println("       *************        ");
        System.out.println("       *************        ");
        System.out.println("       *************        ");
        System.out.println("       *************        ");
    }
    //metode, som tager imod (Tekst)
    public static void bevisPaaString(String navn){
        System.out.println(navn + " " + "er gået på weekend");
    }
}