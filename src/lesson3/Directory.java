package lesson3;

import java.util.*;

public class Directory {
    public Map<String, String > directory;


    public Directory() {
        directory = new HashMap<String, String>();
    }

    public void add(String secondname, String phone){
        directory.put(secondname,phone);

    }
    public void get(String secondname){
        System.out.println(secondname + " = " + directory.get(secondname));
    }

}
