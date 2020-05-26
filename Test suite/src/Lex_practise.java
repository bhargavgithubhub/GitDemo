public class Lex_practise {


public double baseFare=100.0;

public int seatsAvailable=250;

/*public double getBaseFare() {

return baseFare;

}

/*public void setBaseFare(double baseFare) {

this.baseFare = baseFare;

}*/

/*public int getSeatsAvailable() {

return seatsAvailable;

}*/

/**
 * @param seatsAvailable
 */
public void setSeatsAvailable(int seatsAvailable) {

this.seatsAvailable = seatsAvailable;

}

public void bookSeat(String name, int noOfSeatsRequired)

{

if(noOfSeatsRequired<seatsAvailable )

{

setSeatsAvailable((seatsAvailable-noOfSeatsRequired));

double totalFare=noOfSeatsRequired*baseFare;

System.out.println(name+"has booked "+noOfSeatsRequired+" seats, total fare is "+totalFare+" and "+seatsAvailable+" seats remaining");

}

else

{

System.out.println("Sorry Ann! insuffucient number of seats");

}

}

}





 class Tesss{
	 

//Tester Class

public static void main(String args[])

{

	 Lex_practise test1= new  Lex_practise();

test1.bookSeat("Shikhar", 249);

}

}