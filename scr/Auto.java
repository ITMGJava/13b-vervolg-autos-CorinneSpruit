public class Auto {
    private int snelheid;
    private String merk;
    private int kilometerstand;

    public static String motorgegevens(){
    return "Motor: Colombo V12 580 pk 980 kilo 3,8 liter";
    }


    public Auto() {
        snelheid = 0;
        merk = "Toyota";
        kilometerstand = 10000;
    }

    public Auto(String merk) {
     //   System.out.println(merk);
        snelheid = 0;
        kilometerstand = 20000;

    }



   public int getSnelheid() {
    return snelheid;
    }

    public void setSnelheid() {
        this.snelheid = snelheid;
    }

  public String getMerk() {
    return merk;
    }

    public void setMerk() {
        this.merk = merk;
    }

  public int getKilometerstand() {
    return kilometerstand; }

    public void setKilometerstand() {
        this.kilometerstand = kilometerstand;
    }

}

