package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02_Functional {
    public static void main(String[] args) {
        var numbers = List.of(1,2,4,5,6,7,8);
        List<String> courses = List.of("Spring", "Spring boot","docker","kubernetes","aws");
       // printAllNumbersInAListFunctionally(numbers);
//        printAllEvenNumbersInAListFunctionally(numbers);
//        printAllOddNumbersInAListFunctionally(numbers);
//        printAllCoursesFunctionally(courses);
//        System.out.println("#################");
        //printCourseWhichStartsFromSpring(courses);
        printCharacterLengthInEachCourse(courses);
//        System.out.println("#################");
       // printCoursesWhichHasFourLettersAtleast(courses);
        System.out.println(printCourseLengthFromList(courses));
    }

    private static List<Integer> printCourseLengthFromList(List<String> course) {
        return course.stream()
                .map(courseFromStream -> courseFromStream.length())
                .collect(Collectors.toList());
    }

    private static void printCoursesWhichHasFourLettersAtleast(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() > 3)
                .forEach(System.out::println);
    }


    //non static method
    public void getResullt(String course) {
        System.out.println("hello " + course);
    }

    private static void printCourseWhichStartsFromSpring(List<String> courses) {
        //invoking non static method from lambdas
        courses.forEach(new FP02_Functional()::getResullt);
        System.out.println("next stream invocation");
        courses.stream()
                .filter(course -> course.toUpperCase().contains("SPRING"))
                .forEach(System.out::println);
    }

    private static void printAllCoursesFunctionally(List<String> courses) {
        courses.forEach(System.out::println);
    }

//    private static void print(int number) {
//        System.out.println(number);
//    }

//    private static boolean isEven(int number) {
//        return number%2==0;
//    }
    private static void printAllNumbersInAListFunctionally(List<Integer> integers) {
        integers.stream()
                .forEach(System.out::println);
    }

    private static void printAllEvenNumbersInAListFunctionally(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);
    }

    private static void printAllOddNumbersInAListFunctionally(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2 != 0)
                .forEach(System.out::println);
    }
    private static void printAllSquareOfEvenNumbersInAListFunctionally(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2 == 0)
                .map(evenNumber -> evenNumber * evenNumber)
                .forEach(System.out::println);
    }
    private static void printAllCubeOfEvenNumbersInAListFunctionally(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2 == 0)
                .map(oddNumber -> oddNumber * oddNumber * oddNumber)
                .forEach(System.out::println);
    }
    private static void printCharacterLengthInEachCourse(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }
}
