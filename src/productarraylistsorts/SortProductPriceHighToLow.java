package productarraylistsorts;

import general.Product;
import java.util.Comparator;

public class SortProductPriceHighToLow implements Comparator<Product>
{
    @Override
    public int compare(Product p_1, Product p_2)
    {
        if(p_1.getPrice()>p_2.getPrice())
        {
            return -1;
        }
        else if(p_1.getPrice()>=p_2.getPrice())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
