package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {


        if (first == 200 ||
                first == 300 ||
                first == 400 ||
                first == 600 ||
                first == 800 ||
                first == 900 ||
                first == 1200) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }

        if (second == 200 ||
                second == 300 ||
                second == 400 ||
                second == 600 ||
                second == 800 ||
                second == 900 ||
                second == 1200) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }


    }
}
