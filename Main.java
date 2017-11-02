public class Main {
    public static void main(String args[]){

        Monster szkielet = new Skeleton(100, 10, 1.0, 1, "Szkielet", 5, 10, 0, 20, 5, 20, 5, 30);

        System.out.println(szkielet.getHealth() + " " + szkielet.getHealthMax() + " " + szkielet.getHealthStatusBar());
        System.out.println(szkielet.getNameOfTheMonster());

        System.out.println(szkielet.takeDamage(1));
    }
}
