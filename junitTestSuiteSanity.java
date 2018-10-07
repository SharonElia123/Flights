package Flights;

import Kidum.ExcelIsarelVac;
import SanityTest.*;
import Sport.MegaMenuEshetTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FlightAboardBackOther.class,FlightAboardFlyandBack.class,FlightAboardMultiFlights.class,
               FlightAboardOneWay.class,Flights3Top.class,FlightsAvgPrice.class,FlightsCheaper.class,FlightsCheckDepartment.class,
               FlightsFastFlights.class,FlightsFilters.class,FlightsHourTime.class,FlightsPeriodTime.class
})


public class junitTestSuiteSanity {

    public junitTestSuiteSanity() {
    }


}
