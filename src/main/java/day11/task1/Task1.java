package day11.task1;

public class Task1 {
    public static void main(String[] args) {


        Warehouse warehouse_1 = new Warehouse();
        Courier courier_1 = new Courier(warehouse_1, 0, false);
        Picker picker_1 = new Picker(warehouse_1, 0, false);
        Courier courier_2 = new Courier(warehouse_1, 0, false);
        Picker picker_2 = new Picker(warehouse_1, 0, false);


        Warehouse warehouse_2 = new Warehouse();
        Courier courier_3 = new Courier(warehouse_2, 0, false);//
        Picker picker_3 = new Picker(warehouse_2, 0, false); //

        businessProcess(courier_1);
        businessProcess(picker_1);
        businessProcess(courier_2);
        businessProcess(picker_2);

        System.out.println("Количество доставленных заказов: " + warehouse_1.getCountDeliveredOrders() + "; " + "Зарплата курьера: " + courier_1.getSalary());
        System.out.println("Количество доставленных заказов: " + warehouse_1.getCountDeliveredOrders() + "; " + "Зарплата курьера: " + courier_2.getSalary());
        System.out.println("Количество собранных заказов: " + warehouse_1.getCountPickedOrders() + "; " + "Зарплата сборщика: " + picker_1.getSalary());
        System.out.println("Количество собранных заказов: " + warehouse_1.getCountPickedOrders() + "; " + "Зарплата сборщика: " + picker_2.getSalary());

        courier_1.bonus();

        System.out.println("------------------");

        courier_3.doWork();
        picker_3.doWork();
        System.out.println("Количество доставленных заказов: " + warehouse_2.getCountDeliveredOrders() + "; " + "Зарплата курьера: " + courier_3.getSalary());
        System.out.println("Количество собранных заказов: " + warehouse_2.getCountPickedOrders() + "; " + "Зарплата сборщика: " + picker_3.getSalary());

        courier_3.bonus();

    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
