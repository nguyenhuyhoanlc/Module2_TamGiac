public class TriangleClassifier {

    public static final String NOT_TRIANGLE = "Not triangle";
    public static final String EQUILATERAL_TRIANGLE = "Equilateral triangle";
    public static final String ISOSCELES_TRIANGLE = "Isosceles triangle";
    public static final String NORMAL_TRIANGLE = "Normal triangle";

    public static String checkTriangle(int side1, int side2, int side3){
        String classify = "";
        boolean isNotTriangle = (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1);
        boolean allSidesEqual = (side1 == side2 && side1 == side3);
        boolean twoSidesEqual = (side1 == side2) || (side1 == side3) || (side2 == side3);

        if (isNotTriangle){
            classify = NOT_TRIANGLE;
        }
        else if (allSidesEqual) {
            classify = EQUILATERAL_TRIANGLE;
        }
        else if (twoSidesEqual){
            classify = ISOSCELES_TRIANGLE;
        }
        else {
            classify = NORMAL_TRIANGLE;
        }

        return classify;
    }
}
