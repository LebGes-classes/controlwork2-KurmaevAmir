public class Main { // Variant 3
    public static void main(String[] args) {
        int numberStudents = 10;
        Student[] queue = new Student[numberStudents];
        for (int i = 0; i < numberStudents; i++) {
            if (i % 2 == 0) {
                queue[i] = new ITIS();
            } else {
                queue[i] = new IVMiIT();
            }
        }

        for (Student student : queue) {
            student.makeProgramming();
            student.makeElecEngineering();
            System.out.println("Баллы студента: " + student.getPoints());
        }
        Student temp;
        for (int j = 0; j < queue.length; j++) {
            for (int i = 0; i < queue.length - 1; i++) {
                if (queue[i].getPoints() > queue[i + 1].getPoints()) {
                    temp = queue[i + 1];
                    queue[i + 1] = queue[i];
                    queue[i] = temp;
                }
            }
        }
        int number = (numberStudents * 25) / 100;
        int ITISStudent = 0;
        int IVMiITStudent = 0;
        for (int i = 0; i < number; i++) {
            if (queue[i] instanceof ITIS) {
                ITISStudent++;
            } else {
                IVMiITStudent++;
            }
        }
        System.out.println("ИТИС: " + ITISStudent);
        System.out.println("ИВМиИТ: " + IVMiITStudent);
    }
}
