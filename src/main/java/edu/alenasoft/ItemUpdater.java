package edu.alenasoft;

public abstract class ItemUpdater {
    protected Item item;

    public ItemUpdater(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        this.item = item;
    }

    public abstract void update();

    protected void decreaseSellIn() {
        item.setSellIn(item.getSellIn() - 1);
    }

    protected void decreaseQuality(int amount) {
        item.setQuality(Math.max(0, item.getQuality() - amount));
    }

    protected void increaseQuality(int amount) {
        item.setQuality(Math.min(50, item.getQuality() + amount));
    }
}