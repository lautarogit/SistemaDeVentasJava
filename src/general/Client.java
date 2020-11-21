package general;

import files.FileFunctions;
import java.io.*;
import java.util.ArrayList;

public class Client extends Person implements Serializable, FileFunctions, Comparable<Person>
{
    private int id;
    private ArrayList<Client> clientList = new ArrayList<Client>();
    
    public Client() 
    {
        super();
    }

    public int getId() 
    {
        return id;
    }

    public ArrayList<Client> getClientList() 
    {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) 
    {
        this.clientList = clientList;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    } 
    
    public void addToClientList (Client client)
    {    
        clientList.add(client); 
    }
    
    public int searchClient (int id)
    {
        int index = -1;
        int i=0;
        int dimension=clientList.size();
        
        if(!clientList.isEmpty())
        {
            while(i<dimension && index==-1)
            {
                if(clientList.get(i).getId()==id)
                {
                    index=i;
                } 
                else
                {
                    i++; 
                }
            }  
        }
        
        return index;
    }
    
    /**
     * This method return the position of the ArrayList of Clients
     * @param id the id of the client to delete of the ArrayList of Clients
     * @return the position of the ArrayList of Clients 
     */
    public int deleteClient (int id)
    {
        int i=id;
        
        if(i != -1)
        {
            clientList.remove(i);
        }
            
        return i;
    }
    
    /**
     * This method replace a client in the ArrayList of Clients in a specified position
     * @param client the client to replace
     * @param i the index of the ArrayList of Clients to set the client to replace
     */
    public void replaceClient (Client client, int i)
    {
        clientList.set(i, client);
    }

    @Override
    public void writeFile(String fileName) 
    {
        File file = new File(fileName);
        file.delete();
        FileOutputStream output=null;
        ObjectOutputStream writer=null;
        
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            
            output = new FileOutputStream(file, true);
            writer = new ObjectOutputStream(output);

            writer.writeObject(clientList);

            output.close();
            writer.close();    
        }
        catch(Exception e)
        {
            System.out.println("Error dentro de writeFile");   
        } 
    }
    
    @Override
    public ArrayList<Client> readFile(String fileName) 
    {  
        File file = new File(fileName);
        FileInputStream input=null;
        ObjectInputStream reader=null;
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            else
            {
                input = new FileInputStream(file);
                reader = new ObjectInputStream(input);

                clientList = (ArrayList<Client>)reader.readObject();    
            }
            input.close();
            reader.close();    
        }
        catch(Exception e)
        {
            System.out.println("Error dentro de readFile");        
        } 
        
        return clientList;
    }
    
    @Override
    public boolean isFileExists (String fileName)
    {
        File file = new File(fileName);
        
        if(file.exists())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public void deleteFile(String fileName) 
    {
        File file = new File(fileName); 
        file.delete();
    }
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 29 * hash + this.id;
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        
        if (obj == null) 
        {
            return false;
        }
        
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        
        final Client other = (Client) obj;
        
        if (this.id != other.id) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Client{" + "id=" + id + ", clientList={" + clientList + "}";
    }

    @Override
    public int compareTo (Person p)
    {
        if(p.getDni()<p.getDni())
        {
            return -1;
        }
        else if(p.getDni()<=p.getDni())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
