package org.campus02;

import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student susi_sorglos = new Student(1, "Susi Sorglos");
        student.add(susi_sorglos);
        System.out.println(student.size());

        student.remove(0);
        System.out.println(student.size());

        Student maxi_sorglos = new Student(2, "Max Sorglos");
        student.add(maxi_sorglos);
        Student susi_mustermann = new Student(3, "Susi Mustermann");
        student.add(susi_mustermann);

        for (int i = 0; i < student.size(); i++) {
            System.out.println("Zahl = " + student);

        }

        boolean isMaxiOnList = student.contains(maxi_sorglos);
        System.out.println("isMaxiOnList = " + isMaxiOnList);

        System.out.println(student.toString());
        boolean containsSusi2 = containsName(student, "Susi Mustermann");
        System.out.println("containsSusi2 = " + containsSusi2);

        boolean containsSusi3 = containsMatrNr(student, 2);
        System.out.println("containsSusi3 = " + containsSusi3);


        System.out.println(student.equals(isMaxiOnList));

    }

    public static boolean containsName(ArrayList<Student> studentList, String searchName) {

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFullName().equals(searchName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsMatrNr(ArrayList<Student> studentList, int matrNr) {

        for (Student student : studentList) {
            if (student.getMarNr() == matrNr) {
                return true;
            }
        }
        return false;
    }


}

/*
    public static boolean containsMat(ArrayList<Student> studentList, String searchNumber) {

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getMarNr().equals(searchName)) {
                return true;
            }
        }
        return false;
*/

