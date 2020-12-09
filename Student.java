
/**
 * This class represents a Student Object
 *
 * @author Dwayne Whyte
 * @version December 1, 2020
 */ 
import java.lang.Exception; 

public class Student implements Comparable
{
    /** The Students identification number */
    private int id;
    /** The Student's identification number */
    private String name;
    /** The Student's identification number */
    public String major;
    /**
     * Constructor for objects of class Student
     */
    public Student ()
    {
        int id = 0;
        String name = "";
        String major = "";
    }
    
    /**
     * Parameter constructor for objects of class Student     
     * @param id - the Student's Identification number
     * @param name - the Student's name
     * @param major - the Student's major
     */
    public Student(int id, String name, String major)
    {
      setId(id);
      setName(name);
      setMajor(major);
    }
    
    /**
     * Special parameter constructor for ID of class Student.
     * Allows the tree to search by id
     * @param id - the Student's identification number
     */
    public Student(int id)
    {
      this.id = id;
      name = "";
      major = "";
    }
    
    /**
     * This method sets the Student identification number
     * @param id - the Student's identification number
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * This method returns the Student identification number     
     * @return id - the Student's identification number
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * This method sets the Student name
     * @param name - the Student's name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
      * This method returns the Student name
     * @return name - the Student's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This method sets the Student major
     * @param major - the Student's major
     */
    public void setMajor(String major)
    {
        this.major = major;
    }
    
    /**
     * This method returns the Student's major     
     * @return major - the Student's major  
     */
    public String getMajor()
    {
        return major;
    } 
    
    /**
     * This method returns the Student identification number     
     * @return output - the Student's id,name, and major
     */ 
    public String toString()
    {
        String output = String.format("%-6d%-15s%.3s\n",id,name,major);
        return output;
    }
    
    /**This method overrides the toSting() method of Object
     * This method inputs data elements of the Student and outputs it in String form 
     * @param otherObject - the Student's data
     * @return output - a string containing the Student's information 
     */
    @Override
    public int compareTo(Object otherObject)
    {
      Student other = (Student) otherObject;
      if (id < other.id) 
      { 
          return -1; 
      }

      if (id > other.id) 
      { 
          return 1; 
      }
      return 0;
    }
}
