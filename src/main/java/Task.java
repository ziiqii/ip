public class Task {
    private String description;
    private boolean isDone = false;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    // mark or unmark, can enum later
    public void setDone(String mark) {
        if (mark.equals("mark")) {
            this.isDone = true;
            System.out.println("  Nice! I've marked this task as done:");
            System.out.println("    " + this.getStatusIcon());
        } else {
            this.isDone = false;
            System.out.println("  OK, I've marked this task as not done yet:");
            System.out.println("    " + this.getStatusIcon());
        }
    }

    public String getStatusIcon() {
        return (isDone ? "[X] " : "[ ] ") + this; // mark done task with X
    }

    @Override
    public String toString() {
        return this.description;
    }
}