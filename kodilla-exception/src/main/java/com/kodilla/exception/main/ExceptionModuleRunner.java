package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;

public class ExceptionModuleRunner {

    public static void main(String args[]){

        FileReader fileReader = new FileReader();
        try{
            fileReader.readFile();
        }
        catch (FileReaderException e){
            System.out.println("cant read file");
        }

        //FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        //fileReaderWithoutHandling.readFile();

    }
}
