package productarraylistsorts;

import general.Product;
import java.util.Comparator;

public class SortProductQuantityLowToHigh implements Comparator<Product>
{
    @Override
    public int compare(Product p_1, Product p_2)
    {
        if(p_1.getQuantity()<p_2.getQuantity())
        {
            return -1;
        }
        else if(p_1.getQuantity()<=p_2.getQuantity())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
