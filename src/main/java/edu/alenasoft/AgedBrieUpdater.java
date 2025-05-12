package edu.alenasoft;

public class AgedBrieUpdater extends ItemUpdater{
    public AgedBrieUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        increaseQuality(1);
        decreaseSellIn();
        if (item.getSellIn() < 0) {
            increaseQuality(1);
        }
    }
}
