public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();

        }

        private static void task8(){
            System.out.println("Задача 8");
            int cometYear=79;
            int next=100;
            int lestYear=200;
            int thisYear=2023;
            int start=thisYear-lestYear;
            int finish=thisYear+next;
            for(int i=start; i<=finish; i++){
                if(i%cometYear==0){
                    System.out.println(i);
                }
            }

        }
        private static void task7(){
            System.out.println("Задача 7");
            int friday=1;
            int daysMonths=31;
            for(int i=friday; i<=daysMonths; i=i+7){
                System.out.println("Сегодня пятница, "+i+"- е число. Необходимо подготовить отчет");
            }
        }
        private static void task6(){
            System.out.println("Задача 6");
            int depositAmount=15000;
            int months=0;
            int year=9;
            int percent=7;
            while (months<=year*12){
                depositAmount=depositAmount*percent/100+depositAmount;
                months++;
                if(months%6==0){
                    System.out.println("Месяц "+months+" накоплений "+depositAmount);
                }
            }

        }
        private static void task5() {
            System.out.println("Задача 5");
            int depositAmount=15000;
            int months=0;
            int total=12000000;
            int percent=7;
            while (total>=depositAmount){
                depositAmount=depositAmount*percent/100+depositAmount;
                months++;
                if(months%6==0){
                    System.out.println("Месяц "+months+" накоплений "+depositAmount);
                }

            }
        }
        private static void task4(){
            System.out.println("Задача 4");
            int deposit=15000;
            int months=0;
            int total=12000000;
            int percent=7;
            while (total>=deposit){
                deposit=deposit*percent/100+deposit;
                months++;

                System.out.println("Месяц "+months+" накоплений "+deposit);
            }

        }
        private static void task3(){
            System.out.println("Задача 3");
            int populationY = 12000000;
            int year=0;
            int birthrate=17;
            int mortality=8;
            while (year!=10){
                populationY=populationY+((birthrate-mortality)*populationY)/1000;
                year++;
                System.out.println("Год "+year+" численность населения составляет-"+populationY);
            }

        }
        private static void task2(){
            System.out.println("Задача 2");
            int i=0;
            while (i!=10){
                i++;
                System.out.print(i+" ");
            }
            System.out.println();
            for(i=10;i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        private static void task1() {

            System.out.println("Задача 1");
            int total = 2459000;
            int deposit = 15000;
            int savings = 0;
            int monthNumber = 0;
            while (savings < total) {
                savings = savings + deposit;
                monthNumber++;
                System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + savings);
            }

        }
    }