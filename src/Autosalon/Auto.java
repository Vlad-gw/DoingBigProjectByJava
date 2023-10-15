package Autosalon;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;


public class Auto {     //ctrl + alt + l - форматирование кода

    public int cost = 1000000;
    public String name;
    public String series;
    public String str = "Ссылка, если хотите узнать дополнительные характеристики: \n";
    Scanner input = new Scanner(System.in);



    public void ModernCar() {

        OutputMarkAndSeries();

        switch (name) {

            case "BMW": {
                switch (series) {
                    case "M2" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 410 л.с.
                                Масса: 1400 кг.
                                Цена:\s""" + cost * 5);
                        System.out.println(str + "https://auto.ru/catalog/cars/bmw/m2/21363127/21363184/specifications/?utm_referrer=yandex.ru");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();


                    }
                    case "X5" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 249 л.с.
                                Масса: 1800 кг.
                                Цена: \s""" + cost * 4);
                        System.out.println(str + "https://auto.ru/catalog/cars/bmw/x5/21307931/21307996/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }
                    case "M3" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 500 л.с.
                                Масса: 1550 кг.
                                Цена: \s""" + cost * 6);
                        System.out.println(str + "https://auto.ru/catalog/cars/bmw/m3/20106348/20106355/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }
                }
                break;
            }


            case "MB": {
                switch (series) {
                    case "C-class" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 184 л.с.
                                Масса: 1350 кг.
                                Цена: \s""" + cost * 3);
                        System.out.println(str + "https://auto.ru/catalog/cars/mercedes/c_klasse/21291732/21291804/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }

                    case "S-class" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 249 л.с.
                                Масса: 2000 кг.
                                Цена: \s""" + cost * 11);
                        System.out.println(str + "https://auto.ru/catalog/cars/mercedes/s_klasse/22491729/22491784/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }

                    case "G-class" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 585 л.с.
                                Масса: 2200 кг.
                                Цена: \s""" + cost * 15);
                        System.out.println(str + "https://auto.ru/catalog/cars/mercedes/g_klasse/21188720/21189094/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }

                }
                break;
            }

            default:
                System.out.println("Такой тачки у нас нет или ее вовсе не существует");
                break;
        }
        System.out.println();
    }

    public void OldCar() {
        OutputMarkAndSeries();
        switch (name) {
            case "Lincoln": {
                switch (series) {
                    case "Continental" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 350 л.с.
                                Масса: 2300 кг.
                                Год: 1966
                                Цена: \s""" + cost * 6);
                        System.out.println(str + "https://auto.ru/catalog/cars/lincoln/continental/20713169/23189133/specifications/23189133__23189136/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }
                    case "Mark" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 170 л.с.
                                Масса: 1650 кг.
                                Цена: \s""" + cost * 3);
                        System.out.println(str + "https://auto.ru/catalog/cars/lincoln/mark_viii/2307497/5139972/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }
                }
                break;
            }

            case "RR": {
                switch (series) {
                    case "Phantom" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 260 л.с.
                                Масса: 2400 кг.
                                Год: 1953
                                Цена: \s""" + cost * 20);
                        System.out.println(str + "https://auto.ru/catalog/cars/rolls_royce/phantom/20773280/20773305/specifications/20773305__20773331/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }
                    case "Silver" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 230 л.с.
                                Масса: 2250 кг.
                                Год: 1958.
                                Цена: \s""" + cost * 15);
                        System.out.println(str + "https://auto.ru/catalog/cars/rolls_royce/silver_spur/20350374/20473638/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }
                }
                break;
            }

            default:
                System.out.println("Такой тачки у нас нет или ее вовсе не существует");
                break;
        }
        System.out.println();
    }


    public void SportCar() {

        OutputMarkAndSeries();

        switch (name) {

            case "Porsche": {
                switch (series) {
                    case "Panamera" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 340 л.с.
                                Масса: 1600 кг.
                                Цена: \s""" + cost * 7);
                        System.out.println(str + "https://auto.ru/catalog/cars/porsche/panamera/22481288/22481337/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }

                    case "Macan" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 200 л.с.
                                Масса: 1500 кг.
                                Цена: \s""" + cost * 4);
                        System.out.println(str + "https://auto.ru/catalog/cars/porsche/macan/21399178/21399278/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }

                    case "Cayenne" -> {
                        System.out.println("""
                                Эта машина имеет такие характеристики:
                                Мощность: 620 л.с.
                                Масса: 1900 кг.
                                Цена: \s""" + cost * 11);
                        System.out.println(str + "https://auto.ru/catalog/cars/porsche/cayenne/21080912/21080954/specifications/");
                        IfWantKnowAboutCreditAndIfYouWantBuyCar();
                    }

                }
                break;
            }

            default:
                System.out.println("Такой тачки у нас нет или ее вовсе не существует");
                break;
        }
        System.out.println();
    }



    public void mainMethodOfCar() {
        ChoosingTypeOfCar();
    }

    public void ChoosingTypeOfCar() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Введите вид машин, которые вы хотите посмотреть(Sport, Modern или Old):\n");
        String typeCar = input.next();
        if (typeCar.equals("Modern")) {
            ModernCar();
        }
        if (typeCar.equals("Old")) {
            OldCar();
        }
        if (typeCar.equals("Sport")) {
            SportCar();
        } else {
            System.out.println();
        }
    }

    public void OutputMarkAndSeries() {
        System.out.print("Введите марку машины(BMW, MB, RR, Porsche, Lincoln): ");
        name = input.next();
        System.out.print("Введите название серии: ");
        series = input.next();
    }

    public void IfWantKnowAboutCreditAndIfYouWantBuyCar() {
        System.out.print("\nХотите узнать, во сколько вам обойдется кредит?: ");
        String answer = input.next();
        if (Objects.equals(answer, "Yes")) {

            System.out.println("Введите количество ваших денег для первого взноса и кол-во месяцев, сколько вы готовы" +
                    " платить: ");
            System.out.print("Денег: ");
            Credit.downPayment = input.nextInt();
            System.out.print("Месяцев: ");
            Credit.month = input.nextInt();

            Credit cr = new Credit(Credit.downPayment, Credit.month);

            System.out.println("\nЗа " + Credit.month + " месяца вам придется доплатить: " +
                    cr.creditСalculation() + ", платя это по " +
                    cr.countMonth() + " в месяц.");

            System.out.print("Вы хотите купить этот авто?: ");
            String answerAboutBuyCar = input.next();
            if (answerAboutBuyCar.equals("Yes")) {
                InputData();
            }
        } else {
            System.out.println("Хорошо, выбирайте другую машину");
        }
    }

    public void InputData() {

        File log = new File("log.txt");
        try {
            if (!log.exists()) {
                System.out.println("We had to make a new file.");
                log.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(log, true));

            System.out.println("Введите свои данные:");
            System.out.print("Фамилия: ");
            String FIO = input.next();
            System.out.print("Номер телефона: ");
            String number = input.next();
            System.out.print("Паспортные данные(сначала серия, потом номер, без пробела): ");
            String pasportData = input.next();
            System.out.print("Место жительства(только город): ");
            String placeOfLiving = input.next();        //сделать цикл for для нумерации
            out.println(FIO);
            out.println(number);
            out.println(pasportData);
            out.println(placeOfLiving);
            out.println("Марка " + name + " и серия " + series + " по цене " + cost);
            out.println(" ");

            out.close();
            System.out.print("Данные внесены, проверьте их:\n" + FIO + "\n"
                    + number + "\n" + pasportData + "\n" + placeOfLiving + ".");
        } catch (IOException e) {
            System.out.println("COULD NOT LOG!!");
        }
    }
}