/**
 * @autor Лузин Павел
 */

package Domen;

public class HotDrinks extends Product {
    /** Поле объем напитка */
    private float drinkVolume;

    /** Поле температура напитка */
    private int drinkTemperature;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * 
     * @param name             - имя
     * @param price            - цена
     * @param drinkVolume      - объем напитка
     * @param drinkTemperature - температура напитка
     * @see HotDrinks#HotDrinks()
     */
    public HotDrinks(String name, int price, float drinkVolume, int drinkTemperature) {
        super(name, price);
        this.drinkVolume = drinkVolume;
        this.drinkTemperature = drinkTemperature;

        if (drinkTemperature > 29) {
            this.drinkTemperature = drinkTemperature; // Проверка объема HotDrinks
        } else {
            this.drinkTemperature = 30;
        }

        if(drinkTemperature>30){
            this.drinkTemperature = drinkTemperature; // Проверка температуры напитка.
        }
        else{
            this.drinkTemperature = 31;
        }
    }

    public float getDrinkVolume() {
        return drinkVolume;
    }

    public void setDrinkVolume(float drinkVolume) {
        this.drinkVolume = drinkVolume;
    }

    public int getDrinkTemperature() {
        return drinkTemperature;
    }

    public void setDrinkTemperature(int drinkTemperature) {
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString(){
        return super.toString() + " drink volume " + drinkVolume + ";" + " drink temperature " + drinkTemperature + ";"; // Переопределил метод toString.
    }
    
}
