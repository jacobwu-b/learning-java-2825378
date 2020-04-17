public class Student {
  String firstName;
  String lastName;
  int classOf;
  double GPA;
  String major;

  public Student(String firstName, String lastName, int classOf, double GPA, String major) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.classOf = classOf;
    this.GPA = GPA;
    this.major = major;
  }

  public String info() {

    return "Student " + this.firstName + " " + this.lastName + " is a member of the class of " + String.valueOf(this.classOf) + ". He is a " + this.major + " major with a GPA of " + String.valueOf(this.GPA) + ".";
  } 
}