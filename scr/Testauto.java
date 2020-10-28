public class Testauto {

    private int snelheid;
    private String merk;
    private int kilometerstand;



    public static void main(String[] arg) {

        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Tesla");

        System.out.println(auto1.getSnelheid());
        System.out.println(auto1.getMerk());
        System.out.println(auto1.getKilometerstand());

        System.out.println(auto2.getSnelheid());
        System.out.println(auto2.getMerk());
        System.out.println(auto2.getKilometerstand());

        System.out.println(Auto.motorgegevens());



    }
}
