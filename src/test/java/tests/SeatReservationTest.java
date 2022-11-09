package tests;

import org.testng.annotations.Test;
import pages.SeatReservationPage;

public class SeatReservationTest extends BaseTests {

    SeatReservationPage seatReservationPage;

    @Test
    public void userCanReserveASeat() {

        seatReservationPage = new SeatReservationPage(driver);

        seatReservationPage.selectSeat();
        seatReservationPage.selectPoints();
        seatReservationPage.enterCustomerInfo("6789125987","nagham@test.com");
        seatReservationPage.enterPassengerDetails("PName","MALE","25");
        seatReservationPage.submitPayment();
    }

}
