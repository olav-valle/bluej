
/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private double price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private double total;
    // Exercise 2.17
    private int status;
    // Counter for tickets printed.
    private int tickets;
    /**
     * Create a ticket machine with fixed price 1000 cents.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
        tickets = 0;
    }
    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(double cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        tickets = 0;
    }
    
    /**
     * Promt the user for the correct amount of money.
     */
    public void prompt()
    {
        System.out.println("##########################################");
        System.out.println("Please insert the correct amount of money.");
        System.out.println("##########################################");
    }
     
    /**
     * Return the price of a ticket.
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Show the current price of one ticket.
     */
    public void showPrice()
    {
        System.out.println();
        System.out.println("##########################################");
        System.out.println("The price of a ticket is " + price + " cents.");
        System.out.println("##########################################");
        System.out.println();
    }
    
    /**
     *  Set the price of a single ticket
     */
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
    
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Return the cumulative total amount of money that has been inserted.
     */
    public double getTotal()
    {
        return total;
    }
    
    /**
     * Return total number of tickets sold.
     */
    public int getTickets()
    {
        return tickets;
    }

    /**
     * Print out total number of tickets sold.
     */
    public void printSold()
    {
        System.out.println(getTickets() /* use getTickets to try method call as parameter */
        + " tickets sold so far.");
    }
    
    /**
     * Simulate the act of emptying the coin box.
     */
    public void empty()
    {
        total = 0;
    }
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        if (balance >= price)
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
       
            // Subtract price from balance
            balance -= price;
            System.out.println();
            // State remaining balance
            System.out.println("# Remaining balance is ¢" + balance);
            System.out.println();
            // Update the total collected with the balance.
            total = total + price;
        
        
            tickets++;
        }
        else
        {
            System.out.println("Please insert an additional " + (balance - price) + "cents");
        }
    }
}
