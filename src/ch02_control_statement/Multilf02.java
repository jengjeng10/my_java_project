package ch02_control_statement;

public class Multilf02 {
    public static void main(String[] args) {
        int age = 15;
        double ticket = 1000.0;
        double discount ; // 할인율
        String so ;
        double doo ;

        if(age <8 ){
            so = "유아(무료입장)";
            discount =   1.0;
        }else if(age <14){
            so = "어린이(50%할인)";
            discount =  0.5;
        }else if(age <20){
            so = "청소년(30% 할인)";
            discount =  0.3;
        }else if(age >= 65){
            so = "노인(40퍼 할인)";
            discount =  0.4;
        }else{
            so = "성인(정가)";
            discount =  0.0;

        }
        String message = age + "살 : " + so;
        System.out.println(message);
        message = "가격은"+ (int)(ticket * (1 - discount)) + "입니다.";
        System.out.println(message);


    }
}
//int age = 10;
//double ticket = 1000.0;
//double discount ; // 할인율
//
//8세 미만 : "유아(무료 입장)"
//14세 미만: "어린이(50% 할인)"
//20세 미만:"청소년(30% 할인)"
//65세 이상 : "노인 (40% 할인)"
//이외: "성인(정가)"
//
//
//출력 예시 01:
//	10살 : 어린이(50% 할인)
//	가격은 500원입니다.

