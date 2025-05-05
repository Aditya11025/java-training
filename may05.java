class student {
    String name;
    int rollno;
    int marks;

    student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    void display() {
        System.out.println("name: " + name + " rollno: " + rollno + " marks: " + marks);
    }
}
 class may05 {
    public static void main(String[] args) {
        student s1 = new student("ram", 101, 90);
        s1.display();
    }
}