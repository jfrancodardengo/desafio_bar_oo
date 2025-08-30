package entities;

public class Bill {
    public static final double MALE_TICKET = 10.0;
    public static final double FEMALE_TICKET = 8.0;
    public static final double BEER_PRICE = 5.0;
    public static final double SOFT_DRINK_PRICE = 3.0;
    public static final double BARBECUE_PRICE = 7.0;
    public static final double TAX_COVER = 4.0;

    public char gender;
    public int beer, barbecue, softDrink;

    public double cover(){
        if(feeding() >= 30.0){
            return 0.0;
        } else {
            return TAX_COVER;
        }
    }

    public double feeding() {
        return (BEER_PRICE * beer) + (SOFT_DRINK_PRICE * softDrink) + (BARBECUE_PRICE * barbecue);
    }

    public double ticket(){
        if(gender == 'M'){
            return MALE_TICKET;
        } else {
            return FEMALE_TICKET;
        }
    }

    public double total(){
        return cover() + feeding() + ticket();
    }
}
