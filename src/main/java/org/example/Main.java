package org.example;

/*
Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
        Обеспечьте поддержку сериализации для этого класса.
        Создайте объект класса Student и инициализируйте его данными.
        Сериализуйте этот объект в файл.
        Десериализуйте объект обратно в программу из файла.
        Выведите все поля объекта, включая GPA, и обсудите,
        почему значение GPA не было сохранено/восстановлено.
*/

import java.io.*;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student vasilii =new Student("Василий", 32, 4.7);


        FileOutputStream fileOutputStream = new FileOutputStream("student.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(vasilii);

        System.out.println("Объект сериализован");


        FileInputStream fileInputStream = new FileInputStream("user.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

         vasilii =  (Student)objectInputStream.readObject();

        System.out.println("Студент василий  после десериализации" +  vasilii);





    }







}