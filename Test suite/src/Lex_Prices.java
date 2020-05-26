
public class Lex_Prices {
	
	double basefare;

	int seatsAvailable;

	public static void main(String[] args) {

		Lex_Prices up = new Lex_Prices();
		up.setFare(100.0);
		up.setSeat(250);
		// up.seatBooking("bhargav",10);
		up.seatBooking("sony", 241);
		up.seatBooking("apple", 9);
	}

	public double getFare() {

		return basefare;
	}

	public void setFare(double fare) {
		this.basefare = fare;
	}

	public int getSeat() {
		return this.seatsAvailable;
	}

	public void setSeat(int seat) {

		this.seatsAvailable = seat;
	}

	public void seatBooking(String name, int noOfSeat) {
		if (noOfSeat < getSeat()) {

			// setSeatsAvailable((seatsAvailable-noOfSeatsRequired));

			setSeat(getSeat()-noOfSeat);
			// double totalFare=noOfSeatsRequired*baseFare;
			double totalFare = noOfSeat * basefare;
			// System.out.println(name+" has booked "+noOfSeatsRequired+" seats,

			// System.out.println(name+" has successfully booked "+noOfSeatsRequired+",
			// total fare is "+TotalFare+" and "+seatsAvailable+" seats remaining");
			System.out.println();
			System.out.println(name + " has booked " + noOfSeat + " total fare is " + totalFare + "  available seats  "
					+ getSeat()+" Present fare per seat "+getFare());
		} else {
			System.out.print(name+" Sorry no seats Avialble");
		}

	}

}
