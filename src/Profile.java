public class Profile {
    // Encapsulate variables
    private String voorNaam;
    private String achterNaam;
    private int leeftijd;
    private double gewicht;
    private double lengte;




    // Constructors with overloading
    // voornaam, achternaam, leeftijd, gewicht, lengte
    public Profile() {
        this.voorNaam=null;
        this.achterNaam=null;
        this.gewicht=0.0;
        this.leeftijd=0;
        this.lengte=0.0;



        // this(null, null, 0, 0, 0.0);
    }

    //
    public Profile(String voorNaam,
                   String achterNaam) {

        this.voorNaam=voorNaam;
        this.achterNaam=achterNaam;
        this.gewicht=0.0;
        this.leeftijd=0;
        this.lengte=0.0;
        //this(voorNaam, achterNaam, 0, 0.0, 0.0);
    }

    //
    public Profile(String voorNaam,
                   String achterNaam,
                   int leeftijd,
                   double gewicht,
                   double lengte) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
    }


    // Set variable voorNaam
    public void setVoorNaam(String voorNaam)
    {
        this.voorNaam = voorNaam;
    }
    //
    // Get variable voorNaam
    public String getVoorNaam()
    {
        return voorNaam;
    }



    // Set variable achterNaam
    public void setAchterNaam(String achterNaam)
    {
        this.achterNaam = achterNaam;
    }
    //
    // Get variable achterNaam
    public String getAchterNaam()
    {
        return achterNaam;
    }


    // Set variable leeftijd
    public void setLeeftijd(int leeftijd)
    {
        this.leeftijd = leeftijd;
    }
    //
    // Get variable leeftijd
    public int getLeeftijd()
    {
        return this.leeftijd;
    }


    // Set variable gewicht
    public void gewicht(double gewicht)
    {
        this.gewicht = gewicht;
    }
    //
    // Get variable gewicht
    public double getGewicht()
    {
        return gewicht;
    }


    // Set variable lengte
    public void setLengte(double lengte)
    {
        this.lengte = lengte;
    }
    //
    // Get variable lengte
    public double getLengte()
    {
        return this.lengte;
    }


    public String getBmi()
    {
        // return calculated BMI
        double bmi = gewicht / (lengte * lengte);

        return String.format("%.2f", bmi);
    }


    // Get calculated bmi


    public void changeName(String newName)

    {
        this.voorNaam = newName;
    }

    public void changeSurname(String newSurname)
    {
        this.achterNaam = newSurname;
    }



    public void changeAge(int Age)
    {
        this.leeftijd = Age;
    }



    public static void main(String[] args) {



    }

}
