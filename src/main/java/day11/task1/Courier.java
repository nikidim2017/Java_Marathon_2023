package day11.task1;

public class Courier implements Worker {

    private int salary;

    private boolean isPaid;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse, int salary, boolean isPaid) {
        this.warehouse = warehouse;
        this.salary = salary;
        this.isPaid = isPaid;

    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPaid=" + isPaid +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrdersIncrement();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPaid) {
            System.out.println("Бонус уже был выплачен");
        } else {
            salary += 50000;
            isPaid = true;
        }
    }
}
