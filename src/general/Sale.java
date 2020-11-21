package general;

import files.FileFunctions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Sale implements Serializable, FileFunctions
{
    private int id;
    private int clientId; 
    private int productId; 
    private int quantity; 
    private float price; 
    private String date; 
    private String paid; 
    private String Description;
    private float total; 
    private ArrayList<Sale> saleList = new ArrayList<Sale>();

    public Sale() 
    {
        
    }

    public int getId() 
    {
        return id;
    }

    public int getClientId() 
    {
        return clientId;
    }

    public int getProductId() 
    {
        return productId;
    }

    public int getQuantity() 
    {
        return quantity;
    }
    public String getDescription ()
    {
        return Description;
    }

    public float getPrice() 
    {
        return price;
    }

    public String getDate() 
    {
        return date;
    }

    public String getPaid() 
    {
        return paid;
    }

    public float getTotal() 
    {
        return total;
    }

    public ArrayList<Sale> getSaleList() 
    {
        return saleList;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setClientId(int clientId) 
    {
        this.clientId = clientId;
    }

    public void setProductId(int productId) 
    {
        this.productId = productId;
    }
    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public void setPrice(float price) 
    {
        this.price = price;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public void setPaid(String paid) 
    {
        this.paid = paid;
    }

    public void setTotal(float total) 
    {
        this.total = total;
    }

    public void setSaleList(ArrayList<Sale> saleList) 
    {
        this.saleList = saleList;
    }
    
    @Override
    public void writeFile (String fileName)
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

            writer.writeObject(saleList);

            output.close();
            writer.close();    
        }
        catch(Exception e)
        {
            System.out.println("Error dentro de writeFile");   
        } 
    }
    
    @Override
    public ArrayList<Sale> readFile(String fileName) 
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

                saleList = (ArrayList<Sale>)reader.readObject();    
            }
            input.close();
            reader.close();    
        }
        catch(Exception e)
        {
            System.out.println("Error dentro de readFile");        
        } 
        
        return saleList;
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
    
    public void AddToSaleList(Sale sale)
    {
        saleList.add(sale); 
    }

    public int searchSale (int id)
    {
        int index = -1;
        int i=0;
        int dimension=saleList.size();
        
        if(!saleList.isEmpty())
        {
            while(i<dimension && index==-1)
            {
                if(saleList.get(i).getId()==id)
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
    
    public int deleteSale (int id)
    {
        int i=id;
        
        if(i != -1)
        {
            saleList.remove(i);
        }
            
        return i;
    }
    
    public void replaceSale (Sale sale, int i)
    {
         saleList.set(i, sale);
    }
    
}