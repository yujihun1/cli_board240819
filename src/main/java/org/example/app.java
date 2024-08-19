package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app  {
    Scanner sc;

    app(Scanner sc) {
        this.sc = sc;
    }


    void run() {
        int lastId=1;
        List<Article> articleList = new ArrayList<>();
        System.out.println("==게시판 앱==");

        while (true) {
            System.out.print("명령)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;


                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

            }else if(command.equals("등록")){
                System.out.print("제목:");
                String subject = sc.nextLine().trim();
                System.out.print("내용 :");
                String content = sc.nextLine().trim();

                Article article= new Article(lastId,subject,content);
                articleList.add(article);



                System.out.printf("%d번 게시물이 등록되었습니다.\n",lastId);
                lastId++;




            }else if (command.equals("목록")){
                System.out.println("번호/ 제목 / 내용");
                System.out.println("------------------");
                for(int i=0; i<articleList.size();i++){
                    Article article = articleList.get(i);
                    System.out.printf("%d,%s,%s\n",article.getId(),article.getSubject(),article.getContent());
                }

            }

        }
    }
}

