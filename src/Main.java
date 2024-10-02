
interface Animal {
    void eat();
    void drink();
    void sleep();
    void workout();
}
 class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("The Lion is eating.");
    }

    @Override
    public void drink() {
        System.out.println("The Lion is drinking.");
    }

    @Override
    public void sleep() {
        System.out.println("The Lion is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println("The Lion is working out.");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.drink();
        lion.sleep();
        lion.workout();
    }
}
