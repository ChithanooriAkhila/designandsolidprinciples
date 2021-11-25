interface TravelBooking{
    public void bookTicket();
}
class TicketBookingByAgent implements TravelBooking{
    TravelBooking t;
    public TicketBookingByAgent(TravelBooking t){
        this.t=t;
    }

    @Override
    public void bookTicket() {
        t.bookTicket();
    }
}
class TrainTicket implements TravelBooking{

    @Override
    public void bookTicket() {
        System.out.println("Train ticket Booked");
    }
}
class FlightTicket implements TravelBooking{

    @Override
    public void bookTicket() {
        System.out.println("Flight ticket Booked");
    }
}
public class Booking {
    public static void main(String[] args) {
        TicketBookingByAgent agent=new TicketBookingByAgent(new FlightTicket());
        agent.bookTicket();
    }
}
