
/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    //atributo de nombre de la persona
    private String name;
    //atributo de edad de la persona
    private int age;
    //atributo padre
    private Person father;
    //atributo madre
    private Person mother;
    

    /**
     * Constructor de los objetos de la clase person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age; 
        father = null;
        mother = null;
    }
    
    /**
     * 
     */
    public void showData()
    {
    System.out.println("Nombre: " + name);
    System.out.println("Age: " + age);
    }
    
    public void setMother(Person mother)
    {
    this.mother = mother;
    }
    
    public void setFather(Person father)
    {
    this.father = father;
    }
}
