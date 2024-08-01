public class VariableTest {
    
    public static void main(String[] args) {
        // 메인 메서드 내용
    }
}

class Dog {
    int age; // 멤버 변수, 객체 변수, 인스턴스 변수
    static String name; // 클래스 변수, 멤버 변수 중 하나
    
    void print() {
        int age; // 지역 변수
        age = 11; // 지역 변수 초기화
        int i = 0; // 지역 변수
        for(; i < 100; i++) {
            // 루프 바디
        }
        i = 5000; // 루프 종료 후 i 값 설정
        
        String str = "600"; // 지역 변수 선언 및 초기화
        
        try {
            String str2 = "600"; // try 블록 내의 새로운 지역 변수 선언
            // 예외 발생 코드
            int result = 10 / 0; // ArithmeticException 발생
        } catch(Exception e) {
            str = "Hello"; // catch 블록에서 str 변수 값 변경
            System.out.println("예외 발생: " + e.getMessage());
        }
        // catch 블록에서 str 변수의 값이 변경된 후 출력
        System.out.println("str의 최종 값: " + str); // 출력: str의 최종 값: Hello
    }
}