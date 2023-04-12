import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    /* Aplicación de tareas */

    Task taskOne = null, taskTwo = null, taskThree = null;
    int option = 0, totalTask = 1, select;
    String name = "", formattedDate;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate date = null;
    boolean validDate = false;

    while (option != 4) {

      System.out.println(".=============================.");
      System.out.println("|        MENÚ DE TAREAS       |");
      System.out.println("*=============================*");
      System.out.println("   1. Crear tarea");
      System.out.println("   2. Mostrar tarea");
      System.out.println("   3. Marcar como completada");
      System.out.println("   4. Salir");
      System.out.println("*=============================*");
      System.out.print("Ingrese la opción deseada: ");

      option = scanner.nextInt();
      scanner.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();

      switch (option) {
        case 1: {
          if (totalTask < 4) {
            System.out.println("   Selecciono crear tarea");
            System.out.println("===============================");
            name = "";
            while (name.isEmpty()) {
              System.out.print("Ingrese nombre para la tarea: ");
              name = scanner.nextLine();
              if (!name.matches("^[a-zA-Z\\s]{1,50}$")) {
                System.out.println(
                    "El nombre de la tarea debe contener solo letras y espacios, con una longitud máxima de 50 caracteres.");
                name = "";
              }
            }
            System.out.print("Ingrese descripción de la tarea: ");
            String description = scanner.nextLine();
            validDate = false;
            while (!validDate) {
              try {
                System.out.print("Ingrese fecha de inicio (formato: dd-MM-yyyy): ");
                String dateString = scanner.nextLine();
                date = LocalDate.parse(dateString, dateFormatter);

                if (date.isEqual(LocalDate.now()) || date.isAfter(LocalDate.now())) {
                  validDate = true;
                } else {
                  System.out.println("La fecha ingresada debe ser mayor o igual a la fecha actual.");
                }
              } catch (DateTimeParseException e) {
                System.out.println("La fecha ingresada no tiene el formato correcto.");
              }
            }
            if (totalTask == 1) {
              taskOne = new Task(name, description, date);
              System.out.println("¡Tarea creada exitosamente!");
              System.out.println("Presione enter para continuar...");
              scanner.nextLine();
              totalTask++;
              System.out.print("\033[H\033[2J");
              System.out.flush();
              break;
            } else if (totalTask == 2) {
              taskTwo = new Task(name, description, date);
              System.out.println("¡Tarea creada exitosamente!");
              System.out.println("Presione enter para continuar...");
              scanner.nextLine();
              totalTask++;
              System.out.print("\033[H\033[2J");
              System.out.flush();
              break;
            } else if (totalTask == 3) {
              taskThree = new Task(name, description, date);
              System.out.println("¡Tarea creada exitosamente!");
              System.out.println("Presione enter para continuar...");
              scanner.nextLine();
              totalTask++;
              System.out.print("\033[H\033[2J");
              System.out.flush();
              break;
            }

          } else {
            System.out.println("¡Alcanso el máximo de tareas a ingresar! ");
            System.out.println("Presione enter para continuar...");
            scanner.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

          }
          break;
        }
        case 2: {
          System.out.println("   Selecciono mostar tareas");
          System.out.println("===============================");
          if (totalTask == 1) {
            System.out.println("¡No hay tareas para mostrar!");
          } else {
            if (totalTask == 2) {
              System.out.println("_______________________");
              System.out.println("TAREA: " + taskOne.getId());
              System.out.println("Nombre: " + taskOne.name);
              System.out.println("Completada: " + taskOne.getCompleted());
              formattedDate = taskOne.date.format(dateFormatter);
              System.out.println("Fecha inicio: " + formattedDate);
              System.out.println("_______________________");

            }
            if (totalTask == 3) {
              System.out.println("_______________________");
              System.out.println("TAREA: " + taskOne.getId());
              System.out.println("Nombre: " + taskOne.name);
              System.out.println("Completada: " + taskOne.getCompleted());
              formattedDate = taskOne.date.format(dateFormatter);
              System.out.println("Fecha inicio: " + formattedDate);
              System.out.println("_______________________");
              System.out.println("_______________________");
              System.out.println("TAREA: " + taskTwo.getId());
              System.out.println("Nombre: " + taskTwo.name);
              System.out.println("Completada: " + taskTwo.getCompleted());
              formattedDate = taskTwo.date.format(dateFormatter);
              System.out.println("Fecha inicio: " + formattedDate);
              System.out.println("_______________________");
            }
            if (totalTask == 4) {
              System.out.println("_______________________");
              System.out.println("TAREA: " + taskOne.getId());
              System.out.println("Nombre: " + taskOne.name);
              System.out.println("Completada: " + taskOne.getCompleted());
              formattedDate = taskOne.date.format(dateFormatter);
              System.out.println("Fecha inicio: " + formattedDate);
              System.out.println("_______________________");
              System.out.println("_______________________");
              System.out.println("TAREA: " + taskTwo.getId());
              System.out.println("Nombre: " + taskTwo.name);
              System.out.println("Completada: " + taskTwo.getCompleted());
              formattedDate = taskTwo.date.format(dateFormatter);
              System.out.println("Fecha inicio: " + formattedDate);
              System.out.println("_______________________");
              System.out.println("_______________________");
              System.out.println("TAREA: " + taskThree.getId());
              System.out.println("Nombre: " + taskThree.name);
              System.out.println("Completada: " + taskThree.getCompleted());
              formattedDate = taskThree.date.format(dateFormatter);
              System.out.println("Fecha inicio: " + formattedDate);
              System.out.println("_______________________");
            }
          }
          System.out.println("Presione enter para continuar...");
          scanner.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.flush();
          break;
        }
        case 3: {
          System.out.println("   Selecciono marcar como completada");
          System.out.println("======================================");
          if (totalTask > 1) {
            System.out.println("¿Qué tarea decea completar?");
            System.out.println("(1) (2) (3)");
            System.out.print("Ingrese número de la tarea: ");
            select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1 && taskOne != null) {
              taskOne.completed = true;
              System.out.println("¡La tarea 1 fue marcada como completada!");
            } else if (select == 2 && taskTwo != null) {
              taskTwo.completed = true;
              System.out.println("¡La tarea 2 fue marcada como completada!");
            } else if (select == 3 && taskThree != null) {
              taskThree.completed = true;
              System.out.println("¡La tarea 3 fue marcada como completada!");
            }
          } else {
            System.out.println("¡No hay tareas para completar!");
          }

          System.out.println("Presione enter para continuar...");
          scanner.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.flush();
          break;
        }
      }

    }

    System.out.println("¡Hasta pronto!");

  }
}