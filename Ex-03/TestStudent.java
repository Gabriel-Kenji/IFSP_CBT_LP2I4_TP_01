//Gabriel Kenji Utiyama CB3012069
public class TestStudent {
    public static void main(String[] args) {
            
        Student s = new Student("jo","algum lugar","teste1",2020, 1900.30);

        System.out.println("Name: "+ s.getName());
        System.out.println("Address: "+ s.getAddress());
        System.out.println("Program: "+ s.getProgram());
        System.out.println("Year: "+ s.getYear());
        System.out.println("Fee: "+ s.getFee());
       

        s.setAddress("algum lugar 2");
        s.setProgram("teste2");
        s.setYear(2021);
        s.setFee(2000.50);

        System.out.println(s.toString());
    }
}
