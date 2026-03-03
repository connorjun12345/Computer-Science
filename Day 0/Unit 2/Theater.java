public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    Theater(String theaterName, int initialCapacity) {
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;

    }

    public void increaseCapacity() {
        TheaterMember[] largerArray = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            largerArray[i] = registeredMembers[i];
        }

        registeredMembers = largerArray;

    }

    public void registerMember(TheaterMember member) {
        if (isFull()) {
            increaseCapacity();
        }
    }

    String toString() {
        
        return "==" + theaterName + "==\n" + "1.) " + TheaterMember.toString()
    }

}
