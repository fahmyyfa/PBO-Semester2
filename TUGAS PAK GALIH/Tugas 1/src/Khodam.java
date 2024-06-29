public class Khodam {
    public String name = "Sasuka";
    public int age = 19;
    public String strength = "lightning element";
    public String weakness = "Earth element";
    public double power = 1000.00;
    public String skill = "Chidori";
    public String Shield = "Susanoo";
    public String ultimate = "Sharinggan";

    public void profil() {
        System.out.println("your hero's name: " + name);
        System.out.println("your hero's age: " + age);
        System.out.println("the power of your hero: " + power);
        System.out.println("your hero's strengths: " + strength);
        System.out.println("your hero's weakness: " + weakness);
    }

    public void fight() {
        System.out.println("attack the enemy with your skill!" + "\n" + skill);
        System.out.println("Summon your Shield!" + "\n" + Shield);
        System.out.println("attack the enemy with your ulti!" + "\n" + ultimate);
    }
}