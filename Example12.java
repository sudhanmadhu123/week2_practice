import java.util.Scanner;
class Example12 {
  public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int gs = 0, basicsalary= 0, hra = 0, da = 0;
    System.out.println("enter the basic salary : ");
    basicsalary = s.nextInt();
    if (basicsalary <= 10000) {
      hra = (67 * basicsalary) / 100;
      da = (78 * basicsalary) / 100;
      gs = hra + basicsalary + da;
    } else if (basicsalary <= 20000) {
      hra = (70 * basicsalary) / 100;
      da = (80 * basicsalary) / 100;
      gs = hra + basicsalary + da;
    } else {
      hra = (73 * basicsalary) / 100;
      da = (87 * basicsalary) / 100;
      gs = hra + basicsalary + da;
    }
    System.out.println("Gross salary is " + gs);
  }
}
  