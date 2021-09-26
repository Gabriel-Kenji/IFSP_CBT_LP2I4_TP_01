//Gabriel Kenji Utiyama CB3012069
public class TestStaff {
    public static void main(String[] args) {
            
        Staff s = new Staff("jo","algum lugar","escola1", 1900.30);

        System.out.println("Name: "+ s.getName());
        System.out.println("Address: "+ s.getAddress());
        System.out.println("School: "+ s.getSchool());
        System.out.println("Pay: "+ s.getPay());
       

        s.setAddress("algum lugar 2");
        s.setSchool("escola2");
        s.setPay(2000.50);



        System.out.println(s.toString());
    }
}
