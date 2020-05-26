
public class Lex_value_cart {
	public static void main(String[] args) {

	
	String [] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};

	int totalPrice=0;

	for (String i : cart) {

	if (i=="round-neck")

	totalPrice+=200;

	else if (i=="collared")

	totalPrice+=250;

	else if(i=="hooded")

	totalPrice+=300;

	}

	double finalPrice=0;

	if (cart.length>=5 && cart.length<=10) 

	finalPrice+=totalPrice*0.9;

	else if (cart.length>10)

	finalPrice+=totalPrice*0.8;

	else 

	finalPrice=totalPrice;

	System.out.println("Final price is Rs."+finalPrice );

	}

	

}
