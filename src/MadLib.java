public class MadLib {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MadLib myStory = new MadLib();
    }//main method
    public MadLib(){
        System.out.println("Hello");
        String classmate = "Alessandro";
        String city = "New York City";
        String adjective = "Quickly";
        String noun = "Bread";
        String pluralNoun = "Footballs";
        String pluralAnimal = "Monkeys";
        Boolean trueOrFalse = true;
        double decimalBiggerThan1 = 1.4;
        int number1 = 7;
        int number2= 22;
        int wholeNumberBetween1And4 = 2;
        String miltonTeacher = "Ms.Lockwood";
        String miltonDean = "Mr.Furst";
        String gradeLetter = "A";
        String season = "Fall";
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +gradeLetter+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);



    }
}
