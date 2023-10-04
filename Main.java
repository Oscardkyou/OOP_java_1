package OOP1.JavaOOP1;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person victor = new Person("Вася", 30);
        Person mary = new Person("Маша", 27);
        Person eugene = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person alex = new Person("Саша", 9);
        Person alexTen = new Person("Саша", 10);
        Person alexEleven = new Person("Саша", 11);
        Person alexTwelve = new Person("Саша", 12);
        Person alexThree = new Person("Саша", 3);
        GeoTree geoTree = new GeoTree();
        geoTree.appendParentChild(irina, victor); // Ирина родитель Васи
        geoTree.appendParentChild(irina, mary); // Ирина родитель Маши
        geoTree.appendParentChild(victor, eugene); // Вася родитель Жени
        geoTree.appendParentChild(victor, ivan); // Вася родитель Ивана
        geoTree.appendWifeHusband(irina, igor); // Ирина жена Игоря
        geoTree.appendParentChild(igor, victor); // Игорь родитель Васи
        geoTree.appendParentChild(igor, mary); // Игорь родитель Маши
        geoTree.appendParentChild(igor, alex); // Игорь родитель Саши
        geoTree.appendParentChild(igor, alexTen); // Игорь родитель Саши
        geoTree.appendParentChild(igor, alexEleven); // Игорь родитель Саши
        geoTree.appendParentChild(igor, alexThree); // Игорь родитель Саши        

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Research(geoTree).spend(irina, Relationship.parent));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research(geoTree).spend(igor, Relationship.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research(geoTree).spend(irina, Relationship.vife));

        
        // Adding some people for demonstration purposes
        System.out.println("Original order:");
        for (Node node : geoTree.getTree()) {
            System.out.println(node.getPerson());
        }
        System.out.println("\nSorted by name:");
        geoTree.sortByName();
        for (Node node : geoTree.getTree()) {
            System.out.println(node.getPerson());
        }
        System.out.println("\nSorted by birth date:");
        geoTree.sortByBirthDate();
        for (Node node : geoTree.getTree()) {
            System.out.println(node.getPerson());
        }

        System.out.println(new Research(geoTree).searchAge());
    }
}