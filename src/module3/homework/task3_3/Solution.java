package module3.homework.task3_3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Course Java1 = new Course(new Date(), "Java 1");
        Course Java2 = new Course(35, "Java 2", "Baranovskiy Pavlo");
        Course Java3 = new Course(40, "Java 3", "Savik Shuster");
        Course Java4 = new Course(new Date(), "Java 4");
        Course QA1 = new Course(15, "QA 1", "Vasyl Pupkin");

        Course[] coursesTakenByClintonH = {Java1, QA1};
        Course[] coursesTakenByLeghornF = {Java2, Java3, QA1};
        Course[] coursesTakenByRitchieD = {Java4, QA1};

        Student Sheptytskyid = new Student("Denys", "Sheptytskyi", 5);
        Student ClintonH = new Student("Clinton", coursesTakenByClintonH);

        CollegeStudent GonzalesS = new CollegeStudent("Speedy", "Gonzales", 2);
        CollegeStudent LeghornF = new CollegeStudent("Leghorn", coursesTakenByLeghornF);
        CollegeStudent PorkyP = new CollegeStudent("GoIT", 10, 65535);

        SpecialStudent GoslingJ = new SpecialStudent("James", "Gosling", 5);
        SpecialStudent RitchieD = new SpecialStudent("Ritchie", coursesTakenByRitchieD);
        SpecialStudent BhattA = new SpecialStudent("Ajay", "Bjatt", 5, 123456789);


        System.out.println("Sheptytskyi's group is: " + Sheptytskyid.getGroup());
        BhattA.setEmail("BhattA@gmail.com");
        System.out.println("Bhatt's email is: " + BhattA.getEmail());
    }
}
