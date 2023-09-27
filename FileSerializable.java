
package OOP1.JavaOOP1;

import java.io.IOException;

public interface FileSerializable {
    void saveToFile(String filePath) throws IOException;
    void loadFromFile(String filePath) throws IOException;
}
