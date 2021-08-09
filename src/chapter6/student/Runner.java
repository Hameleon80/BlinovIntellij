package chapter6.student;

/**
 * Test entity students.
 * Ahtirskij Yuriy 09.08.2021
 */
public class Runner {
    public static void main(String[] args) {
        CorrespondenceStudent ivanov=new CorrespondenceStudent("Иванов Иван Иванович",
                "Харьков, пр.Ленина 25 кв.45", 9.5);
        ivanov.enroll("Харьковский политехнический институт", "Нанотехнологии",
                "Молекулярные нанотехнологии");
        System.out.println(ivanov);

    }
}
