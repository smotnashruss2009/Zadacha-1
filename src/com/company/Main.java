package com.company;

import jdk.nashorn.internal.ir.ContinueNode;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tmp;
        String no="N";
        Integer i=0;
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println(" Проснулась.");
            System.out.println("Пора на остановку?(Y | N)");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y")) {
                System.out.println("Бежать тогда");
            } else
                System.out.println("Можно успеть накраситься, потом бежать..");
            /*for (;(no.equals("N") | no.equals("n"));)*/do {
                System.out.println("Дождалась автобус?");
                tmp = sr.next();
                if (tmp.equals("N") | tmp.equals("n"))
                    for(i = 0;((i < 10) && (tmp.equals("N") | tmp.equals("n")));i++) {
                        System.out.println("Ждать автобус. Дождалась?");
                        tmp = sr.next();
                    }
                if (tmp.equals("Y") | tmp.equals("y")) {
                    System.out.println("Есть сидячие места?");
                    tmp = sr.next();
                    i = 0;
                    if (tmp.equals("N") | tmp.equals("n"))
                        for(i=0;((i < 10) && (tmp.equals("N") | tmp.equals("n")));i++) {
                            System.out.println("Ворчать, пока не уступят. Уступили?");
                            tmp = sr.next();
                        }
                    if (i == 10) {
                        System.out.println("Смириться");
                    } else {
                        System.out.println("Занять, но все равно ворчать");
                    }
                    System.out.println("Поехать: \n 1. до конечной \n 2. в больницу\n 3. на рынок \n 4. пока не выгонят");
                    Integer str = sr.nextInt();
                    switch (str) {
                        case 1: {
                            System.out.println("Конечная.");
                            break;
                        }
                        case 2: {
                            System.out.println("Больница. Я здорова?");
                            tmp = sr.next();
                            if (tmp.equals("N") | tmp.equals("n")) {
                                System.out.println("Лечиться.");
                            }else
                            System.out.println("Достать врача. Выбить путевку в санаторий в Крым:).");
                            break;
                        }
                        case 3: {
                            System.out.println("Что-то надо купить?");
                            tmp = sr.next();
                            if (tmp.equals("N") | tmp.equals("n")) {
                                System.out.println("Поглазеть?");
                                tmp = sr.next();
                                if (tmp.equals("Y") | tmp.equals("y")) {
                                    System.out.println("Поглазела, гуляй...");
                                }else break;
                            } else {
                                System.out.println("Затарилась.");
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Выгнали.");
                            break;
                        }
                    }
                    System.out.println("Пора домой?");
                    no = sr.next();
                    if (no.equals("N") | no.equals("n")) {
                        System.out.println("Сесть на следующий автобус");
                    }
                }
                else break;
            }while (no.equals("N") | no.equals("n"));
            System.out.println("Поехать домой. \n Добралась.");
            System.out.println("Хочу есть?");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y")) {
                System.out.println("Есть что поесть?");
                tmp = sr.next();
                if (tmp.equals("N") | tmp.equals("n")) {
                    System.out.println("Приготовить: \n 1. драники \n2. борщ \n 3.пирожки \n4. кашу-малашу");
                    sr.next();
                }
                System.out.println("Поесть.");
            }
            i = 0;
            System.out.println("Гулять?");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y")) {
                System.out.println("Посидеть с подругами у подъезда.");
                for(i=0;((i < 4) && (tmp.equals("N") | tmp.equals("n")));i++) {
                    System.out.println("Посидела?");
                    tmp = sr.next();
                }
                if (tmp.equals("N") | tmp.equals("n")) {
                    System.out.println("Иди домой! 'Давай поженимся' началась'!!!!");
                }
            }
            i = 0;
            System.out.println("Смотреть телек?");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y"))
            {System.out.println("Смотреть.");
                System.out.println("Закончилась?");
                tmp = sr.next();
                for(i=0;((i < 4) && (tmp.equals("N") | tmp.equals("n")));i++) {
                    //System.out.println("Смотреть.");
                    System.out.println("Закончилась?");
                    tmp = sr.next();
                }}
             System.out.println("Пора спать!");
            i=0;
            System.out.println("Сон...");
            for(i=0;((i<10) && (tmp.equals("N") | tmp.equals("n")));i++) {
                System.out.println("Проснуться?");
                tmp = sr.next();
            }
            System.out.println("Подьем, иначе место не уступят(");
        }while (true);
    }
}
