public class TaskModel {

    String title, date;
    int level;
    boolean status;

    public TaskModel(String title, String date, int level, boolean status) {
        this.title = title;
        this.date = date;
        this.level = level;
        this.status = status;
    }
}
