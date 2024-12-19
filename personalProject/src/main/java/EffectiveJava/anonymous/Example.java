package EffectiveJava.anonymous;

public class Example {

    // [1] try~catch : 예외를 캐치해도 계속 실행
//    public static void main(String[] args) {
//        try {
//            riskyMethod();
//                    System.out.println("프로그램이 계속 실행됩니다.");
//
//        } catch (Exception e) {
//            System.out.println("예외 처리: " + e.getMessage());
//        }
//
//        System.out.println("프로그램이 계속 실행됩니다.");
//    }
//
//    public static void riskyMethod() throws Exception {
//        throw new Exception("위험한 상황 발생");
//    }



    //    [2] throw new : 예외가 발생한 지점에서 실행 중단. 예외처리실행코드 없을 시
        public static void main(String[] args) {
            riskyMethod(); // 예외 처리 없음
            System.out.println("프로그램이 계속 실행됩니다."); // 이 줄은 실행되지 않음
        }

        public static void riskyMethod() {
            throw new RuntimeException("위험한 상황 발생"); // 언체크 예외
        }
}





