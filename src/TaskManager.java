import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void showTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("\n[+] --- Tareas --- [+]\n");
            System.out.println((i + 1) + ". " + (tasks.get(i)));
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index <= tasks.size()) {
            tasks.get(index).markAsDone();
        } else {
            System.out.println("[] Indice no valido");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index <= tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("[] Indice no valido");
        }
    }
}
