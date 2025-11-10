package org.example;

public class Sales { // 커미션

    static Employee employee = new Employee(100, "김네모", "영업팀", "010-0000-0000");
    static Regular regular = new Regular(22, 15000);

    static int PartTime = regular.getHourlyWages() * regular.getHourlyWages();

    public static void main(String[] args) {
        Sales sales = new Sales();

        System.out.println(employee.getName() + "님의 이번 달 급여는 " + PartTime + "원 입니다");
        System.out.println(sales.toString());
    }

    @Override
    public String toString()
    {
        return employee.getName() + "님의 이번 달 급여는 " + PartTime + "원 입니다";
    }
}
