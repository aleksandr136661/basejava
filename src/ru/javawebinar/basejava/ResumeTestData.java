package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.ContactType;
import ru.javawebinar.basejava.model.Resume;

public class ResumeTestData {
    public static void main(String[] args) {
        Resume r1 = new Resume("uuid1");
        System.out.println(r1.getContact(ContactType.GITHUB.getTitle("qwerty")));

    }
}
