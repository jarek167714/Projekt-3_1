import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    boolean shouldContinue = true;
    while(shouldContinue){
      System.out.println("Aby dodać studenta wybierz 1");
      System.out.println("Aby wyjść z programu wyberz 0");
      System.out.println("Aby wypisać wszystkich studentów wciśnij 2")
      int userChoice = scanner.nextInt();
      switch(userChoice){
        case 1:
          case1();
          System.out.println("Dopisano studenta, powrót do menu\n");
          break;
        case 0:
          System.out.println("Do zobaczenia");
          shouldContinue = false;
          break;
           case 2:
          {
          try
          {
          Service1 = new Service1();
          var students = s.getStudents();
          for(Student current : students)
          {
            System.out.println(current.ToString());
          }
         break;
        }  
         }
      }
    }
    }
    
    private static void case1() throws IOException 
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj imię: ");
      String imie = scanner.nextLine();
      System.out.println("Podaj wiek: ");
      int wiek = scanner.nextInt();
      System.out.println("Podaj nazwisko: ");
      String nazwisko = scanner.nextLine();
      
      Service1 s = new Service1();
      s.addStudent(new Student(imie, wiek, nazwisko));
      
  }
 
}
}

