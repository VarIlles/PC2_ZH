public class Scheduler extends Timetable{
    public void setTimestamp(String course, String timestamp){
        removeCourse(course);
        courseNames.add(courseNames.indexOf(course), course);
        timeStamps.add(courseNames.indexOf(course), timestamp);
    }
}
