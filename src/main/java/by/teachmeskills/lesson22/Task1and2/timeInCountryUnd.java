package by.teachmeskills.lesson22.Task1and2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class timeInCountryUnd {
    private String country;

    public timeInCountryUnd(String country) {
        this.country = country;
    }

    public ZonedDateTime time(String countryy) {
        ZonedDateTime timee = null;
        switch (countryy) {
            case ("Minsk"):
                timee = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
                break;
            case ("Washington"):
                timee = ZonedDateTime.now(ZoneId.of("America/New_York"));
                break;
            case ("Beijing"):
                timee = ZonedDateTime.now(ZoneId.of("Asia/Beijing"));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + countryy);
        }

        return timee;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
