import java.time.LocalDate;

public class DelegationCard {

    private String delegateNumber;
    private LocalDate dateOfArrival;
    private LocalDate dateOfDeparture;

    public DelegationCard(){

        this.delegateNumber = "123456";
        this.dateOfArrival = LocalDate.parse("2022/05/01");
        this.dateOfDeparture = LocalDate.parse("2022/06/12");

    }

    public DelegationCard(String delegateNumber, LocalDate dateOfArrival, LocalDate dateOfDeparture){

        this.delegateNumber = delegateNumber;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;

    }

    public String getDelegateNumber() {
        return delegateNumber;
    }

    public void setDelegateNumber(String delegateNumber) {
        this.delegateNumber = delegateNumber;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    @Override
    public String toString() {
        return "DelegationCard{" +
                "delegateNumber='" + delegateNumber + '\'' +
                ", dateOfArrival=" + dateOfArrival +
                ", dateOfDeparture=" + dateOfDeparture +
                '}';
    }
}
