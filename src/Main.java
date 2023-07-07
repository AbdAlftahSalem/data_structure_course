public class Main {
    public static void main(String[] args) {

        TaskManger taskManager = new TaskManger();

        // Adding tasks
        TaskModel task1 = new TaskModel("Task 1", "2023-07-10", 2, false);
        taskManager.addTask(task1);

        TaskModel task2 = new TaskModel("Task 2", "2023-07-08", 1, false);
        taskManager.addTask(task2);

        TaskModel task3 = new TaskModel("Task 3", "2023-07-09", 3, false);
        taskManager.addTask(task3);

        // Print tasks
        System.out.println("Initial Task List:");
        taskManager.printTasks();
        System.out.println("------------------------");

        // Update task status
        taskManager.updateTaskStatus("Task 1", true);

        // Modify a task
        taskManager.modifyTask("Task 2", "Update task 2", "2023-07-12", 2);

        // Delete a task
        taskManager.deleteTask("Task 1");

        // Sort tasks by due date
        taskManager.sortByDueDate();

        // Print tasks after modifications
        System.out.println("Modified Task List:");
        taskManager.printTasks();
        System.out.println("------------------------");


    }
}