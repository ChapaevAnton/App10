// TODO: Класс - плиты(печки) - которая разоревает еду, соответствующим способом
//  гамбургер будет разогреваться как положено...
class Oven {


    static void reheatFood(Food food, int timeSecond) throws OvenException, ArithmeticException,NullPointerException {
        System.out.println("Разогрев начат...тик так тик так");
        // TODO: обработайте исключение
        if(food==null) throw new NullPointerException();
        if (timeSecond > 150) throw new ArithmeticException();
        food.reheat(timeSecond);
        System.out.println("Трям трям - еда разогрета: " + food.isHot());
        System.out.println("Температура еды: " + food.getTemperature());
    }


}
