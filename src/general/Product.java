package general;

import files.FileFunctions;
import java.io.*;
import java.util.ArrayList;

public class Product implements Serializable, FileFunctions, Comparable<Product>
{
    private int id;
    private String name;
    private float price; 
    private String state;
    private int quantity;
    private String stock;
    private ArrayList<Product> productList = new ArrayList<Product>();

    public Product(int id, String name, float price, String state, int quantity, String stock) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.state = state;
        this.quantity = quantity;
        this.stock = stock;
    }

    public Product() 
    {
        
    }
    
    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public float getPrice() 
    {
        return price;
    }

    public String getState() 
    {
        return state;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public String getStock() 
    {
        if(quantity>=1)
        {
            stock = "Si";
        }
        else
        {
            stock = "No";
        }
        
        return stock;
    }

    public ArrayList<Product> getProductList() 
    {
        return productList;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPrice(float price) 
    {
        price = Math.round(price*100)/100f;
        this.price = price;
    }
    
    public void setState(String state) 
    {
        this.state = state;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public void setStock(int quantity) 
    {
        if(quantity>=1)
        {
            stock = "Si";
        }
        else
        {
            stock = "No";
        }
    }

    public void setProductList(ArrayList<Product> productList) 
    {
        this.productList = productList;
    }
    
    /**
     * This method add a product in the ArrayList of Products
     * @param product the product to add to the ArrayList of Products 
     */
    public void addToProductList (Product product)
    {    
        productList.add(product); 
    }
    
    public int searchProduct (int id)
    {
        int index = -1;
        int i=0;
        int dimension=productList.size();
        
        if(!productList.isEmpty())
        {
            while(i<dimension && index==-1)
            {
                if(productList.get(i).getId()==id)
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
     * This method return the position of the ArrayList of Products
     * @param id the id of the product to delete of the ArrayList of Products
     * @return the position of the ArrayList of Products 
     */
    public int deleteProduct (int id)
    {
        int i=id;
        
        if(i != -1)
        {
            productList.remove(i);
        }
            
        return i;
    }
    
    /**
     * This method replace a product in the ArrayList of Products in a specified position
     * @param product the product to replace
     * @param i the index of the ArrayList of Products to set the product to replace
     */
    public void replaceProduct (Product product, int i)
    {
        productList.set(i, product);
    }
    
    public boolean nameStartsIn (String start)
    {
        boolean flag=true;
        
        if(start.isEmpty() || start.length() > name.length())
        {
            flag = false;
        }
        
        for(int i=0; i<start.length(); ++i)
        {
            if(start.charAt(i) != name.charAt(i))
            {
                flag = false;
            }
        }
        
        return flag;
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

            writer.writeObject(productList);

            output.close();
            writer.close();    
        }
        catch(Exception e)
        {
            System.out.println("Error dentro de writeFile");   
        } 
    }
    
    @Override
    public ArrayList<Product> readFile(String fileName) 
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

                productList= (ArrayList<Product>)reader.readObject();    
            }
            input.close();
            reader.close();    
        }
        catch(Exception e)
        {
            System.out.println("Error dentro de readFile");        
        } 
        
        return productList;
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
    public String toString() 
    {
        return " id=" + id + ", name=" + name + ", price=" + price + ", state=" + state + 
               ", quantity=" + quantity + ", stock=" + stock + ", productList={" + productList + "}";
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        
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
        
        final Product other = (Product) obj;
        
        if (this.id != other.id) 
        {
            return false;
        }
        
        return true;
    } 

    @Override
    public int compareTo (Product p)
    {
        if(p.getId()<id)
        {
            return -1;
        }
        else if(p.getId()<=id)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}