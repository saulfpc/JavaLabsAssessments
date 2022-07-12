package labs.labTwo;

public class exercise3 {

    String name;
    int year;

    public exercise3(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void displayVariables(){
        System.out.println("The name variable has value: " + name);
        System.out.println("The year variable has the value: " + year);
    }

    public static void main(String[] args) {
        exercise3 object = new exercise3("Jon Doe", 2022);
        object.displayVariables();
    }
}
