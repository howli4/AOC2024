package day3;

import java.io.File;
import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("src/day3/list.txt"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
