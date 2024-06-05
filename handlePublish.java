
class publication{
    String title;
    double prices;
    int copies;

    publication(String title,double prices,int copies){
        this.title = title;
        this.prices = prices;
        this.copies = copies;
    }

    void saleCopy(int copiesSold) {
        if (copies >= copiesSold) {
            copies -= copiesSold;
            System.out.println("Sold " + copiesSold + " copies of " + title);
        } else {
            System.out.println("Not enough copies available to sell.");
        }
    }
    double getTotalSale() {
        return prices * (copies);
    }
}

class Book extends publication{
    String author;

    Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }
    void orderCopies(double additionalCopies){
        copies += additionalCopies;
        System.out.println("Ordered " + additionalCopies + " more copies of " + title);
    }
}

class Magazine extends publication{
    int orderQty;
    String currentIssue;

    Magazine(String title, double price, int copies, int orderQty,String currentIssue){
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    void receiveIssue(String newIssue) {
        currentIssue = newIssue;
        System.out.println("Received new issue of " + title + ": " + currentIssue);
    }
}

public class handlePublish {
    public static void main(String args[]){
        Book book1 = new Book("Java Programming", 50.0, 10, "Author A");
        Book book2 = new Book("Python Programming", 60.0, 5, "Author B");

        Magazine mag1 = new Magazine("Tech Monthly", 10.0, 30, 50, "June 2024");

        // Order copies of books
        book1.orderCopies(5);
        book2.orderCopies(3);

        // Sell copies of books
        book1.saleCopy(4);
        book2.saleCopy(2);

        // Receive new magazine issue
        mag1.receiveIssue("July 2024");

        // Display total sales
        System.out.println("Total sale of " + book1.title + ": " + book1.getTotalSale());
        System.out.println("Total sale of " + book2.title + ": " + book2.getTotalSale());
        System.out.println("Total sale of " + mag1.title + ": " + mag1.getTotalSale());

    }    
}