class student {
  int rollno;
  int marks;
  String name;
}

public class arr3 {
  public static void main(String[] args) {
    student s1 = new student();
    s1.name = "riddhesh";
    s1.rollno = 58;
    s1.marks = 90;
    student s2 = new student();
    s2.name = "sarvesh";
    s2.rollno = 57;
    s2.marks = 91;
    student s3 = new student();
    s3.name = "tanmay";
    s3.rollno = 53;
    s3.marks = 93;

    student students[] = new student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].name + "" + students[i].marks);
    }

    // int nums[] = new int[6];
    // nums[0] = 4;
    // nums[1] = 5;
    // nums[2] = 6;
    // nums[3] = 7;

    // for (int i = 0; i < 7; i++) {
    // System.out.println(nums[i]);
  }
}
