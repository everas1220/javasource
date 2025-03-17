package generics;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {

        File file1 = new File("c/temp/text.txt");
        File file2 = new File("c/temp", "test.txt");

        File dir = new File("c:/temp");
        File file3 = new File("test1.txt");

        System.out.println("경로를 제외한 파일명 : " + file1.getName());
        // => String 메소드 이용
        String fileName = file1.getName();
        int pos = fileName.lastIndexOf(".");
        System.out.println("확장자를 제외한 파일명 : " + file1.getName());
        System.out.println("확장자 :" + fileName.substring(pos + 1));
    }
}
