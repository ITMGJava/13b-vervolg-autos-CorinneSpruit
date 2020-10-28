public class Auto {
    private int snelheid;
    private String merk;
    private int kilometerstand;

    public int setSnelheid(int snelheid) {
        return snelheid;
    }

    public String setMerk() {
        return merk;
    }

    public int setKilometerstand() {
        return kilometerstand;
    }

    public Auto() {

snelheid = 0;
merk = "Toyota";
kilometerstand = 10000;

    }

    public void main(String[] arg) {
        var auto = new Auto();
        System.out.println(snelheid);
        System.out.println(merk);
        System.out.println(kilometerstand);


    }

}


