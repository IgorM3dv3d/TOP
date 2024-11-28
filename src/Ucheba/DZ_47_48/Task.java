package Ucheba.DZ_47_48;

import java.util.HashMap;

public class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String category;


    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task [name=" + name + ", priority=" + priority + ", category=" + category + "]";
    }

    @Override
    public boolean equals(Object t) {
        if (this == t) return true;
        if (t == null || getClass() != t.getClass()) return false;
        Task task = (Task) t;
        return name.equals(task.name) && priority == task.priority && category.equals(task.category);
    }


    @Override
    public int compareTo(Task o) {
        int pr = priority - o.priority;
        if (pr != 0) {
            return this.category.compareTo(o.category);
        } else {
            return pr;
        }
    }
}
