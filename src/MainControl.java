public class MainControl {

//Attribute
    //Referenzen
    private Person person1;
    private Person person2, person3;

    public static void main (String[] args) {
       // halloWelt();
        new Person("David Gregory Glusmann", 16);
        new Person("Yener Varli", 16);
        new Person("Bilal El Hawari", 17);
    }
    public MainControl(){
        person1 = new Person ("David Gregory Glusmann", 16);
        person2 = new Person ("Yener Varli", 16);
        person3 = new Person ("Bilal El Hawari", 17);
        //person3 = new Person ("Sabine", 15);
        person1.halloSagen();
        System.out.println(person1);
        System.out.println(person2);
    }


}