package net.ukr.andy777;

/*
 Описать класс "Triangle". В качестве свойств - взять длинны сторон
 треугольника. Реализовать метод возврата площади треугольника. Создать
 несколько объектов класса и протестрировать их.
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Lesson1 Task2");
		Triangle();
	}

	private static void Triangle() {

		Triangle triangle1 = new Triangle(3, 4, 5);
		System.out.println(triangle1);

		Triangle triangle2 = new Triangle(6, 8, 15); // навмисне нереальний
		// приклад
		System.out.println(triangle2);

	}
}