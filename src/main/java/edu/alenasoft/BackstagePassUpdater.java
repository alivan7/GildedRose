package edu.alenasoft;

public class BackstagePassUpdater extends ItemUpdater {

    public BackstagePassUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        if (item.getSellIn() > 10) {
            increaseQuality(1);
        } else if (item.getSellIn() > 5) {
            increaseQuality(2);
        } else if (item.getSellIn() > 0) {
            increaseQuality(3);
        } else {
            item.setQuality(0);
        }
        decreaseSellIn();
    }
}
