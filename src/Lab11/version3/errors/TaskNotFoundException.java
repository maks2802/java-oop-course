package Lab11.version3.errors;

public class TaskNotFoundException extends Exception {
  public TaskNotFoundException(String message) {
    super(message);
  }
}