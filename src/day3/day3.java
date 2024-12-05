package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day3 {
    public static void main(String[] args) {
        try{
            long total = 0;
            Scanner scanner = new Scanner(new File("src/day3/input.txt"));
            while(scanner.hasNextLine()){
                String input = scanner.nextLine();
                long sum = 0;
                Pattern pattern = Pattern.compile("mul\\((\\d{1,3}),(\\d{1,3})\\)");
                Pattern modifier = Pattern.compile("don't\\(\\).*?do\\(\\)", Pattern.DOTALL);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    long a = Long.parseLong(matcher.group(1));
                    long b = Long.parseLong(matcher.group(2));
                    sum += a * b;
                }
                total += sum;
            }
            System.out.println(total);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
