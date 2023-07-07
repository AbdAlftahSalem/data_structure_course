public class Main {
    public static void main(String[] args) {

        TaskManger taskManager = new TaskManger();

        // Adding tasks
        TaskModel task1 = new TaskModel("Complete project report", "2023-07-10", 2, false);
        taskManager.addTask(task1);

        TaskModel task2 = new TaskModel("Schedule meeting with team", "2023-07-08", 1, false);
        taskManager.addTask(task2);

        TaskModel task3 = new TaskModel("Buy groceries", "2023-07-09", 3, false);
        taskManager.addTask(task3);

        // Print tasks
        System.out.println("Initial Task List:");
        taskManager.printTasks();
        System.out.println("------------------------");

        // Update task status
        taskManager.updateTaskStatus("Complete project report", true);

        // Modify a task
        taskManager.modifyTask("Schedule meeting with team", "Schedule meeting with clients", "2023-07-12", 2);

        // Delete a task
        taskManager.deleteTask("Buy groceries");

        // Print tasks after modifications
        System.out.println("Modified Task List:");
        taskManager.printTasks();
        System.out.println("------------------------");


    }
}