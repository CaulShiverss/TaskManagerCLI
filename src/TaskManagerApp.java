import java.util.Scanner;

public class TaskManagerApp {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";

    public static void main(String[] args) {
        TaskManager myTaskManager = new TaskManager();
        Scanner myScanner = new Scanner(System.in);

        while(true) {
            System.out.print(AMARILLO + "\n[+] ----- " + RESET + "Gestor de Tareas"  + AMARILLO + " ----- [+]\n\t[1] " + RESET + "Ver Tareas\n\t" + AMARILLO + "[2] " + RESET + "Agregar Tarea\n\t"  + AMARILLO + "[3] " + RESET + "Completar Tarea\n\t" + AMARILLO + "[4] " + RESET + "Eliminar Tarea\n\t" + AMARILLO + "[5] " + RESET + "Salir\n" + AMARILLO + "[+] " + RESET + "Eleccion: " + RESET);
            int option = myScanner.nextInt();
            myScanner.nextLine(); // Limpiado de Buffer
            switch (option) {
                case 1:
                    myTaskManager.showTasks();
                    System.out.print(AZUL + "\nPulsa una tecla para volver al menu..." + RESET);
                    String next = myScanner.nextLine();
                    break;
                case 2:
                    System.out.print("[+] Descripcion de la tarea: ");
                    String taskDescription = myScanner.nextLine();
                    myTaskManager.addTask(taskDescription);
                    System.out.print(AMARILLO + "\n[+]" + VERDE + "Tarea Añadida\n" + RESET);
                    System.out.print(AZUL + "\nPulsa una tecla para volver al menu..." + RESET);
                    String next2 = myScanner.nextLine();
                    break;
                case 3:
                    System.out.print("[+] Numero de la tarea a completar: ");
                    int completedTaskIndex = myScanner.nextInt();
                    myScanner.nextLine();
                    myTaskManager.markTaskAsCompleted(completedTaskIndex - 1);
                    System.out.print(AMARILLO + "\n[+]" + VERDE + "Tarea Completada\n" + RESET);
                    System.out.print(AZUL + "\nPulsa una tecla para volver al menu..." + RESET);
                    String next3 = myScanner.nextLine();
                    break;
                case 4:
                    System.out.print("[+] Numero de la tarea a borrar: ");
                    int deletedTaskIndex = myScanner.nextInt();
                    myScanner.nextLine();
                    myTaskManager.removeTask(deletedTaskIndex - 1);
                    System.out.print(AMARILLO + "\n[+]" + VERDE + "Tarea Eliminada\n" + RESET);
                    System.out.print(AZUL + "\nPulsa una tecla para volver al menu..." + RESET);
                    String next4 = myScanner.nextLine();
                    break;
                case 5:
                    System.out.print(ROJO + "\n[+] Saliendo...\n" + RESET);
                    System.exit(0);
                default:
                    System.out.print(ROJO + "[?] Error. Opción no valida." + RESET);
            }
        }
    }
}