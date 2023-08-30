/* 
 * Создал класс HotDrink и наследовал его от Bottle.
*/

package Domen;

public class HotDrinks extends Bottle {
    private int drinkTemperature; // Добавил поле ТемператураНапитка(drinkTemperature)

    public HotDrinks(String name, int price, float bottleVolume, int drinkTemperature) { //Конструктор HotDrinks
        super(name, price, bottleVolume);
        this.drinkTemperature = drinkTemperature;

        if(bottleVolume>0.24){
            this.bottleVolume = bottleVolume;   // Проверка объема HotDrinks
        }
        else{
            this.bottleVolume = (float) 0.25;
        }

        if(drinkTemperature>30){
            this.drinkTemperature = drinkTemperature; // Проверка температуры напитка.
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
        return super.toString() + " drink temperature " + drinkTemperature + ";"; // Переопределил метод toString.
    }
    

}
    
