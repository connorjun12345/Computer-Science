public abstract class Animal {
    private int age;
    private boolean isHungry;

    public void eat() {
        isHungry = false;
    }

    public void getOlder() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public abstract void makeNoise();

}