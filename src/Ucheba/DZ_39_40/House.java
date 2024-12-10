package Ucheba.DZ_39_40;

public class House {
    private int floors;
    private int rooms;
    private int garage;

    public House() {
    }

    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.garage = builder.garage;
    }

    public static class Builder {
        private int floors;
        private int rooms;
        private int garage;

        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder garage(int garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public boolean Equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms;
    }

    public int HashCode() {
        return this.floors * this.rooms * this.garage;
    }

    @Override
    public String toString() {
        return "Дом {" +
                "Этажей: " + floors +
                ", комнат: " + rooms +
                ", гараж: " + garage +
                '}';
    }
}
