package productarraylistsorts;

import general.Product;
import java.util.Comparator;

public class SortProductIdHighToLow implements Comparator<Product>
{
    @Override
    public int compare(Product p_1, Product p_2)
    {
        if(p_1.getId()>p_2.getId())
        {
            return -1;
        }
        else if(p_1.getId()>=p_2.getId())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
