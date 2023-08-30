package Domen;

public class HotDrinks extends Bottle {
    private int drinkTemperature;

    public HotDrinks(String name, int price, float bottleVolume, int drinkTemperature) {
        super(name, price, bottleVolume);
        this.drinkTemperature = drinkTemperature;

        if(bottleVolume>2.4){
            this.bottleVolume = bottleVolume;
        }
        else{
            this.bottleVolume = (float) 2.5;
        }

        if(drinkTemperature>30){
            this.drinkTemperature = drinkTemperature;
        }
        else{
            this.drinkTemperature = 31;
        }
    }

    public int getDrinkTemperature() {
        return drinkTemperature;
    }

    public void setDrinkTemperature(int drinkTemperature) {
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString(){
        return super.toString() + " drink temperature " + drinkTemperature + ";";
    }
    

}
    
