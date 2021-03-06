package oop.flexible;

public class FlexibleCompanyDemo {
	public static void main(String[] args) {

//        MereClerk mereClerk1 = new MereClerk("철수", 100);
//        MereClerk mereClerk2 = new MereClerk("영희", 100);
//        Manager manager = new Manager("홍길동", 200);

		Employee[] emps = new Employee[3];
		emps[0] = new MereClerk("철수", 100);
		emps[1] = new MereClerk("영희", 100);
		emps[2] = new Manager("홍길동", 200, "IT");

		System.out.println("현재 월급입니다.");

		printEmployeeInfo(emps);

//        System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
//        System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

		System.out.println("");

		for (Employee employee : emps) {
			employee.manageSalary(10);
		}

		System.out.println("올린 후의 월급입니다.");

		printEmployeeInfo(emps);

//		mereClerk1.manageSalary(10);
//		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
//
//		mereClerk2.manageSalary(10);
//		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
//
//		manager.manageSalary(10);
//		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

	}

	private static void printEmployeeInfo(Employee[] emps) {
		for (Employee employee : emps) {
			if (employee instanceof Manager) {
				Manager mgr = (Manager) employee;
				System.out.print("부서명 : " + mgr.getDepartment());
			}

//			System.out.print("부서명 : " + ((Manager) employee).getDepartment());
			System.out.println(employee.getName() + "의 현재 월급은 " + employee.getSalary() + " 만원 입니다.");
		}
	}
}
