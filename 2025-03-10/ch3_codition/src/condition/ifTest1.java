package condition;


//특정 조건을 만족하면 문장을 실행
//if(조건문){}

//특정 조건을 만족하면 구문 1을 실행 만족하지 않을때는 구문2 실행
// if(조건문){구문1}else{구문2}


public class ifTest1 {
    public static void main(String[] args) {
     int x = 0;
     
     if( x==0 ){
        System.out.println("x==0");
     }
     if (x != 0) {
        System.out.println("!(x==0)");
     }
     if (!( x == 0 )) {
        System.out.println("!(x==0)");
     }
     if (!( x == 0)) {
        System.out.println("!(x == 0)");
     }
     if (!(x != 0)) {
        System.out.println("!(x != 0)");        
     }
    } 
}
