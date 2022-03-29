public class student {
    private int GPA;
    private String Firstname;
    private String Lastname;
    private String Major;
    private static int Totalstudents;
    private boolean Honorroll;

    public static void main(String{} args) {
        Student Me = new student(5.0, "Alexander", "Worrell", "53");
        System.out.println(Me.Firstname);
    }
    public student(int GPA, String Firstname, String Lastname, String Major) {
         this.GPA = GPA;
         this.Firstname = Firstname;
         this.Lastname = Lastname;
         this.Major = Major;
         student.Totalstudents += 1;
         if (GPA >=3.0 ){
             Honorroll = true;
         }   else {
             Honorroll = false;
         }
    }
    public int getGPA() {
    return GPA;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getMajor() {
        return Major;
    }

    public boolean isHonorroll() {
        return Honorroll;
    }
    public static int getTotalstudents()  {
        return Totalstudents;
    }
    public static boolean Totalstudents(int Peers) {
        if (Totalstudents < Totalstudents) {
            return false;
        } else {
            return true;
        }
}
