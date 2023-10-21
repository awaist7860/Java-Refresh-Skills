import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 5;
	}

	static class Inner2 {
		int z = 5;

		public int inner2Method() {
			int x = z + 25;
			return x;
		}
	}
}

public class Main {

	public static void main(String[] args) {

		System.out.println(("Ammar is gay and Ahmer is a G"));

		// part1Tut();

		// part2Tut();

		// part3Tut();

		// part4Tut();

		// part5Tut();

		// arraylistTut();

		// linkedlistsTut();

		// hashMapsAndHashSetTut();

		// iteratorTut();

		// threadTut();

		// fileHandling();

		// // practices tests
		// addingNumbersPractical();

		// countingWordsPractical();

		// reversingPractical();

		// summingArraysPractical();

		// areaRectanglePractical();

		// checkOddEvenPractical();

	}

	static void checkOddEvenPractical() {
		// finding even or odd number
		EvenOrOdd check = new EvenOrOdd();
		check.oddOrEven();
	}

	static void areaRectanglePractical() {
		// area of a rectangle
		RectangleArea area = new RectangleArea();
		area.areaOfRectangle();
	}

	static void summingArraysPractical() {
		SumArray addingArraysSum = new SumArray();
		addingArraysSum.arraySum();
	}

	static void reversingPractical() {
		ReverseString reverse = new ReverseString();
		reverse.reverse();
	}

	static void countingWordsPractical() {
		// counting words
		CountingWords wordCounter = new CountingWords();
		wordCounter.wordsCount();
		wordCounter.userInWords();
	}

	static void addingNumbersPractical() {
		// adding numbers
		addingNumbers adding = new addingNumbers();
		adding.adding(); // manual
		// adding.userAdding(); // user input
	}

	static void fileHandling() {
		// Java file handling
		// creating a filename
		File myFile = new File("myFile.txt");
		File newFileForFolder = new File(
				"C:\\Users\\awais\\OneDrive\\Desktop\\All Desktop Files\\Documents\\Awais Learning Java\\textFilesFolder\\newFolderFile.txt");

		// creating the file
		try {
			if (myFile.createNewFile()) { // cheacks if the file exist before or not
				System.out.println("The file has been created succesfully - " + myFile.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) { // exception error
			System.out.println("An error occured - " + e);
			e.printStackTrace();
		}

		try {
			if (newFileForFolder.createNewFile()) { // cheacks if file exists
				System.out.println("The file was creatd in the folder - " + newFileForFolder.getName());
			} else {
				System.out.println("The file already exists");
			}
		} catch (IOException f) {
			System.out.println("An error occured - " + f); // exception error
			f.printStackTrace();
		}

		// writting to a file
		try {
			FileWriter myWriter = new FileWriter(newFileForFolder);
			myWriter.write("This is the file writer class writting to a file");
			myWriter.close(); // remeber tp close the writer
			System.out.println("Succesfuly wrote to a file");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occured - " + e);
			e.printStackTrace();
		}

		// reading from a file using the scanner class
		try {
			Scanner myReeader = new Scanner(newFileForFolder);
			while (myReeader.hasNextLine()) {
				String fileDat = myReeader.nextLine();
				System.out.println(fileDat);
			}
			myReeader.close(); // remeber to close the reader
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("An error occured - " + e);
			e.printStackTrace();
		}

		// Getting info about the file
		if (newFileForFolder.exists()) {
			System.out.println("File name: " + newFileForFolder.getName());
			System.out.println("Absolute path: " + newFileForFolder.getAbsolutePath());
			System.out.println("Writeable: " + newFileForFolder.canWrite());
			System.out.println("Readable " + newFileForFolder.canRead());
			System.out.println("File size in bytes " + newFileForFolder.length());
		} else {
			System.out.println("The file does not exist.");
		}

		// deleting files
		if (myFile.delete()) {
			// myFile.delete(); //dont need redundent
			System.out.println("Deleted the file: " + myFile.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}

		// deleting a folder
		File folderToDelete = new File(
				"C:\\Users\\awais\\OneDrive\\Desktop\\All Desktop Files\\Documents\\Awais Learning Java\\foldeToDelete");

		if (folderToDelete.delete()) {
			System.out.println("Deleted the folder - " + folderToDelete.getName());
		} else {
			System.out.println("Failed to delete the folder.");
		}
	}

	static void threadTut() {
		ThreadClass newThread = new ThreadClass();

		// proper way to start the thread
		Thread thread = new Thread(newThread);

		thread.start();

		// bad way to use a thread
		System.out.println(newThread.amount);

		newThread.amount++;

		System.out.println(newThread.amount);

		// good way to use a thread
		while (thread.isAlive()) {
			System.out.println("Thread is waiting!!!");
		}

		// before doing any calculation
		System.out.println("Main: " + newThread.amount);
		newThread.amount++;
		// after calulation
		System.out.println("Main: " + newThread.amount);

		// newThread.run();
	}

	static void iteratorTut() {
		// iterator
		// Array List
		ArrayList<String> cars = new ArrayList<String>();
		// populating the array with data
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Porche");
		cars.add("Nissan");

		// getting the iterator
		Iterator<String> iter = cars.iterator();

		// primts the first item
		System.out.println(iter.next());

		// looping thorugh all the items in the arraylist using while loop
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// removing items from a collection
		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(15);
		number.add(13);
		number.add(2);
		number.add(5);
		number.add(17);
		number.add(3);
		number.add(16);
		number.add(11);
		number.add(1);
		number.add(8);
		number.add(6);
		number.add(4);
		number.add(18);
		number.add(7);

		Iterator<Integer> iterInt = number.iterator();

		while (iterInt.hasNext()) {
			Integer i = iterInt.next();
			if (i < 10) {
				iterInt.remove();
			}
		}
		System.out.println(number + " - " + number.size());
	}

	static void hashMapsAndHashSetTut() {
		// hash maps
		// creating a hash map
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// adding items to the hash map
		// Country City
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington");

		// printing the cities
		System.out.println(capitalCities);
		// This is the out put
		// {USA=Washington, Norway=Oslo, England=London, Germany=Berlin}

		// accessing an item
		// capitalCities.get("England"); //method for getting item using key
		System.out.println(capitalCities.get("England"));
		System.out.println(capitalCities.size());// getting size

		// looping through a hashmap
		// print keys
		for (String i : capitalCities.keySet()) {
			System.out.println("This is a key in the hashmap - " + i);
		}

		// print values
		for (String v : capitalCities.values()) {
			System.out.println("this is a value from the hashmap - " + v);
		}

		for (String b : capitalCities.keySet()) {
			System.out.println("The key is - " + b + " The value is - " + capitalCities.get(b));
			// to make it easier to understand
			System.out.println("The Country is - " + b + " The City is - " + capitalCities.get(b));
		}

		// using other data types such as integer for hashmaps

		HashMap<String, Integer> hashNumbers = new HashMap<String, Integer>();

		// adding data
		hashNumbers.put("Awais", 26);
		hashNumbers.put("Hammad", 245);
		hashNumbers.put("Hamzah", 3658);
		hashNumbers.put("Madeeha", 985);
		hashNumbers.put("Hafsa", 376);
		hashNumbers.put("Chilli", 126);

		for (String l : hashNumbers.keySet()) {
			System.out.println("The key is - " + l + " The value is - " + hashNumbers.get(l));
			// to make it easier to understand
			System.out.println("The Name is - " + l + " The Number is - " + hashNumbers.get(l));
		}

		// HashSets
		HashSet<String> cars = new HashSet<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Porche");
		cars.add("Nissan");

		System.out.println(cars); // prints the hashset

		System.out.println(cars.contains("Toyota")); // boolean check to see if the Hashset has the item
		System.out.println(cars.size()); // Checks how many items are in the hashset

		// for loop
		for (String c : cars) {
			System.out.println(c);
		}

		// other datatypes for hashsets

		HashSet<Integer> linkedNumbers = new HashSet<Integer>();
		linkedNumbers.add(2);
		linkedNumbers.add(5);
		linkedNumbers.add(7);
		linkedNumbers.add(3);
		linkedNumbers.add(6);
		linkedNumbers.add(1);
		linkedNumbers.add(10);

		for (int q = 0; q <= 10; q++) {
			if (linkedNumbers.contains(q)) {
				System.out.println("The number " + q + " was found");
			} else {
				System.out.println("The number " + q + " was not found");
			}
		}
	}

	static void linkedlistsTut() {
		// linked lists
		// similar structure to array lists
		// creating 2 linked lists
		LinkedList<String> linkedCars = new LinkedList<String>();
		LinkedList<Integer> linkedNumbers = new LinkedList<Integer>();

		// populating the linkedlists with data
		linkedCars.add("Volvo");
		linkedCars.add("BMW");
		linkedCars.add("Audi");
		linkedCars.add("Mercedes");
		linkedCars.add("Ford");
		linkedCars.add("Toyota");
		linkedCars.add("Porche");
		linkedCars.add("Nissan");

		linkedNumbers.add(25);
		linkedNumbers.add(45);
		linkedNumbers.add(82);
		linkedNumbers.add(96);
		linkedNumbers.add(74);
		linkedNumbers.add(58);
		linkedNumbers.add(37);

		// printing out the data in the linked lists
		System.out.println(linkedCars);
		System.out.println(linkedNumbers);

		System.out.println("Looping through linked list using for loops");
		// for loop through the linked lists
		for (int i = 0; i < linkedCars.size(); i++) {
			System.out.println("These are cars from a linked list - " + linkedCars.get(i));
		}
		System.out.println("Looping through linked list using for loops");
		for (int j = 0; j < linkedNumbers.size(); j++) {
			System.out.println("These are numbers from a linked list - " + linkedNumbers.get(j));
		}

		// for each loop through the linked lists
		System.out.println("Looping through linked list using for each loops");
		for (String h : linkedCars) {
			System.out.println("These are cars from a linked list - " + linkedCars);
		}
		System.out.println("Looping through linked list using for each loops");
		for (Integer k : linkedNumbers) {
			System.out.println("These are numbers from a linked list - " + linkedNumbers);
		}
	}

	static void arraylistTut() {
		// Array Lists
		// Strings array
		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Porche");
		cars.add("Nissan");

		number.add(25);
		number.add(45);
		number.add(82);
		number.add(96);
		number.add(74);
		number.add(58);
		number.add(37);

		// looping using a for loop
		System.out.println("for loop string");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("This is car - " + cars.get(i));
		}

		System.out.println("for loop integer");
		for (int n = 0; n < number.size(); n++) {
			System.out.println("Numbers Array - " + number.get(n));
		}

		// changing values in the array and seeing the chnages in a for loop
		System.out.println("chaning a value in string");
		cars.set(3, "Seat");

		System.out.println("changing a value in integer");
		number.set(2, 69);

		// seeing changes in string
		for (int k = 1; k < cars.size(); k++) {
			System.out.println("This is cars updated - " + cars.get(k));
		}

		// seeing changes in integer
		for (int m = 0; m < number.size(); m++) {
			System.out.println("This is numbers updated - " + number.get(m));
		}

		// getting size of arraylist for bothe string and integer
		System.out.println("car array list size" + cars.size());
		System.out.println("numbers array list size" + number.size());

		// removing items from cars adn numbers array lsits
		cars.remove(5);
		number.remove(2);

		// showing removed numbers from the cars and numbers arraylists
		for (int l = 0; l < cars.size(); l++) {
			System.out.println("Removed cars - " + cars.get(l));
		}

		for (int p = 0; p < number.size(); p++) {
			System.out.println("Removed number - " + number.get(p));
		}

		// getting cars and number arraylist size after removal of item
		System.out.println(cars.size());
		System.out.println(number.size());

		// looping using a for each loop for both cars and number array list
		System.out.println("for each loop");
		for (String c : cars) {
			System.out.println(c);
		}

		System.out.println("for each loop");
		for (Integer v : number) {
			System.out.println(v);
		}

		// sorting arraylist using the collections imported class
		System.out.println("for each loop sorting the arraylists");
		Collections.sort(number); // sorts number
		Collections.sort(cars); // sorts cars

		System.out.println("sorted cars");
		for (String z : cars) {
			System.out.println(z);
		}

		System.out.println("sorted numbers");
		for (Integer s : number) {
			System.out.println(s);
		}

	}

	static void part5Tut() {

		// User input
		// using scanner
		// basic example below

		// creating a scanner
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter name of car: ");
		String carName = myScanner.nextLine();
		System.out.println("The car name you have entered is - " + carName);

		System.out.println("Enter the engine size of the car: ");
		Float engineSize = myScanner.nextFloat();
		System.out.println("The engine size of the car is - " + engineSize);

		// Date and time from the Java.time.* package
		LocalDate date = LocalDate.now(); // creates the date object
		LocalTime time = LocalTime.now(); // creates the time object
		LocalDateTime dateTime = LocalDateTime.now(); // creates the date time object
		System.out.println("The date is " + date + " and the time is " + time);
		System.out.println("The current date time is " + dateTime);

		// now foramtting the dates and times
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter myFormatter2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		String formattedDateTime = dateTime.format(myFormatter);
		String formattedDateTime2 = dateTime.format(myFormatter2);
		System.out.println("Data and time after being formatted - " + formattedDateTime);
		System.out.println("Data and time after being formatted - " + formattedDateTime2);

		myScanner.close();
	}

	static void part4Tut() {
		// enums

		// Accessing the enum class called level
		Level myLevel = Level.MEDIUM;

		System.out.println("Level is - " + myLevel);

		// switch statement

		switch (myLevel) {
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Medium level");
				break;
			case HIGH:
				System.out.println("High Level");
				break;
		}

		// looping through an enum
		for (Level myVar : Level.values()) {
			System.out.println("Level is - " + myVar);
		}

	}

	static void part3Tut() {
		// getters and setters
		// Person person = new Person();

		// // getters
		// System.out.println("Person class name is " + person.getName()); // this will
		// give null

		// // setters
		// person.setName("Awais");

		// // Getters
		// System.out.println("Person class name is " + person.getName());

		// // trying to get name from person class with the getter method wont work as
		// it
		// // is private
		// // System.out.println("This wont work " + person.name); //error

		// person.readUserInput();

		// // polymorphism
		// System.out.println("This is polymorphism");

		// // Animals animal = new Animals();
		// Dog dog = new Dog();
		// Cat cat = new Cat();

		// // animal.animalSound();
		// dog.animalSound();
		// dog.sleep();
		// cat.animalSound();
		// cat.sleep();

		// // interfaces

		// // nested classes

		// OuterClass outer = new OuterClass();
		// OuterClass.InnerClass inner = outer.new InnerClass();
		// OuterClass.Inner2 inner2 = new OuterClass.Inner2();
		// System.out.println(outer.x + inner.y);
		// System.out.println(inner2.z);
		// System.out.println(inner2.inner2Method());
	}

	static void part2Tut() {
		String name = "Awais";
		int age = 23;

		// int mainClass = 10;

		// part1Tut();
		// myMethod();
		// myMethod();
		// myMethod();
		myMethod2(name, ageMethod(age));
		System.out.println(calculation(45, 65));

		checkAge(15);
		checkAge(17);
		checkAge(age);

		int num1 = plusMethod(10, 12);
		double num2 = plusMethod(2.5, 3.6);

		System.out.println("int is " + num1);
		System.out.println("Double is " + num2);

		int result = sum(10);
		System.out.println(result);

		newClass classNo2 = new newClass();

		System.out.println(classNo2.x + " This is from the new class using the classNo2 object");

		newClass object2Class = new newClass();

		System.out.println(object2Class.x + " This is from the new class using the object2Class object");

		// getting fixed variables from a method from another class

		System.out.println("getting fixed variables from a method from another class");

		System.out.println("This is pi - " + object2Class.fixedDouble());

		System.out.println("This is a fixed int - " + object2Class.fixedInt());

		System.out.println("This is a fixed float - " + object2Class.fixedFloat());

		// calling public and static methods

		System.out.println("Public and static methods");

		// static
		System.out.println("static method");
		myStaticMethod();

		// public
		System.out.println("public static method");
		Main toGetPubMet = new Main();
		toGetPubMet.myPublicMethod();

		// Car myCar = new Car(23, name);

		// myCar.fullThrottle();
		// myCar.speed(108);

		// System.out.println(myCar.v + " " + myCar.mainName);

		// myCar.drives();

		// // System.out.println(myCar.v + " " + myCar.fname);
	}

	static void part1Tut() {

		final String java = "Java"; // this cannot be changed by anyone late on

		// declaring multiple varibale names on the same line
		String fName = "Awais", sName = "Tasleem";

		int x = 27, y = 23;
		int z = x + y;

		double a = 47.0d;
		float b = 3.0f;
		float c = (float) a + (float) b;

		// other types
		int myNum = 5;
		// float myFloatNum = 5.99f;
		// char myLetter = 'D';
		// boolean myBool = true;
		// String myText = "Hello";

		double newDouble = myNum;
		int newInt = (int) newDouble;

		System.out.println(newDouble + " this is a int that has been converted to a double");
		System.out.println(newInt + " this is a double that has been converted into a int");

		// words
		System.out.println("Hello World");
		System.out.println("Awais Tasleem");
		System.out.println("Java is fun");
		System.out.print("I am 23 years old ");
		System.out.print("and I have a blue car");

		// numbers
		System.out.println(23);
		System.out.println(45);
		System.out.println(26);
		System.out.print(20);
		System.out.println(20);

		System.out.println(fName);
		System.out.println(sName);

		System.out.println("Full name is " + fName + " " + sName);

		System.out.println(z);
		System.out.println(c);

		System.out.println(java);

		// maths

		int rand1;
		int rand2;

		rand1 = (int) (Math.random() * 101);
		rand2 = (int) (Math.random() * 101);

		System.out.println(Math.max(z, y) + " is bigger");
		System.out.println(Math.sqrt(49) + " This performs square root on 49");
		System.out.println(Math.abs(96.35) + " and " + Math.abs(-96.35) + " this returns the absolout value of x");
		System.out.println("rand1 " + rand1 + " rand2 " + rand2);

		// if statments

		int e = 20;
		int f = 18;

		if (e < f) {
			System.out.println("e is greater than f");
		} else if (f < e) {
			System.out.println("f is greater than e");
		} else {
			System.out.println("data is wrong");
		}

		// short hand iff statments

		int time = 20;

		if (time < 18) {
			System.out.println("Good Day");
		} else {
			System.out.println("Good Evening");
		}

		// now short hand

		String result = (time < 18) ? "Good Day" : "Good Evening";
		System.out.println("This is from Shorthand " + result);

		// switch statments

		int day = 4; // example for a week, day 4 is thursday

		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("sunday");
				break;
			default:
				System.out.println("No day selected");
		}

		// loops
		// while loops

		int i = 0;
		int j = 0;

		System.out.println("While loop testing");

		while (i < 5) {
			System.out.println("While loop");
			System.out.println("this is i variables value - " + i);
			i++;
			// if (i == 3) {
			// break;
			// }
		}

		// do/while loop

		System.out.println("Do/While loop testing");

		do {
			System.out.println("Do/While loop");
			System.out.println("this is j variables value - " + j);
			j++;
		} while (j < 5);

		// for loops
		System.out.println("For loop testing example 1");

		for (int t = 0; t < 5; t++) {
			System.out.println("For loop");
			System.out.println("this is t variables value - " + t);

		}

		System.out.println("For loop testing example 2");

		for (int r = 0; r <= 10; r += 2) {
			System.out.println("For loop");
			System.out.println("this is r variables value - " + r);
		}

		// nested loops

		System.out.println("Nested loop testing");
		System.out.println("Example 1");
		System.out.println();
		System.out.println();
		System.out.println();

		// outer loop
		for (int l = 0; l <= 2; l++) {
			System.out.println("Nested loop outer");
			System.out.println("this is L variables value - " + l);

			// inner loop
			for (int k = 1; k <= 3; k++) {
				System.out.println("Nested loop inner");
				System.out.println("this is K variables value - " + k);
			}
		}

		// for each loop
		// it loops thorugh items in an array

		String[] cars = { "Volvo", "Audi", "Ford", "BMW", "Mazda" };

		for (String n : cars) {
			System.out.println(n);
		}

		// combining loops

		for (int h = 0; h < 5; h++) {
			for (String n : cars) {
				System.out.println(n);
				System.out.println(cars.length);
				for (int count = 0; count < 10; count++) {
					if (count == 4) {
						continue;
					}
					System.out.println(count);
				}
			}
		}

		// arrays

		// decalring an empty array

		// String[] cars2;
		// int[] nums;

		// declaring an array with items
		String[] cars3 = { "Nissan", "Toyota", "Jeep", "Seat" };
		int[] nums2 = { 1, 24, 35, 65, 67, 95, 258, 32479 };

		// accessing an array by indexing
		System.out.println(nums2[4]); // should be 67
		System.out.println(cars3[2]); // should be jeep

		// changin an array element
		cars3[2] = "mercedes";
		System.out.println(cars3[2]); // should be mercedes now

		System.out.println("Array cars 3 length is - " + cars3.length + " and Array num2 length is - " + nums2.length);

		// looping through arrays
		for (int o = 0; o < cars3.length; o++) {
			System.out.println(cars3[o]);
		}

		// multidimensional arrays

		// declaring a multidimenional array with doouble double square brackets
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		// access elements
		System.out.println(myNumbers[1][2]); // should out put 7

		// changing elements
		myNumbers[1][2] = 9;

		System.out.println(myNumbers[0][2]); // should out put 9
		System.out.println(myNumbers[1][2]); // should out put 7

		// looping through a multidimensional array
		// looping thorugh array 1
		for (int u = 0; u < myNumbers.length; u++) {
			for (int q = 0; q < myNumbers.length; q++) {
				System.out.println(myNumbers[u][q]);
			}
		}

	}

	public void myPublicMethod() {
		System.out.println("This public method can only be called if a object of the class is created");
	}

	static void myStaticMethod() {
		System.out.println("This static method can be called by just calling it");
	}

	static void myMethod() {
		System.out.println("This is the myMethod function that is being called");
	}

	static void myMethod2(String fName, int age) {
		System.out.println(fName + " Tasleem is " + age + " years old");
	}

	static int ageMethod(int x) {
		return x + 5;
	}

	static void checkAge(int age) {

		if (age > 18) {
			System.out.println("Access Granted" + " age is " + age);
		} else if (age < 16) {
			System.out.println("Your almost old enough" + " age is " + age);
		} else {
			System.out.println("Access Denied" + " age is " + age);
		}

	}

	static int calculation(int x, int y) {

		int z = (x + 5) + (y + 10);

		return z;
	}

	// overloading methods

	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}

	// recursion

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

}