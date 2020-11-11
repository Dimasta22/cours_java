package laba4;

import com.google.gson.Gson;
import laba3.UniversityGenerate;
import java.util.Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
    Gson gson;

    public Manager(Gson gson) {
        this.gson = gson;
    }

    public void writeToFile(UniversityGenerate universityGenerate) throws IOException {
        String univerJson = gson.toJson(universityGenerate);
        FileWriter fileWriter = new FileWriter("univer.json");
        fileWriter.write(univerJson);
        fileWriter.flush();
        fileWriter.close();
    }

    public UniversityGenerate  readFromFile(UniversityGenerate universityGenerate)throws IOException{
        FileReader fileReader = new FileReader("univer.json");
        String univerJson = new Scanner(fileReader).next();
        fileReader.close();

        return gson.fromJson(univerJson,UniversityGenerate.class);
    }

}
