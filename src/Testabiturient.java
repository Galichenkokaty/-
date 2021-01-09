public class testAbiturient {
    private static testAbiturient tc;
    private Abiturient[] AbiturientArray = new Abiturient[3];

    public static void  main(String[] args){

        testAbiturient tb = new testAbiturient();

        tb.AbiturientArray[0]  = new Abiturient(
                001,
                "Иванов",
                "Андрей",
                "Артёмович",
                "Спб,ул. Красная",
                89783208150,
                5,
                );
        tb.AbiturientArray[1]  = new Abiturient(
                002,
                "Сидорова",
                "Светлана",
                "Андреевна",
                "Москва,ул.Мира",
                88005553535,
                4,
                );
        tb.AbiturientArray[2]  = new Abiturient(
                003,
                "Таран",
                "Лиля",
                "Васильевна",
                "Зеленоград,ул.Ким",
                89187650923,
                4,
                );

        System.out.println("Имя");
        tb.getAbiturientName("Лиля");

        System.out.println("Город");
        tb.getAbiturientAdress("Зеленоград");

        System.out.println("Оценка не ниже");
        tb.getAbiturientAppraisals(4);

    }


    private void getAbiturientName(String name){
        for (Abiturient Abiturient:abiturientArray) {
            if (Abiturient.getName() == name)
                System.out.println(name);

        }

    }
    private void getAbiturientAdress(String adress){
        for (Abiturient Abiturient:abiturientArray){
            if (Abiturient.getAdress() == adress)
                System.out.println(adress);
        }
    }
    private void getAbiturientAppraisals(int appraisals){
        for (Abiturient Abiturient:abiturientArray){
            if(Abiturient.getAppraisals() >= appraisals)
                System.out.println(appraisals);
        }
    }
}
