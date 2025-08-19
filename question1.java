public class question1 {
	
	    public static void main(String[] args) {
	       
	    Car car1=new Car("toyota",2021);

	       
	        Car car2 = new Car("Honda Civic", 2023);

	       
	        System.out.println("Details of the first car:");
	        car1.displayDetails();

	        System.out.println();

	   
	        System.out.println("Details of the second car:");
	        car2.displayDetails();
	    }
	}


	
	class Car {
	    
	    String model;
	    int year;

	   
	    public Car(String model, int year) {
	       
	        this.model = model;
	        this.year = year;
	    }

	    
	    public void displayDetails() {
	        System.out.println("Model: " + this.model);
	        System.out.println("Year: " + this.year);
	    }
	}

