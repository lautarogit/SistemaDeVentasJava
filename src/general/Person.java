package general;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person>
{
    private String name;
    private String lastName;
    private String residence;
    private String nationality;
    private int dni;
    private String dateOfBirth;
    
    public Person(String name, String lastName, String residence, String nationality, int dni, String dateOfBirth) 
    {
        this.name = name;
        this.lastName = lastName;
        this.residence = residence;
        this.nationality = nationality;
        this.dni = dni;
        this.dateOfBirth = dateOfBirth;
    }
    
    public Person ()
    {
        
    }

    public String getName() 
    {
        return name;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getResidence() 
    {
        return residence;
    }

    public String getNationality() 
    {
        return nationality;
    }

    public int getDni() 
    {
        return dni;
    }

    public String getDateOfBirth() 
    {
        return dateOfBirth;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setResidence(String residence) 
    {
        this.residence = residence;
    }

    public void setNationality(String nationality) 
    {
        this.nationality = nationality;
    }

    public void setDni(int dni) 
    {
        this.dni = dni;
    }

    public void setDateOfBirth(String dateOfBirth) 
    {
        this.dateOfBirth = dateOfBirth;
    }  

    @Override
    public int compareTo (Person p)
    {
        if(p.getDni()<dni)
        {
            return -1;
        }
        else if(p.getDni()<=dni)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
    
    @Override
    public String toString() 
    {
        return "Person: " + "name=" + name + ", lastName=" + lastName + ", residence=" + residence + 
               ", nationality=" + nationality + ", dni=" + dni + ", dateOfBirth=" + dateOfBirth;
    }
}
