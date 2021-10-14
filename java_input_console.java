import java.util.Scanner;

public class Program {
   
    public static void main(String[] args) {
        
        System.out.println("Hello Evgeniya");
				// Это конструктор для ввода из консоли
				Scanner in = new Scanner(System.in);
				// Переменная для ответа
				int answer = 0;

				// Обрабатываем переменную 1
        System.out.print("Input a value 1: ");
        int value_1 = in.nextInt();

				// Обрабатываем оператор
				System.out.println("Input operator ");
				char operator =  in.nextLine();

				// Обрабатываем переменную 2
				System.out.print("Input a value 1: ");
        int value_2 = in.nextInt();

				switch (operator) {
					case  ('+'):
						// Выполняем сложение и выводим это на экран
						answer = value_1 + value_2
						System.out.println("Your answer is: ", answer);
						break;
					case  ('-'):
						// Выполняем вычитание и выводим это на экран
						break;
					case  ('/'):
						// Выполняем 
						break;
					case  ('*'):
						// Выполняем 
						break;
           
					default:
              // А если мы ничего не ввели?
							System.out.print("Youre operator is wrong. Try again");
						break;
       }




    }
}
