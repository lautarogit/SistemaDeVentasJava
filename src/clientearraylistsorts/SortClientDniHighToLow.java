package clientearraylistsorts;

import general.Client;
import java.util.Comparator;

public class SortClientDniHighToLow implements Comparator<Client>
{
    @Override
    public int compare(Client p_1, Client p_2)
    {
        if(p_1.getDni()>p_2.getDni())
        {
            return -1;
        }
        else if(p_1.getDni()>=p_2.getDni())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
