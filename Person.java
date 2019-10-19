public class Person {
   // private var can't be accessed outside of class
   private String name;
   private int age;

   public Person(String n, int a){
      this.name = n;
      this.age = a;
   }

	// system.out.println automaticlly calls to string
   public String toString(){
       return "Name:" + this.name + " Age: " + this.age;
   }

   public void setAge(int n){
       if (n < 0){
           // took out to not modify age
           return;
       }
       this.age = n;

    }
}