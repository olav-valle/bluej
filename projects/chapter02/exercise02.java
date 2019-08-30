// Ex. 2.22

public Date(String month, int day, int year)
{
	month = month;
	day = day;
	year = year;
}


// ex. 2.33

/**
* Increase score by the given number of points.
*/
public void increase(int points)
{
	score += points;
}


// ex. 2.35

/**
* Reduce price by the given amount
*/
public void discount(int amount)
{
	price -= amount;
}

// ex. 2.54

/**
* assignment statement that will store the result
* of multiplying two variables, price and discount,
* into a third variable, saving.
*/

double saving = (price * discount);


// ex. 2.55

// divide value in total by value in count.
// store in mean.

double mean = (total / count);


// ex. 2.56

// compare values budget and price.
// print string "too expensive" if price > budget.
// else print "just right".
public void rightPrice(double price, double budget)
{
	if (price > budget) {
		System.out.println(price + "is too expensive for your budget of " + budget "!");
	}

	else {
		System.out.println("The price is right!");
	}
}
6
