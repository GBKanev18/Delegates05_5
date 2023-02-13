import java.util.ArrayList;

public class Conference {

    private ArrayList<Delegate> delegates;
    private ArrayList<Hotel> hotels;

    public Conference(){

        delegates = new ArrayList<>();
        hotels = new ArrayList<>();

    }

    public void addDelegate(Delegate delegate, Hotel hotel){

        delegate.add(delegate);
        hotel.add(hotel);


    }

    public void outputAllInfo(){

        System.out.println("Delegate info: ");

        for(int i = 0; i < delegates.size(); i++){

            System.out.println("Name: " + delegates.get(i).getName());
            System.out.println("EGN: " + delegates.get(i).getEGN());
            System.out.println("Town: " + delegates.get(i).getTown());
            System.out.println("Road expences: " + delegates.get(i).getRoadExpences());
            System.out.println("Hotel: " + hotels.get(i).getHotelName());
            System.out.println();

        }

    }

    public void toBePaidToHotel(String town){

        double totalAmount = 0;

        for(int i = 0; i < delegates.size(); i++){

            if(delegates.get(i).getTown().equals(town)){

                totalAmount += hotels.get(i).getNightStayPrice();

            }

        }

        System.out.println("Amount to be paid to hotels: " + town + " - " + totalAmount);

    }

    public void earliestArrival(){

        Delegate earliestArrival = null;
        Hotel hotel = null;

        for(int i = 0; i < delegates.size(); i++){

            if(delegates.get(i).getSex().equals("male")){
                if ()
            }

        }

    }

}
