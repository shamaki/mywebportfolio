class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

}

public void static main(String arg) {
	Person p = new Person("Jerry", 22);
	printf(p);
}
