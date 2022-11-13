package programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
    private String CourseName;
    private String category;
    private int courseRating;
    private int studentCount;

    public Course(){

    }
    public Course(String courseName, String category, int courseRating, int studentCount) {
        CourseName = courseName;
        this.category = category;
        this.courseRating = courseRating;
        this.studentCount = studentCount;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(int courseRating) {
        this.courseRating = courseRating;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", category='" + category + '\'' +
                ", courseRating=" + courseRating +
                ", studentCount=" + studentCount +
                '}';
    }


}
public class FP_05 {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("Spring","Framework",98,10000));
        courseList.add( new Course("Spring boot","Framework",99,10900));
//                new Course("Microservices","Architecture",96,20000),
//                new Course("Azure","Cloud",94,40000),
//                new Course("Docker","Cloud",97,20000),
//                new Course("Kubernetes","Cloud",93,450000)
        List<String> courses = List.of("spring","springboot","hibernate","jpa","jdbc","aws");
        List<String> courses2 = List.of("spring","springboot","hibernate","jpa","jdbc","docker");
       var res =  courses.stream()
                .flatMap(course -> courses2.stream()
                        .filter(cou2 -> cou2.length() == course.length())
                        .map(course2 -> List.of(course,course2)))
                .filter(cour -> !cour.get(0).equals(cour.get(1)))
                .collect(Collectors.toList());

        Predicate<Course> courseGreateThan92Predicate = course -> course.getCourseRating() > 92;
//        System.out.println(courseList.stream().allMatch(courseGreateThan92Predicate));
//        System.out.println(courseList.stream().noneMatch(courseGreateThan92Predicate));
//        System.out.println(courseList.stream().anyMatch(courseGreateThan92Predicate));
        Comparator<Course> compareByNumberOfStudents = Comparator.comparing(Course::getStudentCount);
        Comparator<Course> compareByNumberOfStudentsDesc = Comparator.comparing(Course::getStudentCount).reversed();
        //System.out.println(courseList.stream().sorted(compareByNumberOfStudents).toList());
        //System.out.println(courseList.stream().sorted(compareByNumberOfStudentsDesc).toList());
        Comparator<Course> compareByStudentSizeAndCourseRating = Comparator.comparingInt(Course::getStudentCount)
                .thenComparing(Course::getCourseRating).reversed();
        //System.out.println(courseList.stream().sorted(compareByStudentSizeAndCourseRating).skip(1).limit(2).collect(Collectors.toList()));
//        try {
//            var course = courseList.stream().filter(course1 -> course1.getCourseRating() > 97).toList();
//            course.add(new Course("testCourse","test",3,90000));
//            System.out.println(course);
//
//        } catch (Exception e) {
//            System.out.println("exception occured" + e.getMessage());
//
//        }
//        var course1 = courseList.stream().filter(course2 -> course2.getCourseRating() > 97).collect(Collectors.toList());
//        course1.add(new Course("testCourse2","test2",3,80000));
//        System.out.println(course1);
//        courseList.sort(Comparator.comparing(Course::getCategory, Comparator.nullsLast(Comparator.reverseOrder())));
//        System.out.println(new ArrayList<>(courseList));
//        System.out.println(courseList.stream()
//        .max(compareByNumberOfStudents).orElse(new Course("how to code in java","java",10,90)));
//        System.out.println(courseList.stream()
//                .min(compareByNumberOfStudents).orElse(new Course("how to code in java","java",10,90)));
//        System.out.println(courseList.stream().filter(course -> course.getCourseName()
//                .equalsIgnoreCase("Spring boot")).findFirst().orElse(new Course()));
//        System.out.println(courseList.stream().filter(course -> course.getCourseName()
//                .equalsIgnoreCase("Spring boot")).findAny().orElse(new Course()));
//        System.out.println(courseList.stream().filter(course -> course.getCourseRating() > 97)
//                .mapToInt(Course::getStudentCount)
//                .sum()
//        );
//        System.out.println(courseList.stream().filter(course -> course.getCourseRating() > 97)
//                .mapToInt(Course::getStudentCount)
//                .average()
//        );
//        System.out.println(courseList.stream().filter(course -> course.getCourseRating() > 97)
//                .mapToInt(Course::getStudentCount)
//                .count()
//        );
//        System.out.println(courseList.stream().filter(course -> course.getCourseRating() > 97)
//                .mapToInt(Course::getStudentCount)
//                .max()
//        );
//        System.out.println(courseList.stream().filter(course -> course.getCourseRating() > 97)
//                .mapToInt(Course::getStudentCount)
//                .min()
//        );
//        System.out.println(courseList.stream()
//        .collect(Collectors.groupingBy(Course::getCategory)));
//        System.out.println(courseList.stream()
//                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
//
//        System.out.println(courseList.stream()
//        .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getCourseRating))))
//        );
//
//        System.out.println(courseList.stream()
//        .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getCourseName, Collectors.toList())))
//        );
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(898);
//        numbers.add(987);
//        numbers.add(6);
//        //System.out.println(numbers.stream().takeWhile(number -> number > -1).collect(Collectors.toList()));
//        System.out.println(numbers.stream());

    Predicate<Course> getCourseWhichHaveReviewScoreGreaterThan95 = getCoursePredicateBasedOnRating(95);
    Predicate<Course> getCourseWhichHaveReviewScoreGreaterThan98 = getCoursePredicateBasedOnRating(98);
    List<Course> courses1 = List.of(new Course("Hello java","dd",98,98),
        new Course("name","dd",12,90)
    );

        courses1.stream().filter(getCourseWhichHaveReviewScoreGreaterThan95).forEach(course -> System.out.println(course.getCourseName()));


    }
    //higher order functions , functions returns another functions
    public static Predicate<Course> getCoursePredicateBasedOnRating(int rating) {
        return course -> course.getCourseRating() > rating;
    }

    //[Course{CourseName='Spring boot', category='Framework', courseRating=99, studentCount=10900}, Course{CourseName='Spring', category='null', courseRating=98, studentCount=10000}]
}
