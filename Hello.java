import java.util.*;
class Hello {

    Hello today = new Hello();
    public static void main(String[] args)  //main 메소드의 선언부,,프로그램 실행할 때 'java.exe'에 의해 호출될 수 있도록 미리 약속된 부분
    {
        System.out.println("Hello, World");
        System.out.printf("age : %d",14);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
    }    
}


