package demenagementPack;

public class Demenagement {
    // attributs
    private String factory;
    // constructeur
    public Demenagement(String name) {
        this.factory = name;
    }
    public void doWork(){
        int noTravel = 0;
        int totalBox = 34;
        int capTruck = 9;
        int emport = capTruck;

        System.out.println("Start travel");
        System.out.println("\nnoTravel\t nbCartons\t emport\t\t\t\t   capTruck\t");
        for(int rest = totalBox; rest > 0; rest -= capTruck){
            noTravel++;
            if (rest < capTruck){
                emport = rest;
            }
            System.out.print(noTravel + "\t\t\t\t" + rest + "\t\t" + "Travel with : " + emport + " box." + "\t\t" + capTruck + "\t\n");
        }
        System.out.println("\nEnd");

    }

}
