
public class Review1 {

    public static void main(String[] args) {
        
        String phoneInfo = "iphone16:1900000:Apple";
        Product2 product = makeProduct(phoneInfo);
        System.out.println(product);
    }
    
    // 문자열을 전달받는다. 전달받은 문자열을 파싱하여 객체생성 리텅
    private static Product2 makeProduct(String phoneInfo) {
        
        String[] parsingStr = phoneInfo.split(":");
        int price = Integer.parseInt(parsingStr[1]);
        String model = parsingStr[0];
        String maker = parsingStr[2];
        Product2 result = new Product2(model, price, maker);
        return result;
    }

}

class Product2 {
    
    public String model;
    public int price;
    public String maker;
    
    // 기본 생성자 추가
    public Product2() {
    	
    }
    
    public Product2(String model, int price, String maker) {
    	this.model = model;
    	this.price = price;
    	this.maker = maker;
    }

    @Override
    public String toString() {
        return "Product [maker = " + maker + ", model = " + model + ", price = " + price + "]";
    }
}