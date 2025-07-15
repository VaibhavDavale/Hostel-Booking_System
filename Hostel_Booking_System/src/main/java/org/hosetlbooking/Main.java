package org.hosetlbooking;



import org.hostelbooking.dao.RoomDao;
import org.hostelbooking.dao.StudentDao;
import org.hostelbooking.model.Room;
import org.hostelbooking.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomDao roomDao = new RoomDao();
        StudentDao studentDao = new StudentDao();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Room room = roomDao.getAvailableRoom();
        if (room != null) {
            Student student = new Student();
            student.setName(name);
            student.setRoom(room);
            studentDao.saveStudent(student);
            roomDao.markRoomAsOccupied(room);
            System.out.println("Room " + room.getRoomNumber() + " assigned to " + name);
        } else {
            System.out.println("No rooms available.");
        }

        sc.close();
    }
}
