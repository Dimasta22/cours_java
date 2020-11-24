package laba4;

import com.google.gson.Gson;
import laba3.model.University;
import laba4.Manager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        University university = new University();
        Manager manager = new Manager();
        manager.writeToFile(university);
    }
}
