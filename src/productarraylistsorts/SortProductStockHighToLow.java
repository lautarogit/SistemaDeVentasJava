package productarraylistsorts;

import general.Product;
import java.util.Comparator;

public class SortProductStockHighToLow implements Comparator<Product>
{
    @Override
    public int compare(Product p_1, Product p_2)
    {
        if(p_1.getStock().compareTo(p_2.getStock())>0)
        {
            return -1;
        }
        else if(p_1.getStock().compareTo(p_2.getStock())>=0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
