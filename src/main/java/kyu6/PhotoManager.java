package kyu6;

import java.util.ArrayList;
import java.util.List;

public class PhotoManager {

    List<String> names = new ArrayList<>();

    public boolean nameExists(String name){
       return names.contains(name);
    }

}
