
import java.sql.*;
import java.time.Instant;

public class AfterMethodExample {
    public static void main(String... args) {
        Timestamp instant = Timestamp.from(Instant.now());
        Long value = instant.getTime();
        System.out.println(value);
        String str = "2018-09-01 09:01:15";
        Timestamp timestamp = Timestamp.valueOf(str);
        Integer val = timestamp.getNanos();
        Timestamp t2 = Timestamp.valueOf("2000-09-01 09:01:15");
        System.out.println(timestamp.before(t2));
        System.out.println(timestamp.after(t2));
        System.out.println(t2);
        System.out.println(val);
        System.out.println(timestamp);
       System.out.println(instant);
    }
}
