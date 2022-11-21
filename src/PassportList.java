import java.util.HashSet;
import java.util.Set;

public class PassportList {

    private final Set<Passport> passports = new HashSet<>();

    public void addPassport(Passport passport) {
        this.passports.add(passport);
    }
    public Passport findNumber(int num) {
        for (Passport passport : passports) {
            if (passport.getNum() == num) {
                return passport;
            }
        }
        return null;
    }
}
