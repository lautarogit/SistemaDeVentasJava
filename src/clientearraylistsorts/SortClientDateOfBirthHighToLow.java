package clientearraylistsorts;

import general.Client;
import java.util.Comparator;

public class SortClientDateOfBirthHighToLow implements Comparator<Client>
{
    @Override
    public int compare(Client p_1, Client p_2)
    {
        if(p_1.getDateOfBirth().compareTo(p_2.getDateOfBirth())>0)
        {
            return -1;
        }
        else if(p_1.getDateOfBirth().compareTo(p_2.getDateOfBirth())>=0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } 
}
