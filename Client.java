public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        //method is to create some prototypes and put in registry

        Student july23Beginner = new Student();
        july23Beginner.setBatch("July 23 Beginner Morning");
        july23Beginner.setAverageBatchPsp(91);
        july23Beginner.setAge(35);

        studentRegistry.register("july23Beginner", july23Beginner);

        IntelligentStudent isFromJuly23Beginner = new IntelligentStudent();
        isFromJuly23Beginner.setIq(200);
        isFromJuly23Beginner.setIntelligentScore(100);

        studentRegistry.register("isFromJuly23Beginner", isFromJuly23Beginner);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        fillRegistry(studentRegistry);

        Student ganesh = studentRegistry.get("july23Beginner").clone();
        ganesh.setName("Ganesh");
        ganesh.setAge(29);
        ganesh.setStudentPsp(73);

        Student nithin = studentRegistry.get("isFromJuly23Beginner").clone();
        nithin.setAge(25);
        nithin.setName("Nithin");
        nithin.setStudentPsp(70);

        System.out.println();
    }
}
