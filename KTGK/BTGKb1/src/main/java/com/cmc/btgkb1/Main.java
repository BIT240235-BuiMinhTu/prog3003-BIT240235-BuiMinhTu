package com.cmc.btgkb1;

public class Main {
    public static void main(String[] args) {

        GenericStudentManager<Student> manager = new GenericStudentManager<>();

        manager.add(new Student("SV01", "Bui Minh Tu", 3.2));
        manager.add(new Student("SV02", "Dang Tuan Dung", 3.6));
        manager.add(new Student("SV03", "Vu Tung Duong", 2.9));

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}

    



