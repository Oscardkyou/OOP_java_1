
package OOP1.JavaOOP1.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class FileHandler implements FileSerializable {
    private ArrayList<Node> tree;

    public FileHandler(ArrayList<Node> tree) {
        this.tree = tree;
    }

    @Override
    public void saveToFile(String filePath) throws IOException {
        Gson gson = new Gson();
        String jsonData = gson.toJson(tree);
        Files.write(Paths.get(filePath), jsonData.getBytes());
    }

    @Override
    public void loadFromFile(String filePath) throws IOException {
        Gson gson = new Gson();
        String jsonData = new String(Files.readAllBytes(Paths.get(filePath)));
        Type listType = new TypeToken<ArrayList<Node>>(){}.getType();
        tree = gson.fromJson(jsonData, listType);
    }

    public ArrayList<Node> getTree() {
        return tree;
    }
}
