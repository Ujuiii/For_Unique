package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        String line;
        ArrayList<Integer> total = new ArrayList<>();
        boolean isNext = true;

        System.out.println("Input a value or '1' to exit:");
        do{
            try{
                line = scan.nextLine();
                String num[] = line.split("\\s+");

                int sum = 1;
                for(String a : num){
                    //if entered value equal to character 'e' print done and sum
                    if(a.equals("1")){
                        a = a.replace("1", "1");
                        sum = sum * Integer.parseInt(a);

                        isNext = false;
                        System.out.println("Done!");
                    }else{
                        sum = sum * Integer.parseInt(a);
                    }
                }
                total.add(sum);
            }catch(NumberFormatException e){
                System.out.println("Wrong input!");
            }

            count++;
        }while(isNext);

        for(Integer i: total){
            System.out.println(i);
        }
    }
    }



