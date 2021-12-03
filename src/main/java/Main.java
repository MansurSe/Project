import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {




        University unv = new University();
        unv.setId("001");
        unv.setFullName("SDU");
        unv.setShortName("SDU");
        unv.setYearOfFoundation(1996);
        unv.setMainProfile(StudyProfile.Engineering);
        System.out.println(unv);

        Student std = new Student();
        std.setFullName("Ivan Ivanov");
        std.setAvgExamScore((float)4.5);
        std.setUniversityId("001");
        System.out.println(std);



    }
}
