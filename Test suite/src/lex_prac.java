
public class lex_prac {
	double fare;
	int seats;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lex_prac upd=new lex_prac();
		upd.sSeats(30);
		upd.sFare(20.0);
		upd.booking("Bhargav", 29);
		
	}
	
public double Fare() {
	return fare;
}

public int seat() {
	return seats;
}

public void sFare(double fare) {
	
	this.fare=fare;
}

public void sSeats(int seat) {
	this.seats=seat;
}
public void booking( String name, int bookingSeats ) {
	if (bookingSeats< seat()) {
		sSeats( seat()-bookingSeats);
		double totalFare = bookingSeats * Fare();
		System.out.println(name+" has booked "+bookingSeats+" Total fare "+totalFare+" Remaininig seats "+seat());
		System.out.println(fare+" seats "+seats);
	}
	else {
		System.out.print("No seats Available");
	}
}

}
