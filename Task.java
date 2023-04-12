import java.time.LocalDate; /*Clase para manejo de fechas*/

/*Objeto tarea*/
public class Task {

  /*public static final int SIZE = 1024;*/
  public static int count;
  private int id; /*Identificador único*/
  public String name; /*Nombre de la tarea*/
  public String description; /*Descripción de la tarea*/
  public boolean completed; /*Indica si la tarea esta completada o no*/
  public LocalDate date; /*Fecha en la que se creo la tarea*/
  

  /*Constructor*/
  public Task(String name, String description, LocalDate date ) {
    this.id = ++count;
    this.name = name;
    this.description = description;
    this.date = date;
    this.completed = false;
  }
  /*Métodos*/
  
  public void markCompleted(){
    completed = true;
  }
  public int getId() {
    return id;
  }

  public boolean getCompleted() {
    return completed;
  }
  
  public void setCompletedTrue() {
    this.completed = true;
  }

  public LocalDate getDate() {
    return date;
  }
}