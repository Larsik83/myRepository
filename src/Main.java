import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int znakOperation=0;
        int roman1=0;
        int roman2=0;
        int arabic1=0;
        int arabic2=0;
        int firstNumber=0;
        int secondNumber = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример с арабскими или римскими цифрами от 1 до 10: ");
        String str = sc.nextLine();

        // System.out.println("введенная  строка: " + str);


        int slojenie = str.indexOf('+');
        int vichitanie = str.indexOf('-');
        int umnojenie = str.indexOf('*');
        int delenie = str.indexOf('/');
        if (slojenie>0){
            znakOperation=0;
        } if (vichitanie>0){
            znakOperation=1;
        }if (umnojenie>0){
            znakOperation=2;
        } if (delenie>0){
            znakOperation=3;
        }

        if (znakOperation==0){
            String newPart[] = str.split("\\+");
            if (newPart[0].equals("I")||(newPart[0].equals("II"))||(newPart[0].equals("III"))||(newPart[0].equals("IV"))||
                    (newPart[0].equals("V"))||(newPart[0].equals("VI"))||(newPart[0].equals("VII"))||
                    (newPart[0].equals("VIII"))||(newPart[0].equals("IX"))||(newPart[0].equals("X"))){


                roman1=0;
                firstNumber=ZamenaRoman.ZamenaRoman(newPart[0]);
            } else roman1=1;


            if (newPart[1].equals("I")||(newPart[1].equals("II"))||(newPart[1].equals("III"))||(newPart[1].equals("IV"))||
                    (newPart[1].equals("V"))||(newPart[1].equals("VI"))||(newPart[1].equals("VII"))||
                    (newPart[1].equals("VIII"))||(newPart[1].equals("IX"))||(newPart[1].equals("X"))){


                roman2=0;
                secondNumber=ZamenaRoman.ZamenaRoman(newPart[1]);
            } else roman2=1;



            if (newPart[0].equals("1")||(newPart[0].equals("2"))||(newPart[0].equals("3"))||(newPart[0].equals("4"))||
                    (newPart[0].equals("5"))||(newPart[0].equals("6"))||(newPart[0].equals("7"))||
                    (newPart[0].equals("8"))||(newPart[0].equals("9"))||(newPart[0].equals("10"))){


                arabic1=0;
                firstNumber = Integer.parseInt(newPart[0]);
            } else arabic1=1;


            if (newPart[1].equals("1")||(newPart[1].equals("2"))||(newPart[1].equals("3"))||(newPart[1].equals("4"))||
                    (newPart[1].equals("5"))||(newPart[1].equals("6"))||(newPart[1].equals("7"))||
                    (newPart[1].equals("8"))||(newPart[1].equals("9"))||(newPart[1].equals("10"))){


                arabic2=0;
                secondNumber = Integer.parseInt(newPart[1]);
            } else arabic2=1;
        }




        if (znakOperation==1){
            String newPart[] = str.split("\\-");
            if (newPart[0].equals("I")||(newPart[0].equals("II"))||(newPart[0].equals("III"))||(newPart[0].equals("IV"))||
                    (newPart[0].equals("V"))||(newPart[0].equals("VI"))||(newPart[0].equals("VII"))||
                    (newPart[0].equals("VIII"))||(newPart[0].equals("IX"))||(newPart[0].equals("X"))){


                roman1=0;
                firstNumber=ZamenaRoman.ZamenaRoman(newPart[0]);
            } else roman1=1;


            if (newPart[1].equals("I")||(newPart[1].equals("II"))||(newPart[1].equals("III"))||(newPart[1].equals("IV"))||
                    (newPart[1].equals("V"))||(newPart[1].equals("VI"))||(newPart[1].equals("VII"))||
                    (newPart[1].equals("VIII"))||(newPart[1].equals("IX"))||(newPart[1].equals("X"))){


                roman2=0;
                secondNumber=ZamenaRoman.ZamenaRoman(newPart[1]);
            } else roman2=1;



            if (newPart[0].equals("1")||(newPart[0].equals("2"))||(newPart[0].equals("3"))||(newPart[0].equals("4"))||
                    (newPart[0].equals("5"))||(newPart[0].equals("6"))||(newPart[0].equals("7"))||
                    (newPart[0].equals("8"))||(newPart[0].equals("9"))||(newPart[0].equals("10"))){


                arabic1=0;
                firstNumber = Integer.parseInt(newPart[0]);
            } else arabic1=1;


            if (newPart[1].equals("1")||(newPart[1].equals("2"))||(newPart[1].equals("3"))||(newPart[1].equals("4"))||
                    (newPart[1].equals("5"))||(newPart[1].equals("6"))||(newPart[1].equals("7"))||
                    (newPart[1].equals("8"))||(newPart[1].equals("9"))||(newPart[1].equals("10"))){


                arabic2=0;
                secondNumber = Integer.parseInt(newPart[1]);
            } else arabic2=1;
        }



        if (znakOperation==2){
            String newPart[] = str.split("\\*");
            if (newPart[0].equals("I")||(newPart[0].equals("II"))||(newPart[0].equals("III"))||(newPart[0].equals("IV"))||
                    (newPart[0].equals("V"))||(newPart[0].equals("VI"))||(newPart[0].equals("VII"))||
                    (newPart[0].equals("VIII"))||(newPart[0].equals("IX"))||(newPart[0].equals("X"))){


                roman1=0;
                firstNumber=ZamenaRoman.ZamenaRoman(newPart[0]);
            } else roman1=1;


            if (newPart[1].equals("I")||(newPart[1].equals("II"))||(newPart[1].equals("III"))||(newPart[1].equals("IV"))||
                    (newPart[1].equals("V"))||(newPart[1].equals("VI"))||(newPart[1].equals("VII"))||
                    (newPart[1].equals("VIII"))||(newPart[1].equals("IX"))||(newPart[1].equals("X"))){


                roman2=0;
                secondNumber=ZamenaRoman.ZamenaRoman(newPart[1]);
            } else roman2=1;



            if (newPart[0].equals("1")||(newPart[0].equals("2"))||(newPart[0].equals("3"))||(newPart[0].equals("4"))||
                    (newPart[0].equals("5"))||(newPart[0].equals("6"))||(newPart[0].equals("7"))||
                    (newPart[0].equals("8"))||(newPart[0].equals("9"))||(newPart[0].equals("10"))){


                arabic1=0;
                firstNumber = Integer.parseInt(newPart[0]);
            } else arabic1=1;


            if (newPart[1].equals("1")||(newPart[1].equals("2"))||(newPart[1].equals("3"))||(newPart[1].equals("4"))||
                    (newPart[1].equals("5"))||(newPart[1].equals("6"))||(newPart[1].equals("7"))||
                    (newPart[1].equals("8"))||(newPart[1].equals("9"))||(newPart[1].equals("10"))){


                arabic2=0;
                secondNumber = Integer.parseInt(newPart[1]);
            } else arabic2=1;
        }



        if (znakOperation==3){
            String newPart[] = str.split("\\/");
            if (newPart[0].equals("I")||(newPart[0].equals("II"))||(newPart[0].equals("III"))||(newPart[0].equals("IV"))||
                    (newPart[0].equals("V"))||(newPart[0].equals("VI"))||(newPart[0].equals("VII"))||
                    (newPart[0].equals("VIII"))||(newPart[0].equals("IX"))||(newPart[0].equals("X"))){


                roman1=0;
                firstNumber=ZamenaRoman.ZamenaRoman(newPart[0]);
            } else roman1=1;


            if (newPart[1].equals("I")||(newPart[1].equals("II"))||(newPart[1].equals("III"))||(newPart[1].equals("IV"))||
                    (newPart[1].equals("V"))||(newPart[1].equals("VI"))||(newPart[1].equals("VII"))||
                    (newPart[1].equals("VIII"))||(newPart[1].equals("IX"))||(newPart[1].equals("X"))){


                roman2=0;
                secondNumber=ZamenaRoman.ZamenaRoman(newPart[1]);
            } else roman2=1;



            if (newPart[0].equals("1")||(newPart[0].equals("2"))||(newPart[0].equals("3"))||(newPart[0].equals("4"))||
                    (newPart[0].equals("5"))||(newPart[0].equals("6"))||(newPart[0].equals("7"))||
                    (newPart[0].equals("8"))||(newPart[0].equals("9"))||(newPart[0].equals("10"))){


                arabic1=0;
                firstNumber = Integer.parseInt(newPart[0]);

            } else arabic1=1;


            if (newPart[1].equals("1")||(newPart[1].equals("2"))||(newPart[1].equals("3"))||(newPart[1].equals("4"))||
                    (newPart[1].equals("5"))||(newPart[1].equals("6"))||(newPart[1].equals("7"))||
                    (newPart[1].equals("8"))||(newPart[1].equals("9"))||(newPart[1].equals("10"))){


                arabic2=0;
                secondNumber = Integer.parseInt(newPart[1]);
            } else arabic2=1;
        }






        if ((znakOperation==0)&&((roman1==roman2)||(arabic1==arabic2))) {
            //System.out.println("выполняем операцию сложения");
            System.out.println(Operations.Slojenie(firstNumber,secondNumber));

        } else if((roman1!=roman2)||(arabic1!=arabic2))
            PrintMassage.PrintWarning();

        if ((znakOperation==1)&&((roman1==roman2)||(arabic1==arabic2))) {
            // System.out.println("выполняем операцию вычитание");
            System.out.println(Operations.Vichitanie(firstNumber,secondNumber));

        } else if((roman1!=roman2)||(arabic1!=arabic2))
            PrintMassage.PrintWarning();

        if ((znakOperation==2)&&((roman1==roman2)||(arabic1==arabic2))) {
            //System.out.println("выполняем операцию умножение");
            System.out.println(Operations.Umnojenie(firstNumber,secondNumber));

        } else if((roman1!=roman2)||(arabic1!=arabic2))
            PrintMassage.PrintWarning();

        if ((znakOperation==3)&&((roman1==roman2)||(arabic1==arabic2))) {
            //System.out.println("выполняем операцию деление");
            System.out.println(Operations.Delenie(firstNumber,secondNumber));

        } else if((roman1!=roman2)||(arabic1!=arabic2))
            PrintMassage.PrintWarning();
        //System.out.println(znakOperation);

    }
}



