public class NameOps {
    public static String printMethodCall(String method, String name) {
        String addedName = method + "(\"" + name + "\"): ";
        return addedName;
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        int index = name.indexOf(" ");
        return index;
    }

    public static int indexOfSecondSpace(String name) {
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace == -1) {
            return -1;
        } else {
            String nameAfterSpace = name.substring(firstSpace + 1);
            int secondSpace = nameAfterSpace.indexOf(" ");
            if (secondSpace == -1) {
                return -1;
            } else {
                return firstSpace + 1 +  secondSpace;
            }
        }
    }

    public static String findFirstName(String name) {
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace == -1) {
            return name;
        } else {
            return name.substring(0, firstSpace);
        }
    }

    public static String findLastName(String name) {
        int firstSpace = indexOfFirstSpace(name);
        int secondSpace = indexOfSecondSpace(name);

        if (firstSpace == -1) {
            return "";
        } else if (secondSpace == -1) {
            return name.substring(firstSpace + 1);
        } else {
            return name.substring(secondSpace + 1);
        }

    }

    public static String findMiddleName(String name) {
        int firstSpace = indexOfFirstSpace(name);
        int secondSpace = indexOfSecondSpace(name);
        
        if (firstSpace == -1 || secondSpace == -1) {
            return "";
        } else {
            return name.substring(firstSpace + 1, secondSpace);
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        String first = findFirstName(name);
        String middle = findMiddleName(name);
        String last = findLastName(name);
        String result = "";

        if (last.equals("")) {
            result = "" + first + "";
            return result;
        } else if (!middle.equals("")) {
            result = "" + last + ", " + first + " " + middle.charAt(0) + ".";
            return result;
        } else {
            result = "" + last + ", " + first + "";
            return result;
        }  
    }
}
