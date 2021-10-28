package unit1_fundementals.sec14_composition;

public class Student
{
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;

    private Course course;
    /* as we have made this private we're going to need a
     setCourse method. */

    public void setCourse(Course course)
    {
        this.course = course;
    }

    public Course getCourse()   //passing the object to main method
    {
        return course;
    }


    public void setName(String name)
    {
        this.name = name;        //this refers to current object which is used to call this method
    }

    public String getName()
    {

        return this.name;
    }

    public void setDateOfBirth(String dateOfBirth)
    {

        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth()
    {

        return this.dateOfBirth;
    }

    public void hasStudentHousing(boolean hasStudentHousing)
    {

        this.hasStudentHousing = hasStudentHousing;
    }

    public boolean getStudentHousing()
    {

        return this.hasStudentHousing;
    }

}
