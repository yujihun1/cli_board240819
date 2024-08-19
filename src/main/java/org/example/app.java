package org.example;

import java.util.Scanner;

public class app {
    Scanner sc;

    app(Scanner sc) {
        this.sc = sc;
    }


    void run() {

        System.out.println("==게시판 앱==");

        while (true) {
            System.out.printf("명령)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;


                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

            }else if(command.equals("등록")){
                System.out.print("제목:");
                String subjext = sc.nextLine().trim();
                System.out.print("내용 :");
                String content = sc.nextLine().trim();




            }

        }
    }
}