package _15_10_18.Assignment_3;

abstract class Wine implements Drink {

    @Override
    public void taste() {
        System.out.println("Вкусно");
    }

    public String getHolidayName() {
        return "День рождения";
    }
}
