enum Grade {
    A, B, C, D, F
}

enum Gender{
    Female, Male
}

enum Season{
    Summer, Autumn, Rainy, Winter
}

public class Enum101 {

    public static void main(String[] args) {
        // // option
        // final char GRADE_A = 'A';
        // final char GRADE_B = 'B';
        // final char GRADE_C = 'C';
        // final char GRADE_D = 'D';
        // final char GRADE_F = 'F';
        
        // process
        Grade myGrade = Grade.F;
        for (Grade item : Grade.values()) {
            System.out.println(item);
        }
        
        Season myFavSeason = Season.Autumn;
        System.out.println("I like " + myFavSeason + " Season");
    }
}