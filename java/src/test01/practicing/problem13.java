package test01.practicing;

/*

문제

(if문 활용)
책 가격(bookPrice)와 용돈(money)에 따라 책의 구입
여부와 잔돈 또는 모자란 금액을 출력하세요.
1) 책 가격이 용돈보다 높은 경우 출력
책을 구입하지 못했습니다.
용돈이 ~원 모자랍니다.
2) 책 가격이 용돈보다 낮은 경우 출력
책을 구입했습니다.
잔돈이 ~원 남았습니다.

실행 화면 예시

책을 구입했습니다.
잔돈이 8000원 남았습니다.

*/

public class problem13 {
    public static void main(String[] args) {
        int bookPrice = 12000;
        int money = 20000;
        if (bookPrice > money) {
            System.out.println("책을 구입하지 못했습니다.");
            System.out.printf("용돈 %d원이 모자랍니다.", bookPrice - money);
        }
        else {
            System.out.println("책을 구입했습니다.");
            System.out.printf("잔돈이 %d원 남았습니다.", money - bookPrice);
        }


    }
}
