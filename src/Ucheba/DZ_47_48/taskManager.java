package Ucheba.DZ_47_48;

import java.util.PriorityQueue;
import java.util.Queue;

public class taskManager {
    public static void main(String[] args) {
        Queue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.offer(new Task("Готовка", 2, "Гарнир"));
        taskQueue.offer(new Task("Уборка", 3, "Мытье посуды"));
        taskQueue.offer(new Task("Дом. дела", 1, "Стирка"));
        taskQueue.offer(new Task("Работа", 2, "Доклад"));

        System.out.println(taskQueue.poll());
        System.out.println(taskQueue.poll());
        System.out.println(taskQueue.poll());
        System.out.println(taskQueue.poll());
    }
}
