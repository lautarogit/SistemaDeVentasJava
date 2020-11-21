package clientearraylistsorts;

import general.Client;
import java.util.Comparator;

public class SortClientIdHighToLow implements Comparator<Client>
{
    @Override
    public int compare(Client p_1, Client p_2)
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
