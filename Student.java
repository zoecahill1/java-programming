public class Student extends Person{

    private String[] classes;

	// inheritence - from super class 
    public Student(String n, int a, String[] c){
        super(n, a);
        this.classes = c;
    }

    public String toString(){
		// call super to string class in person.java file
        String repr = super.toString() + "\nCLASSES: \n";
        for(int i=0; i<classes.length; i++){
            repr += classes[i] + "\n";
        }
        return repr;
    }

    public static void main(String[] args){
        String[] classes = new String[] {"Introduction to Maths", "Management for Computing", "Programming 1"};
        Student s = new Student("Pramod", 58, classes);
		// have to use setter method
        s.setAge(59);
        System.out.println(s);
    }


}