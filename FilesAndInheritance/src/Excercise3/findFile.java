package Excercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Lav scanner
        Scanner scn = new Scanner(System.in);
        //Få fil fra bruger
        String filePath = scn.nextLine();
        //Lav stringen fra brugeren om til en fil
        File fil = new File(filePath);
        //lav en ny scanner der aflæser filen
        Scanner readFile = new Scanner(fil);
        int count = 0;


        //While loop til at printe alle ord
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
                if (line.length()>0){
                    count++;
                }
            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i+1).equals(" ")) {
                    count++;
                }
            }

        }
        System.out.println(count);
        //Genvej til fil: C:/Users/Ice/Desktop/HejMedDig.txt

    }
}
