public class Hotel {

    private String hotelName;
    private String roomNumber;
    private double nightStayPrice;

    public Hotel(){

        this.hotelName = "Aqua";
        this.roomNumber = "212";
        this.nightStayPrice = 60;

    }

    public Hotel(String hotelName, String roomNumber, String nightStayPrice){

        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.nightStayPrice = Double.parseDouble(nightStayPrice);


    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getNightStayPrice() {
        return nightStayPrice;
    }

    public void setNightStayPrice(double nightStayPrice) {
        this.nightStayPrice = nightStayPrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", nightStayPrice=" + nightStayPrice +
                '}';
    }

    public void add(Hotel hotel) {
    }
}
