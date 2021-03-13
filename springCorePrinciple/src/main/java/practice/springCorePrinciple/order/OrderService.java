package practice.springCorePrinciple.order;

public interface OrderService {

    /**
     * 주문 생성
     * @param memberId 회원 고유 id
     * @param itemName 상품명
     * @param itemPrice 상품 금액
     * @return 주문 객체
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
