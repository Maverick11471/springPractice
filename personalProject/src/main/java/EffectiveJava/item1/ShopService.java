package EffectiveJava.item1;

public class ShopService {
    private static ShopService shopService = new ShopService();

    private ShopService(){

    }

    public static ShopService getInstance(){
        return shopService;
    }

    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 객체입니다.");
        }
    }
}
