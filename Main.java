public class Main {
    public static void main(String args[]){

        Monster szkielet = new Skeleton(100,100, 30, 30, 1.0, 1, "Szkielet", 5, 10, 0, 20, 5, 20, 5, 30);

        System.out.println("Nazwa zioma: " + szkielet.getNameOfTheMonster());

        System.out.println("Ziom ma: " + szkielet.getHealthStatusBar() + " zycia"); //Ziom się już nie rodzi bez życia :D
        System.out.println("Ziom ma: " + szkielet.getManaStatusBar() + " many");

        System.out.println(szkielet.takeDamage(5));
        System.out.println(szkielet.getHealthStatusBar());
        System.out.println(szkielet.takeDamage(85));
        System.out.println(szkielet.getHealthStatusBar());

        System.out.println();
        System.out.println("Ziomek ma: " + szkielet.getMana() + " many");
        System.out.println("Ziomek Ci zajebał: " + szkielet.physicalAttack(5, 10) + " punktów obrażeń");
        System.out.println();

        System.out.println(szkielet.useMagic(15, 30));

        System.out.println();
        System.out.println("Ziomek ma: " + szkielet.getMana() + " many");
        System.out.println(szkielet.testMany());

    }
}
