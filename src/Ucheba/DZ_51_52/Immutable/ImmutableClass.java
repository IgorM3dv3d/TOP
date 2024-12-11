package Ucheba.DZ_51_52.Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass mutableClass;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass mutableClass) {
        this.name = name;
        this.numbers = numbers;
        this.mutableClass = new CustomMutableClass(mutableClass);

        numbers = Collections.unmodifiableList(numbers);
    }

    @Override
    public String toString() {
        return "Student{" + name + ", " + numbers + ", " + mutableClass + "}";
    }

    public String getName() {
        return name;
    }

    public CustomMutableClass getMutableClass() {
        return new CustomMutableClass(mutableClass);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return numbers == that.numbers && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers);
    }

    public static void main(String[] args) {
        CustomMutableClass cMc = new CustomMutableClass(22);
        ImmutableClass iC = new ImmutableClass("List", List.of(1, 2, 3), cMc);
        System.out.println(iC);

        cMc.setValue(14);
        System.out.println(cMc);

        System.out.println(iC);

        CustomMutableClass cMc2 = iC.getMutableClass();
        cMc2.setValue(14);
        System.out.println(iC);

        List<Integer> mcListFrom = iC.getNumbers();
//        mcListFrom.clear();
        List<Integer> mcListFrom2 = new ArrayList<>(mcListFrom);
        mcListFrom2.clear();
    }
}
