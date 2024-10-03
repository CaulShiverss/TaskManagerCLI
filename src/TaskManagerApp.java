import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager myTaskManager = new TaskManager();
        Scanner myScanner = new Scanner(System.in);

        while(true) {
            System.out.print("\n[+] ----- Gestor de Tareas ----- [+]\n\t[1] Ver Tareas\n\t[2] Agregar Tarea\n\t[3] Completar Tarea\n\t[4] Eliminar Tarea\n\t[5] Salir\n[+] Eleccion: ");
            int option = myScanner.nextInt();
            myScanner.nextLine(); // Limpiado de Buffer
            switch (option) {
                case 1:
                    myTaskManager.showTasks();
                    System.out.print("\nPulsa una tecla para volver al menu...");
                    String next = myScanner.nextLine();
                    break;
                case 2:
                    System.out.print("[+] Descripcion de la tarea: ");
                    String taskDescription = myScanner.nextLine();
                    myTaskManager.addTask(taskDescription);
                    break;
                case 3:
                    System.out.print("[+] Numero de la tarea a completar: ");
                    int completedTaskIndex = myScanner.nextInt();
                    myTaskManager.markTaskAsCompleted(completedTaskIndex - 1);
                    break;
                case 4:
                    System.out.print("[+] Numero de la tarea a borrar: ");
                    int deletedTaskIndex = myScanner.nextInt();
                    myTaskManager.removeTask(deletedTaskIndex - 1);
                    break;
                case 5:
                    System.out.print("\n[+] Saliendo...\n");
                    System.exit(0);
                default:
                    System.out.print("[?] Error. Opción no valida.");
            }
        }
    }
}