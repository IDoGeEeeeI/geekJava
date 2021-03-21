package oop;
public class Less5 {
    public static class Employee{
        private final String fullName;
        private final String position;
        private final String email;
        private final String cellphone;
        private final float salary;
        private final int age;

        public Employee(String fullName, String position, String email, String  cellphone, float salary, int age){
            this. fullName=fullName;
            this.position = position;
            this.email=email;
            this.cellphone=cellphone;
            this.salary=salary;
            this.age= age;
        }

        public  void setInformation(){
            System.out.println(fullName);
            System.out.println(position);
            System.out.println(email);
            System.out.println(cellphone);
            System.out.println(salary);
            System.out.println(age);
        }

    }
    public static void main(String[] args) {
        Employee personArray[] = new Employee[5];
        personArray[0]= new Employee("Василий","middle developer","foo3@gfda","89432160329",40000,31);
        personArray[1]= new Employee("Иван","middle developer","foo2@gfda","892776011719",40000,40);
        personArray[2]= new Employee("Николай","senior developer","foo1@gfda","89273162599",90000,41);
        personArray[3]= new Employee("Петр","junior developer","foo4@gfda","89275432219",25000,25);
        personArray[4]= new Employee("Арсений","junior developer","foo5@gfda","89289463199",25000,34);


        for (int i=0;i< personArray.length;i++){
            System.out.println();
            if (personArray[i].age>=40) {
                personArray[i].setInformation();
            }
        }
    }

}
