
public class Player {
<<<<<<< HEAD
    String Name;
    int age, rating;
    double stat;
    String type;

    Player(String name, String type, int years, double stat, int ratting) {
        Name = name;
        this.type = type;
        age = years;
        this.stat = stat;
        rating = ratting;
    }

    public void getPlayerDetails() {
        System.out.println(" Name :" + Name + "/n Age :" + age + "/n Type :" + type);
    }
}