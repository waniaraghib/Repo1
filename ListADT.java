package listADT;
import java.util.ArrayList;
import java.util.List;

public class ListADT {
	public static void main(String[] args) {
		List <String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("FORd");
		cars.add("Mazda");
		System.out.println(cars);
		
		//Add items
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Toyota");
		 System.out.println(cars);

		 //Access items
		 System.out.println(cars.get(0));
		 System.out.println(cars.get(3));
		 
		//Change items
		 cars.set(0, "Honda");
		  System.out.println(cars);
		  
		  cars.remove(0);
		  System.out.println(cars);
		  
		  System.out.println(cars.size());
	}

}
