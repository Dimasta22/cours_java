package laba4;

import com.google.gson.Gson;
import laba3.UniversityGenerate;
import laba4.Manager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        UniversityGenerate universityGenerate = new UniversityGenerate();
        Manager manager = new Manager(new Gson());
        manager.writeToFile(universityGenerate);
    }
}
