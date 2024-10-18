Задание 1
public class Main {
    public static void main(String[] args) {
        int number = 1238;
        int result = sumDigits(number);
        System.out.println("Сумма цифр числа " + number + " равна " + result);
    }
    
    public static int sumDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Убедимся, что число положительное
        
        while (number > 0) {
            sum += number % 10; // Добавляем последнюю цифру к сумме
            number /= 10; // Удаляем последнюю цифру
        }
        
        return sum;
    }
}

Задание 2

public class Main {
    public static void main(String[] args) {
        // Проверяем метод на нескольких значениях
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определён для отрицательных чисел");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Умножаем на текущее значение i
        }
        return result;
    }
}

Задание 3

public class Main
{
	public static void main(String[] args) {
		System.out.println(sum(5));
	}

	public static int sum(int num)
	{
		if (num <= 1) {
			return num;
		}

		return num + sum(num-1);
	}
}

Задание 4

public class Main {
    public static void main(String[] args) {
        // Проверяем метод на нескольких значениях
        System.out.println("2^3 = " + power(2, 3)); // 8
        System.out.println("5^0 = " + power(5, 0)); // 1
        System.out.println("3^4 = " + power(3, 4)); // 81
        System.out.println("7^2 = " + power(7, 2)); // 49
        System.out.println("2^-2 = " + power(2, -2)); // 0.25
    }

    public static double power(double a, int n) {
        if (n == 0) {
            return 1; // Базовый случай: a^0 = 1
        } else if (n < 0) {
            return 1 / power(a, -n); // Обработка отрицательных степеней
        } else {
            return a * power(a, n - 1); // Рекурсивный вызов
        }
    }
}

Задание 5

public class Main {
    public static void main(String[] args) {
        // Проверяем метод на нескольких значениях
        for (int i = 0; i <= 15; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        if (n == 0) {
            return 0; // Базовый случай: F(0) = 0
        } else if (n == 1) {
            return 1; // Базовый случай: F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Рекурсивный вызов
    }
}