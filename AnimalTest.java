package test;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Cat();// ����ת��
		animal.eat();
		Cat c = (Cat) animal;
		System.out.println("****************");
		animal = new Dog();// ����ת��
		animal.eat();
		Dog d = (Dog) animal;// ����ת�ͣ���Ҫǿת��
		d.run();

	}
}
