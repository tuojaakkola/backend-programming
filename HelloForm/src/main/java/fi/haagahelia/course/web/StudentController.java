package fi.haagahelia.course.web;

import fi.haagahelia.course.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/hello")

    public String showStudentList(Model model) {
       
        List<Student> studentList = new ArrayList<>();

        Student S1 = new Student();
        S1.setFirstName("Velli");
        S1.setLastName("Virta");

        Student S2 = new Student();
        S2.setFirstName("Kari");
        S2.setLastName("Tapio");

        Student S3 = new Student();
        S3.setFirstName("Jani");
        S3.setLastName("Muoti");

        Student S4 = new Student();
        S4.setFirstName("Seppo");
        S4.setLastName("Mies");

        studentList.add(S1);
        studentList.add(S2);
        studentList.add(S3);
        studentList.add(S4);

       
        model.addAttribute("students", studentList);

        return "StudentList";  
    }
}
