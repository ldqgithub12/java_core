package models;

public class Player {
    private int number;
    private String name;
    private Position position;

    public Player() {
    }

    public Player(int number, String name, Position position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
