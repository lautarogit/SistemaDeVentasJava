package clientearraylistsorts;

import general.Client;
import java.util.Comparator;

public class SortClientLastNameLowToHigh implements Comparator<Client>
{
    @Override
    public int compare(Client p_1, Client p_2)
    {
        if(p_1.getLastName().compareTo(p_2.getLastName())<0)
        {
            return -1;
        }
        else if(p_1.getLastName().compareTo(p_2.getLastName())<=0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
