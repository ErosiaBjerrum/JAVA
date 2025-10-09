public class MyCats {

    Cat c1 = new Cat("Rødmand", 7);
    Cat c2 = new Cat("Trold", 6);
    Cat c3 = new Cat("Miv", 1);



    public void displayInfo() {
        System.out.println("Mine katte hedder " + c1.getName() + ", " + c2.getName()
                + " og " + c3.getName() + " og er henholdsvis " + c1.getAge() + ", " + c2.getAge()
                + " og " + c3.getAge() + " gamle.");

    }


}



