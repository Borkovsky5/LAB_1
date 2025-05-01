package lab1;

public class Task5 {
        public static void task5() {
          int num = 412;
         //Реверс числа
         int reversedNum = (num % 10) * 100 + (num / 10 % 10) * 10 + (num / 100);
      
          System.out.println("Реверс числа " + num + "=>"+reversedNum);
        }
      }  
