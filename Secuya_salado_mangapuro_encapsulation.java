package secuya_salado_mangapuro_encapsulation ;

@author 1styrGroupB
 */
public class Secuya_salado_mangapuro_encapsulation {

    @param args the command line arguments
     */
    public static void main(String[] args) {
        Student p1 = new Student();
    
        p1.setName("Jesamae Salado");
        p1.setAge(20);
        p1.setGender("Female");
        p1.setCourse("C CT 2");
            System.out.println("Hi! "+ " my name is "+ p1.getName()+ " I am " + p1.getAge()+ " years old, "+ p1.getGender()+ " and I am a " + p1.getCourse() + " student.");
            
        Student p2 = new Student();
        p2.setName("Christina Mangapuro");
        p2.setAge(20);
        p2.setGender("Female");
        p2.setCourse("C CT 2");
            System.out.println("Hi! "+ " my name is "+ p2.getName()+ " I am " + p1.getAge()+ "years old, "+ p2.getGender()+ " and I am a " + p2.getCourse() + " student.");
            
        Student p3 = new Student();    
        p3.setName("Ara Mae Secuya");
        p3.setAge(20);
        p3.setGender("Female");
        p3.setCourse("C CT 2");
            System.out.println("Hi! "+ " my name is "+ p3.getName()+ " I am " + p1.getAge()+ "years old, "+ p3.getGender()+ " and I am a " + p3.getCourse() + " student.");
    }
}