// WAP to check if a string is palindrome or not?
/*public class Practice {

    public static boolean Ispalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return Ispalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "sumit";
        str = str.toLowerCase();
        System.out.println("Is palindrome" + " " + Ispalindrome(str, 0, str.length() - 1));
    }
}*/
// WAP to show the fibonacci sequence in java.
/*public class Practice {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(fibonacci(j - 1) + " ");
            }
            System.out.println();
        }
    }
}*/
// WAP to show the pattern form of factorial.
/*public class Practice {

    public static int factorial(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(factorial(j - 1) + " ");
            }
            System.out.println();
        }
    }
}*/
 /*Create a class called Grader and give it an instance variable
called score, a suitable constructor, and suitable methods. The
letter grade is returned as O/E/A/B/C/F/ by the letterGrade()
method.
Generate a sample class now to test the Grader class by
reading a user-provided score and using it to generate a Grader
object once it has been confirmed that the value is between 0
and 100. To obtain and print the Grade, call the letterGrade()
function at the end.*/
 /*import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        Practice hello = new Practice();
        System.out.println("the grade is :" + hello.letterGrade(score));
    }
}

class Practice {

    int score;

    Practice() {
        this.score = score;
    }

    public static char letterGrade(int score) {
        if (score >= 90) {
            return 'O';
        } else if (score >= 80) {
            return 'E';
        } else if (score >= 70) {
            return 'A';
        } else if (score >= 60) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else if (score >= 80) {
            return 'D';
        }
        return 'F';
    }
}*/
//WAP to do the multithreading 
/*class Main {

    public static void main(String[] args) {
        bhaii p1 = new bhaii();
        chotobhaii p2 = new chotobhaii();
        p1.start();
        p2.start();
    }
}

class bhaii extends Thread {

    public void run() {
        while (true) {
            go();
        }
    }

    public void go() {
        System.out.println("hello");
    }
}

class chotobhaii extends Thread {

    public void run() {
        while (true) {
            jogging();
        }
    }

    public void jogging() {
        System.out.println("hi");
    }
}*/
//WAP to import and format local date and time
/* 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Practice {

    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj);
        DateTimeFormatter n = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String FormattedDate = obj.format(n);
        System.out.println(FormattedDate);
    }
}*/
// WAP to sort the number in ArrayList in java.
/*import java.util.*;
class Main{
    public static void main(String [] args){
        ArrayList<Integer> Num = new ArrayList();
        Num.add(5);
        Num.add(4);
        Num.add(2);
        Collections.sort(Num);
        for (int i : Num){
            System.out.println(i);
        }
    }
}*/
// WAP to sort the number but in reverse number in ArrayList
/*import java.util.ArrayList;

import java.util.Collections;

class Main {

    public static void main(String[] args) {
        ArrayList<Integer> Num = new ArrayList();
        Num.add(5);
        Num.add(4);
        Num.add(2);
        Collections.sort(Num, Collections.reverseOrder());
        for (int i : Num) {
            System.out.println(i);
        }
    }
}
 */
// employee 
/*class Main {

    public static void main(String[] args) {
        FullTimeEmployee obj = new FullTimeEmployee("Sumit", 402, 5000);
        PartTimeEmployee obj2 = new PartTimeEmployee("Soumya", 401, 200, 7);
        System.out.println(obj.calculateSalary(2000));
        System.out.println(obj2.calculateSalary(2000));
    }
}

class Employee {

    String name;
    int employeeid;

    public Employee(String name, int employeeid) {
        this.name = name;
        this.employeeid = employeeid;
    }

    public double calculateSalary() {
        return 0;
    }

    public double calculateSalary(double bonus) {
        return calculateSalary() + bonus;
    }
}

class FullTimeEmployee extends Employee {

    double Monthlysalary;

    public FullTimeEmployee(String name, int employeeid, double Monthlysalary) {
        super(name, employeeid);
        this.Monthlysalary = Monthlysalary;

    }

    public double calculateSalary() {
        return Monthlysalary;
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int employeeid, double hourlyRate, int hoursWorked) {
        super(name, employeeid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public double calculateSalary(double bonus) {
        return calculateSalary() + bonus;
    }
}*/
// interface 

class Practice {

    public static void main(String[] args) {
        Student result = new Student("Sumit", 402, 40, 50);
        double percentage = result.Percent_cal();
        Result resultDisplay = new Result();
        resultDisplay.Per_display(result, percentage);
    }
}

interface Exam {

    double Percent_cal();
}

class Student implements Exam {

    String Name;
    int roll_no;
    int marks1;
    int marks2;

    public Student(String Name, int roll_no, int marks1, int marks2) {
        this.Name = Name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public double Percentage_cal() {
        int totalMarks = marks1 + marks2;
        int maxMarks = 200; // Assuming each subject has a maximum of 100 marks
        double percentage = (double) totalMarks / maxMarks * 100;
        return percentage; // Return calculated percentage
    }
}

class Result {

    public void Per_display(Student student, double percentage) {
        System.out.println("Name :" + student.Name);
        System.out.println("roll :" + student.roll_no);
        System.out.println("marks 1 :" + student.marks1);
        System.out.println("marks 2:" + student.marks2);
        System.out.println("percentage :" + percentage + "%");
    }
}
