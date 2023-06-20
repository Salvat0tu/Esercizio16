public class House {
    private String address;
    private int numberOfFloor;

    public House(String address, int numberOfFloor) {
        this.address = address;
        this.numberOfFloor = numberOfFloor;
        System.out.println("Your address for this house is " + address
                + "The house has " + numberOfFloor + " floors ");

    }
}
