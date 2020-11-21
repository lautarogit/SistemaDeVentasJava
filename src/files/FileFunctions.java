package files;

import java.io.*;

public interface FileFunctions 
{
    void writeFile(String fileName) throws IOException;
    Object readFile(String fileName) throws IOException;
    boolean isFileExists (String fileName);
    void deleteFile(String fileName);
}
