import java.util.Scanner;

    public class Control{
        public static void main(String[] args){
            /*
             * 정수를 입력받아서
             * 양의 정수 라면 양수라 출력하고
             * 음의 정수라면 음수라 출력하시오
            */ 
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("정수를 입력하시오: ");
            int number = scanner.nextInt();

            if(number > 0){
                System.out.println("양수");
            }else if(number < 0){
                System.out.println("음수");
            }
            System.out.print("성별을 입력하시오:");

            String gender = scanner.next();
            if(gender.equalsIgnoreCase("M")){
                System.out.println("남성");
            }
            else if(gender.equalsIgnoreCase("F")){
                System.out.println("여성");
            }
            
        }
    }

