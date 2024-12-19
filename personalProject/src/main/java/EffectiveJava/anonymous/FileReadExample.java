package EffectiveJava.anonymous;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        String[] files = {"file1.txt", "file2.txt", "file3.txt"};

        for (String fileName : files) {
            try {
                Scanner scanner = new Scanner(new File(fileName));
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " 파일을 찾을 수 없습니다.");
            }
        }

        System.out.println("모든 파일 처리가 완료되었습니다.");
    }
}

