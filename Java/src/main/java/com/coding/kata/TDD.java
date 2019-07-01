package com.coding.kata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TDD {

    public List<String> getDataFromFile(String fileName) throws IOException {
        List<String> data = new ArrayList<>();
        String line = null;

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) {
            data.add(line);
        }
        bufferedReader.close();

        return data;
    }



}
