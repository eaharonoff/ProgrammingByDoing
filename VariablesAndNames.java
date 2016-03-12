public class VariablesAndNames
	{
	public static void main ( String [] args )
	{
	int cars, drivers, passengers, cars_not_driven, cars_driven;
	double space_in_car, carpool_capacity, average_passengers_per_car;

	cars= 100;
	space_in_car= 5.0;
	passengers= 90;
	drivers= 30;
	cars_not_driven= cars - drivers;
	cars_driven= drivers;
	carpool_capacity= space_in_car * cars_driven;
	average_passengers_per_car= passengers / cars_driven;

	System.out.println (" There are " + cars + " cars available " );
	System.out.println (" There are only " + drivers + " drivers available ");
	System.out.println (" There will be " + cars_not_driven + " empty cars todays ");
	System.out.println (" We can transport " + carpool_capacity + " people today. ");
	System.out.println (" We have " + passengers + " passengers to carpool today"); 
	System.out.println ( "We need to put about " + average_passengers_per_car + " in each car. " );
		}
	}