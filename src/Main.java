public class Main {
    public static void main(String[] args) {

        TaskManger taskManager = new TaskManger();

        TaskModel task1 = new TaskModel("Task 1", "2023-07-07", 1, false);
        TaskModel task2 = new TaskModel("Task 2", "2023-07-08", 2, true);
        TaskModel task3 = new TaskModel("Task 3", "2023-07-09", 3, true);

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        taskManager.printTasks();


    }
}