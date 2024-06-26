package ch03;

public class Ch03_05_StringBuffer {
    public static void main(String[] args) {
        // 1. StringBuffer
        // - 문자열을 추가하거나 변경할 때 사용하는 자료형

        // 2. Methods of StringBuffer

        // 2.1 append()
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);  // "hello jump to java"

        // - StringBuffer를 사용하면 객체를 한 번만 생성하지만, String 자로형에 "+" 연산이 있을 때마다 새로운 String 객체를 생성한다.
        // - String 자료형은 값이 한 번 생성되면 변경할 수 없기 때문 (immutable)
        // - StringBuffer는 String 자료형보다 무겂다.

        // cf) StringBuilder
        // - StringBuilder는 StringBuffer와 비슷한 자료형으로, 사용법도 같다.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" ");
        sb2.append("jump to java");
        String result2 = sb2.toString();
        System.out.println(result2);  // "hello jump to java"
        // - StringBuffer는 멀티 스레드 환경에서 안전
        // - StringBuilder는 StringBuffer보다 성능이 우수
        // - 동기화를 고려할 필요가 없는 상황에서는 StringBuffer보다 StringBuilder를 사용하는 것이 유리

        // 2.2 insert()
        StringBuffer sb3 = new StringBuffer();
        sb3.append("jump to java");
        sb3.insert(0, "hello "); // here
        System.out.println(sb3.toString());  // "hello jump to java"

        // 2.3 substring()
        StringBuffer sb4 = new StringBuffer();
        sb4.append("Hello jump to java");
        System.out.println(sb4.substring(0, 4));  // "hell"
    }
}
