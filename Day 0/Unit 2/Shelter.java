import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and Cols must be greater than 0.");
        }
        kennels = new Dog[rows][cols];
        // to-do: implement this constructor
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }

        boolean placed = false;

        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    placed = true;
                    return;
                }
            }
            if (placed) {
                return;
            }
        }

        if (!placed) {
            System.out.println("No empty kennels!");
        }
        // to-do: implement this method
    }

    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }
        if (row < 0 || row >= kennels.length || col < 0 || col >= kennels[row].length) {
            throw new IllegalArgumentException("Wrong index");
        }

        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }

        // to-do: implement this method
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }
        for (int i = 0; i < animals.size(); i++) {
            add(animals.get(i));
        }

        // to-do: implement this method
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || row >= kennels.length || col < 0 || col >= kennels[row].length) {
            throw new IllegalArgumentException("Wrong Index");
        }

        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("No dog in kennel");
        }

        Dog adopted = kennels[row][col];
        kennels[row][col] = null;
        return adopted;

    }

    public ArrayList<Dog> search(String name) {

        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        ArrayList<Dog> result = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] != null && kennels[i][j].getName().equals(name)) {
                    result.add(kennels[i][j]);
                }
            }
        }
        // to-do: implement this method
        return result;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        ArrayList<Dog> result = new ArrayList<Dog>();

        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] != null && kennels[i][j].getAge() == age) {
                    result.add(kennels[i][j]);
                }
            }
        }

        return result;

    }
}
