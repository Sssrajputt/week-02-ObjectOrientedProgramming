package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.librarymanagementsystem;

// Interface Reservable
public interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}