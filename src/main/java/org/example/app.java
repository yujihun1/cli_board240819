package org.example;

import java.util.Scanner;

public class app {
    Scanner sc;
    app(Scanner sc) {
        this.sc = sc;
    }



      void run(){

          System.out.println("==게시판 앱==");

          while(true) {
              System.out.printf("명령)");
              String command = sc.nextLine();

              if(command.equals("종료")) {
                  break;
      }
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

        }

    }
}
