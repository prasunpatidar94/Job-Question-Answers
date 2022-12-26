import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressValidation {

    public static void main(String[] args) {

        System.out.println("This IP Address is "+((getIpValidation("121.0.0.0"))?"valid":"Not Valid"));
    }
    private static Boolean getIpValidation(String ip) {

        if (ip == null && ip.isEmpty() && ip.isBlank())
            return false;

        String ipRegExp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String ipAddress = ipRegExp + "\\."
                + ipRegExp + "\\."
                + ipRegExp + "\\."
                + ipRegExp;
        Pattern pattern = Pattern.compile(ipAddress);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}




