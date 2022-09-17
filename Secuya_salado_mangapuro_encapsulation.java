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
    p2.setCourse("BSED");
        System.out.println("Hi! "+ " my name is "+ p2.getName()+ " I am " + p1.getAge()+ "years old, "+ p2.getGender()+ " and I am a " + p2.getCourse() + " student.");
        
    Student p3 = new Student();    
    p3.setName("Pia Meguizo");
    p3.setAge(23);
    p3.setGender("Female");
    p3.setCourse("Mass Com");
        System.out.println("Hi! "+ " my name is "+ p3.getName()+ " I am " + p1.getAge()+ "years old, "+ p3.getGender()+ " and I am a " + p3.getCourse() + " student.");
        
    Student p4 = new Student();    
    p4.setName("Leah Mangmang");
    p4.setAge(20);
    p4.setGender("Female");
    p4.setCourse("Criminology");
        System.out.println("Hi! "+ " my name is "+ p4.getName()+ " I am " + p1.getAge()+ "years old, "+ p4.getGender()+ " and I am a " + p4.getCourse() + " student.");
        
    Student p5 = new Student();
    p5.setName("Christy Toquero");
    p5.setAge(26);
    p5.setGender("Female");
    p5.setCourse("BSHRM");
        System.out.println("Hi! "+ " my name is " + p5.getName()+ " I am " + p1.getAge()+ " years old, "+ p5.getGender()+ " and I am a " + p5.getCourse() + " student.");
    }
    
    }