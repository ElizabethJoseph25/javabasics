package unit1_fundementals.sec14_composition;

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setCourse( new Course());
        /* as method is declared in student is public we can easily acces them using objects directly.
         */

        s1.getCourse().title = "Computer";       //we can access these variables indirectly.
        s1.getCourse().level = "Undergraduate";
        s1.getCourse().startDate = "18/10/21";



        s1.setName("Elizabeth");
        System.out.println("Name is: " + s1.getName());

        s1.setDateOfBirth("25/04/1999");
        System.out.println("date of birth: " + s1.getDateOfBirth());

        s1.hasStudentHousing(false);
        System.out.println("Has student housing?: " + (s1.getStudentHousing()? "Yes": "No")); //ternary operator

        System.out.println("The student " + s1.getName() + " is enrolled for " + s1.getCourse().title + " course due to start on " + s1.getCourse().startDate);




    }
}
