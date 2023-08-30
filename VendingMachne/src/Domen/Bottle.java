package Domen;

public class Bottle extends Product {
    protected float bottleVolume;

    public Bottle(String name, int price, float bottleVolume) {
        super(name, price);
        this.bottleVolume = bottleVolume;

        if (bottleVolume > 0.2) {
            this.bottleVolume = bottleVolume;
        }
        else{
            this.bottleVolume = (float) 0.5;
        }
    }

    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }
    @Override
    public String toString()
    {
        return super.toString()+" volume "+this.bottleVolume + ";";
    }
}
