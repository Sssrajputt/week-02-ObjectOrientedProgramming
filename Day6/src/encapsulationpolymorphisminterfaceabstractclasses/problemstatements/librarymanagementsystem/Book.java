package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.librarymanagementsystem;


// Concrete class Book
public class Book extends LibraryItem implements Reservable {
    private int loanDuration;
    private boolean isReserved;
    private String borrower;

    public Book(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    @Override
    public void reserveItem(String borrower) {
        this.borrower = borrower;
        this.isReserved = true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    public String getBorrower() {
        return borrower;
    }
}

