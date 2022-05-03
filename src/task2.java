public class task2 {
    public static void main(String[] args) {
        int Fr = 1;  // Можо изменять число первой пятницы от 1 до 7
        while (Fr <= 31){
            System.out.println("Сегодня пятница, " + Fr + "-е число. Необходимо подготовить отчет.");
            Fr = Fr + 7;
        }

    }
}
