public class Exam_06 {
    public static void main(String[] args) {

        Exam_05 ex = new Exam_05(); //10, 20
        Exam_05 ex1 = new Exam_05(100);//100, 20
        Exam_05 ex2 = new Exam_05(100, 200);//100, 200

        ex.disp();
        ex1.disp();
        ex2.disp();

    }
}
