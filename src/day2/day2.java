package day2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("src/day2/list.txt"));
            int count = 0;
            while(scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(" ");
                ArrayList<Integer> nums = new ArrayList<Integer>();
                for(String s : line){
                    nums.add(Integer.parseInt(s));
                }
                boolean safe = false;
                for(int i = 0; i < nums.size(); i++){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    for(int j = 0; j < nums.size(); j++){
                        if(j != i){
                            temp.add(nums.get(j));
                        }
                    }
                    if(isSafe(temp)){
                        safe = true;
                    }
                }
                if(safe){
                    count++;
                }
            }
            System.out.println(count);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static boolean isSafe (ArrayList<Integer> list){
        int length = list.size();
        if(list.getFirst() == list.get(length-1)){
            return false;
        }
        if(list.getFirst() < list.get(length-1)){
            for(int i = 1; i < length; i++){
                if(list.get(i) - list.get(i-1) > 3 || list.get(i) - list.get(i-1) < 1){
                    return false;
                }
            }
        }
        if(list.getFirst() > list.get(length-1)){
            for(int i = 0; i < length-1; i++){
                if(list.get(i) - list.get(i+1) > 3 || list.get(i) - list.get(i+1) < 1){
                    return false;
                }
            }
        }
        return true;
    }
}