package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> cars = new LinkedList<>();

		// add element to the queue
		cars.add("Toyota Corolla");
		cars.add("Honda Civic");
		cars.add("Ford Mustang");
		cars.add("Chevrolet Camaro");
		cars.add("BMW M3");
		cars.add("Mercedes-Benz C-Class");
		cars.add("Audi A4");
		cars.add("Tesla Model S");
		cars.add("Porsche 911");
		cars.add("Mazda MX-5 Miata");

		// peek the head element of the queue
		System.out.println("Peeked element: " + cars.peek());

		// remove the head element of the queue
		System.out.println("Removed element: " + cars.remove());

		// poll the head element of the queue
		System.out.println("Polled element: " + cars.poll());

		// Using For Each loop
		System.out.println("Cars in the queue:");
		for (String car : cars) {
			System.out.println(car);
		}

		// Using while loop with Iterator
		System.out.println("Cars in the queue using an iterator:");
		Iterator<String> iterator = cars.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

