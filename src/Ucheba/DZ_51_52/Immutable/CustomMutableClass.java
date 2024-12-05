package Ucheba.DZ_51_52.Immutable;

public class CustomMutableClass {
    private int value;

    public CustomMutableClass(int value) {
        this.value = value;
    }

    public CustomMutableClass(CustomMutableClass other) {
        this.value = other.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CMc{" + value + '}';
    }
}
