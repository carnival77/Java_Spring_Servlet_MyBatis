package com.app3;

import com.app3.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];

		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);

		System.out.println("이름\t나이\t신장\t몸무게");
		for (Student student : studentArray) {
			System.out.println(student.studentInfo());
		}

		System.out.printf("\n나이 평균: %.3f\n",
				(double) (studentArray[0].getAge() + studentArray[1].getAge() + studentArray[2].getAge()) / 3);

		System.out.printf("신장 평균: %.3f\n",
				(double) (studentArray[0].getHeight() + studentArray[1].getHeight() + studentArray[2].getHeight()) / 3);

		System.out.printf("몸무게 평균: %.3f\n\n",
				(double) (studentArray[0].getWeight() + studentArray[1].getWeight() + studentArray[2].getWeight()) / 3);

		int max = 0;
		int min = studentArray[2].getAge();

		for (Student student : studentArray) {
			if (student.getAge() >= max) {
				max = student.getAge();
			}
		}

		for (Student student : studentArray) {
			if (student.getAge() == max) {
				System.out.println("나이가 가장 많은 학생: " + student.getName());
				break;
			}
		}

		for (Student student : studentArray) {
			if (student.getAge() <= min) {
				min = student.getAge();
			}
		}

		for (Student student : studentArray) {
			if (student.getAge() == min) {
				System.out.println("나이가 가장 적은 학생: " + student.getName());
				break;
			}
		}

	}
}
