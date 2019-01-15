import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        if (emails.length > 100 || emails.length == 0) {
            return 0;
        }
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].length() == 0 || emails[i].length() > 100) {
                short temp = 0;
                if (emails[i].contains("@")) {
                    temp++;
                }
                if (temp > 1) {
                    return 0;
                }
                return 0;
            }
        }

        Set<String> setLocalNames = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            String temp = emails[i].split("@")[0];
            String domain = emails[i].split("@")[1];
            temp = temp.split("\\+")[0];
            temp = temp.replaceAll("\\.", "");
            if(!temp.equals("")) {
                setLocalNames.add(temp + "@" + domain);
            }

            }
        return setLocalNames.size();
    }
}
