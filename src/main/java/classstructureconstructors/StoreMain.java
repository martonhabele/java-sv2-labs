package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        //filled with static test cases for now

        Store store = new Store("Mayonnaise"); //with 0 in stock
        System.out.println(store.getStock());

        store.store(3);                         //3 bottles received
        System.out.println(store.getStock());

        store.store(2);                         //2 more just came along
        System.out.println(store.getStock());

        store.dispatch(4);                      //we sent out 4
        System.out.println(store.getStock());
    }
}
