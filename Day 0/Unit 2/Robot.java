public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        setHallway(hallwayToClean);

        setPosition(startingPosition);
        this.isFacingRight = true;
    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallwayToClean) {

        for (int i = 0; i < hallwayToClean.length; i++) {
            if (hallwayToClean[i] < 0) {
                hallwayToClean[i] = 0;
            }
        }
        this.hallway = hallwayToClean;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        if (position < 0) {
            this.position = 0;
        } else if (position >= hallway.length) {
            this.position = hallway.length - 1;
        } else {
            this.position = position;
        }

    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (isFacingRight && position == hallway.length - 1) {
            return true;
        }

        if (isFacingRight == false && position == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            hallway[position] = hallway[position] - 1;
        }

        if (hallway[position] > 0) {
            return;
        }

        if (hallway[position] == 0) {
            if (isRobotBlockedByWall() == false) {
                if (isFacingRight) {
                    position = position + 1;
                } else {
                    position = position - 1;
                }
            } else {
                isFacingRight = !isFacingRight;
            }
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;

        displayState();

        while (hallIsClear() == false) {
            move();
            count += 1;
            displayState();
        }
        // to-do: implement this method

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        int test = 0;
        for (int i = 0; i < hallway.length; i++) {
            test = test + hallway[i];
        }

        if (test == 0) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        String hall = "";
        for (int i = 0; i < hallway.length; i++) {
            int num = hallway[i];
            hall = hall + num;
            if (i < hallway.length - 1) {
                hall = hall + " ";
            }
        }

        String robotString = "";
        for (int i = 0; i < position; i++) {
            robotString = robotString + " ";
        }

        if (isFacingRight) {
            robotString = robotString + ">";
        } else {
            robotString = robotString + "<";
        }

    }
}
