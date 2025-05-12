package edu.alenasoft;

public class NormalItemUpdater extends ItemUpdater {
    public NormalItemUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseQuality(1);
        decreaseSellIn();
        if (item.getSellIn() < 0) {
            decreaseQuality(1);
        }
    }
}
