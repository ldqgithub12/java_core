package models;

public class Product {
    private int id;
    private String name;
    private String description;
    private int quality;
    private long money;

    public Product() {
    }

    public Product(int id, String name, String description, int quality, long money) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quality = quality;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quality=" + quality +
                ", money=" + money +
                '}';
    }
}
