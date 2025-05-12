package edu.alenasoft;

public class ConjuredUpdater extends ItemUpdater {
    public ConjuredUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseQuality(2);
        decreaseSellIn();
        if (item.getSellIn() < 0) {
            decreaseQuality(2);
        }
    }
}
