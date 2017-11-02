public class Main {
    public static void main(String args[]){

        Monster szkielet = new Skeleton(100,100, 10, 10, 1.0, 1, "Szkielet", 5, 10, 0, 20, 5, 20, 5, 30);

        System.out.println(szkielet.getNameOfTheMonster());

        System.out.println(szkielet.getHealthStatusBar()); //Ziom się już nie rodzi bez życia :D
        System.out.println(szkielet.getManaStatusBar());

        System.out.println(szkielet.takeDamage(5));
        System.out.println(szkielet.getHealthStatusBar());
        System.out.println(szkielet.takeDamage(95));
        System.out.println(szkielet.getHealthStatusBar());

        //System.out.println(szkielet.dealDamage(5));
    }
}
