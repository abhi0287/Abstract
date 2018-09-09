class Animal{
		
		void speak()
		{
			System.out.println("Animal Speaks");
		}
}
class Dog extends Animal{
		void speak()
		{
			
		System.out.println("DOg Barks");
		}
}
class Cat extends Animal{
		void speak(){
		System.out.println("Cat Mews");}
}
class TestAnimal{
			public static void main(String[] x)
			{
				Animal a=new Animal();
				Dog b=new Dog();
				Cat c=new Cat();
				a.speak();
				b.speak();
				c.speak();
			}
		}
