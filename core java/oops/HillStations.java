package oops;

public class HillStations {
    public void location() {
        // Method to be overridden by the child classes
        System.out.println("Location of the hill station.");
    }

    public void famousFor() {
        // Method to be overridden by the child classes
        System.out.println("Famous for its scenic beauty.");
    }
}
class Gulmarg extends HillStations {
    // Overriding the methods of the parent class
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir, India.");
    }

    @Override
    public void famousFor() {
        // Overriding the methods of the parent class
        System.out.println("Gulmarg is famous for its skiing resorts and natural beauty.");
    }
}

class Manali extends HillStations {
    // Overriding the methods of the parent class
    @Override
    public void location() {
        // Overriding the methods of the parent class
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }

    @Override
    public void famousFor() {
        // Overriding the methods of the parent class
        System.out.println("Manali is famous for its snow-covered mountains.");
    }
}

class Mussoorie extends HillStations {
    // Overriding the methods of the parent class
    @Override
    public void location() {
        // Overriding the methods of the parent class
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }

    @Override
    public void famousFor() {
        // Overriding the methods of the parent class
        System.out.println("Mussoorie is famous for its colonial heritage and religious sites.");
    }
}

class MainFunction {
    public static void main(String[] args) {
        // Creating objects of the child classes
        HillStations hillStation = new HillStations();
        hillStation.location();
        hillStation.famousFor();

        HillStations manali = new Manali();
        // Calling the overridden methods
        manali.location();
        manali.famousFor();

        HillStations mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        HillStations gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}