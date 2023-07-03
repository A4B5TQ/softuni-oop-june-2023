package interfaces.demo;

public interface Printable {

   int MIN = 5;

   default void print() {
      System.out.println("Print from interface");
   }
   static void printOnConsole() {

      System.out.println("Print A: " + MIN);
   }
}
