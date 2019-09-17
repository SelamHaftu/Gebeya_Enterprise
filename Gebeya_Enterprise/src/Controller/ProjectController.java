package Controller;

import Model.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectController {

    ArrayList<Project> projects = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String TitleInput;
    String DescriptionInput;
    String LanguageUsedInput;
    String PriceInput;
    String DurationInput;
    String StatusInput;

 public void addProject(){

        System.out.println("fill this form to Create Project");
        System.out.println("Enter The Project Title");
        TitleInput = scanner.next();

        System.out.println("Enter Its Description");
        DescriptionInput = scanner.next();

        System.out.println("Enter Language USed In The Project");
        LanguageUsedInput = scanner.next();

        System.out.println("Enter Price ");
        PriceInput = scanner.next();

        System.out.println("Enter Duration ");
        DurationInput= scanner.next();

        System.out.println("Enter Status");
        StatusInput = scanner.next();


        Project project= new Project(TitleInput, DescriptionInput,LanguageUsedInput,PriceInput,DurationInput,StatusInput);
        projects.add(project);
        System.out.println("You have Added Project successfully");
    }

    public void getProjects(){

        for (Project projectItem:
                projects ) {
            System.out.println(projectItem.getProjectTitle());
            System.out.println(projectItem.getShortProjDescription());
            System.out.println(projectItem.getProgrammingLanguageOfProj());
            System.out.println(projectItem.getDurationOfPrice());
            System.out.println(projectItem.getPriceAgreedForProj());
            System.out.println(projectItem.getStatus());
            System.out.println("*********");


        }
    }
}
