package secuya_salado_mangapuroo_encapsulation;

    @author 1styrGroupB

    public class Student {
        String name;
        int age;
        String gender;
        String course;
        
        public void setAge(int newAge){
            age = newAge;
        }
        public int getAge(){
            return age;
        }
        public void setName(String newName){
            name = newName;
        }
        public String getName(){
            return name;
        }
        public void setGender(String newGender){
            gender = newGender;
        }
        public String getGender(){
            return gender;
        }
        public void setCourse(String newCourse){
        course = newCourse;
        }
        public String getCourse(){
            return course;
        }
}
