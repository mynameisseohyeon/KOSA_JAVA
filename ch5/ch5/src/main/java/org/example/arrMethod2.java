package org.example;

public class arrMethod2 { // 2차원 배열 함수

    public static int[][] methodEx3() {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        return arr;
    };

    public static void line() {
        System.out.println("----------");
    }


    public static void main(String[] args) {
        int[][] resultArr = methodEx3();
        int sum = 0;

        for(int i = 0; i < resultArr.length; i++) {
            for(int j = 0; j < resultArr[i].length; j++) {
                sum += resultArr[i][j];
            }
        }

        System.out.println("sum = " + sum);
        line();

        // 해당 데이터 값 출력하기 - for each 사용
        for(int[] item : resultArr) {
            System.out.println(item); // 주소값 출력 => 메모리 상의 주소(16진수 형태)
            System.out.println(item.hashCode()); // (16진수 형태를)10진수로 주소 표현
        }

        line();

        // for each문으로 2차원 배열 표현
        int hap = 0;
        for(int[] item : resultArr) {
            for(int arrItem : item) {
                System.out.print(arrItem + " ");
                hap += arrItem;
            }
            System.out.println();
        }

        System.out.print("hap = " + hap);

    }
}
