public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel >= 0 && cleanlinessLevel <= 10) {
            return cleanlinessLevel;
        } 
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
            return cleanlinessLevel;
        } else {
            cleanlinessLevel = 10;
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        int firstSpace = name.indexOf(" ");
        String firstName = name.substring(0, firstSpace);
        String secondName = name.substring(firstSpace + 1);
        int year = (int) Math.random() * 100 + 1950;
        String username = "@" + firstName + "_" + secondName + "_" + year;
        return username;
    }

    public static void cleanPool(Pool pool) {
        int cleanLevel = pool.getCleanlinessLevel();
        int cleaning = cleanLevel + 2;
        pool.setCleanlinessLevel(cleaning);
    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        int firstSpace = trimmedName.indexOf(" ");
        String firstName = trimmedName.substring(0, firstSpace);
        String secondName = trimmedName.substring(firstSpace);
        String secondNameTrimmed = secondName.trim();
        String fixedName = firstName + " " + secondNameTrimmed;
        return fixedName;
    }
}
