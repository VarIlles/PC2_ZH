import java.util.ArrayList;

public class Timetable {
    ArrayList<String> courseNames = new ArrayList<>();
    ArrayList<String> timeStamps = new ArrayList<>();


    public void newCourse(String course){
        if (courseNames.size() == 0) {
            courseNames.add(course + " -");
        }
        else{
            courseNames.add("\n" + course + " -");
        }
    }

    public void removeCourse(String course) {
        int index = courseNames.indexOf(course);
        courseNames.remove(index);
        timeStamps.remove(index);
    }

    public String getCourses(){
        ArrayList<String> courses = new ArrayList<>();

        for (int i = 0; i<courseNames.size(); i++){
            if (courses.size() != 0) {
                if (timeStamps.size() == courseNames.size()) {
                    courses.add("\r\n" +courseNames.get(i) +  timeStamps.get(i));
                }
                else{
                    courses.add("\r\n" + courseNames.get(i));
                }
            }
            else{
                if (timeStamps.size() == courseNames.size()) {
                    courses.add(courseNames.get(i) + timeStamps.get(i));
                }
                else{
                    courses.add(courseNames.get(i));
                }
            }
        }

        String format = courses.toString().replace("[", "");
        format = format.replace("]", "");



        System.out.println(format);

        return format;
    }





}
