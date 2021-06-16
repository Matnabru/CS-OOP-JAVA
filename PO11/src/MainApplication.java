public class MainApplication {
    public static void main(String[] args){
        Module module1 = new Module(1337);

        //1. Moving module into slot
        Slot slot1 = new Slot(1337);
        System.out.println(slot1.toString());
        slot1.switchPower(); //3. Turing on power (switching)
        System.out.println("\nPower on");
        System.out.println(slot1.toString());
        slot1.removeModule(); //2. Removing module
        System.out.println("\nRemoved");
        System.out.println(slot1.toString());


        System.out.println("\nShelf");
        Slot slot2 = new Slot(1336);
        Slot slot3 = new Slot(999);
        slot3.switchPower();
        Shelf shelf = new Shelf();
        shelf.addSlot(slot1); // This is null (removed module from existing slot)
        shelf.addSlot(slot2);
        shelf.addSlot(slot3);
        System.out.println(shelf.toString());

        // 4. Print one module type from shelf
        System.out.println(shelf.printSlotType(1336));

        // 5. Print only powered off modules
        System.out.println("Powered off");
        System.out.println(shelf.printPower(false));

        System.out.println("Powered on");
        System.out.println(shelf.printPower(true));

        System.out.println("All");
        System.out.println(shelf.printPower());
    }
}
