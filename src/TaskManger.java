public class TaskManger {

    Node<TaskModel> head;
    Node<TaskModel> tail;
    int count;

    public void TaskManager() {
        head = null;
        tail = null;
        count = 0;
    }

    public void addTask(TaskModel task) {
        Node<TaskModel> newNode = new Node<>(task);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
    }


    public void printTasks() {
        Node<TaskModel> current = head;
        while (current != null) {
            System.out.println("Title: " + current.value.title);
            System.out.println("Date: " + current.value.date);
            System.out.println("Level: " + current.value.level);
            System.out.println("Status: " + current.value.status);
            System.out.println("------------------------");
            current = current.next;
        }
    }


}
