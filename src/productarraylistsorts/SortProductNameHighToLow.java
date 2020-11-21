package productarraylistsorts;

import general.Product;
import java.util.Comparator;

public class SortProductNameHighToLow implements Comparator<Product>
{
    @Override
    public int compare(Product p_1, Product p_2)
    {
        if(p_1.getName().compareTo(p_2.getName())>0)
        {
            return -1;
        }
        else if(p_1.getName().compareTo(p_2.getName())>=0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
