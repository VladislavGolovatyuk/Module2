package module2;

import java.util.Scanner;

/**
 * Created by Cvladislav on 28.06.2017.
 */
public class UserInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, свое имя: ");
        String userName = sc.nextLine();

        System.out.println("Введите, пожалуйста, название города в котором Вы проживаете: ");
        String userCity = sc.nextLine();

        System.  out.println("Введите, пожалуйста, Ваш возраст: ");
        int userAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите, пожалуйста, название название Вашего хобби: ");
        String userHobby = sc.nextLine();


        System.out.println("Выберите вариант для выведения основной информации о Вас: ");
        System.out.println();
        System.out.println("Нажмите цифру 1, если хотите получить информацию в табличном виде! ");
        System.out.println("Нажмите цифру 2, если хотите получить информацию в текстовом (строчном) виде! ");
        System.out.println("Нажмите цифру 3, если хотите получить информацию в ином (упрощённом) виде! ");


        int userChose;

        do{

            userChose = sc.nextInt();

            switch (userChose) {

                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("Имя пользователя: " + userName);
                    System.out.println("Город проживания пользователя: " + userCity);
                    System.out.println("Возраст пользователя: " + userAge);
                    System.out.println("Хобби пользователя: " + userHobby);
                    System.out.println("-----------------------------------");
                    System.out.println();
                    System.out.println("Спасибо за доверие к нашему софту))");
                    break;

                case 2:
                    System.out.println("------------------------------------------");
                    System.out.println("Человек по имени " + userName + " живет в городе " + userCity + ".");
                    System.out.println("Этому человеку " + userAge + " и он любит заниматься " + userHobby + ".");
                    System.out.println("------------------------------------------");
                    System.out.println();
                    System.out.println("Спасибо за доверие к нашему софту))");
                    break;

                case 3:
                    System.out.println("-----------------------------------");
                    System.out.println(userName + " - имя");
                    System.out.println(userCity + " - город");
                    System.out.println(userAge + " - возраст");
                    System.out.println(userHobby + " - хобби");
                    System.out.println("-----------------------------------");
                    System.out.println();
                    System.out.println("Спасибо за доверие к нашему софту))");
                    break;

                default:
                    System.out.println("Вы ввели символ, не позволяющий задать программе параметры для формирования " +
                            "таблицы с информацией о пользователе.");
                    System.out.println();
                    System.out.println("Для выбора выведения ифнормации используйте цифри 1, 2 или 3: ");
                    System.out.println();
                    System.out.println("Нажмите цифру 1, если хотите получить информацию в табличном виде! ");
                    System.out.println("Нажмите цифру 2, если хотите получить информацию в текстовом (строчном) виде! ");
                    System.out.println("Нажмите цифру 3, если хотите получить информацию в ином (упрощённом) виде! ");
                    break;

            }if ((userChose==1) || (userChose==2) || (userChose==3)){
                break;
            }

        }while ((userChose!=1) || (userChose!=2) || (userChose!=3));

        
    }
}



