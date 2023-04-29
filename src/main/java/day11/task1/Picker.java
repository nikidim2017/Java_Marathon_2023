package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPaid;
    private Warehouse warehouse;


    public Picker(Warehouse warehouse, int salary, boolean isPaid) {
        this.warehouse = warehouse;
        this.salary = salary;
        this.isPaid = isPaid;

    }

    public int getSalary() {
        return salary;
    }

    public boolean isPaid() {
        return isPaid;
    }


    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPaid=" + isPaid +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrdersIncrement();
    }

    @Override

    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPaid) {
            System.out.println("Бонус уже был выплачен");
        } else {
            salary += 50000;
            isPaid = true;
        }
    }
}
