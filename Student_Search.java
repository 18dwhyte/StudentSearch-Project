
import java.util.Scanner;
import java.util.*;
/**
 * This program searches for Students information using a Binary Tree
 *
 * @author Dwayne Whyte
 * @version December 1, 2020
 */
public class Student_Search
{ 
    /**
     * This is the main method for the program
     */
    public static void main()
    { 
        boolean isFinished = false;
        BinarySearchTree studentSearch = new BinarySearchTree();
        Student student = new Student();
        studentSearch.add(new Student(984, "Joe Shmoe", "DPR"));
        studentSearch.add(new Student(345, "Bill Nye", "SCI"));
        studentSearch.add(new Student(637, "Judy Reef", "DPR"));
        studentSearch.add(new Student(937, "Connie Soleman", "ENG"));
        studentSearch.add(new Student(560, "Ray Berry", "NET"));
        studentSearch.print();
        ListMenu menu = new ListMenu();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase();
        input.charAt(0);
        String name,major;
        int id;
        while(!isFinished)
        { 
            try{
                switch(input)
                {
                    case "A":
                    System.out.println("Add a Student to the tree");
                    System.out.println("Enter Student ID:");
                    id = in.nextInt();

                    while (studentSearch.find(new Student(id)) != null || id <= 0)
                    {
                        if ((studentSearch.find(new Student(id)) != null))
                        {
                            System.out.println("Student ID is already used");
                        }

                        if (id <= 0)
                        {
                            System.out.println("Student ID must be greater than zero(0)");
                        }
                        System.out.println("Enter Student ID:");
                        id = in.nextInt();
                    }
                    System.out.println("Enter Student Name");
                    in.nextLine();
                    name = in.nextLine().trim();

                    while(name.isEmpty() == true)
                    {
                        System.out.println("Name must contain text");
                        System.out.println("Enter Student Name");
                        name = in.nextLine();
                    }

                    System.out.println("Enter Student Major");
                    major = in.next().toUpperCase().trim();

                    while(major.length() < 3)
                    {
                        System.out.println("Major can not be less than 3 characters");
                        System.out.println("Enter Student Major");
                        major = in.next().toUpperCase().trim();
                    }

                    major = major.substring(0,3);
                    studentSearch.add(new Student(id, name, major));
                    new ListMenu();
                    menu.clearScreen();
                    studentSearch.print();
                    new ListMenu();
                    in.nextLine();
                    input = in.nextLine().toUpperCase();
                    break;

                    case "L":
                    System.out.println("List of Students in a major");
                    System.out.println("Enter the major to list:");
                    major = in.next().toUpperCase();
                    ArrayList<Object> list = studentSearch.getList();
                    for (Object obj : list)
                    {
                        Student st = (Student) obj;
                        if (st.getMajor().equals(major))
                        {
                            System.out.println(st.toString());
                        } 
                    }
                    menu.pause();
                    menu.clearScreen();
                    studentSearch.print();
                    new ListMenu();
                    in.nextLine();
                    input = in.nextLine().toUpperCase();
                    break;

                    case "R":
                    System.out.println("Remove a Student from the list");
                    System.out.println("Enter Student ID");
                    id = in.nextInt();
                    if (studentSearch.find(new Student(id)) == null)
                    {
                        System.out.println("You must use an ID from the list above!"); 
                        menu.pause();
                    } 
                    else
                    {
                        studentSearch.remove(new Student(id));
                    }
                    menu.clearScreen();
                    studentSearch.print();
                    new ListMenu();
                    in.nextLine();
                    input = in.nextLine().toUpperCase();
                    break;

                    case "D":
                    System.out.println("Display a Student in the list");
                    System.out.println("Enter Student ID:");
                    id = in.nextInt();
                    if(studentSearch.find(new Student(id)) == null)
                    {
                        System.out.println("Student " + id + " is not in the list.");
                    } 
                    else
                    {
                        System.out.println(studentSearch.find(new Student(id)));
                    }
                    menu.pause();
                    menu.clearScreen();
                    studentSearch.print();
                    in.nextLine();
                    new ListMenu();
                    input = in.nextLine().toUpperCase();
                    break;

                    case "Q":
                    menu.clearScreen();
                    studentSearch.print();
                    menu.pause();
                    isFinished = true;
                    break;

                    default: 
                    System.out.println("Invalid Input. Enter a new input");
                    input = in.next().toUpperCase();
                    break;
                }
            }

            catch(Exception e)
            {
                System.out.println("Error Occured.");
                break;
            }
        }
    }
}
