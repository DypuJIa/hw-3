public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 3!");
        System.out.println("Задача №1");
        byte a = 127;
        short b = 128;
        int c = 32768;
        long d = 2147483648L;
        float r = 3.1F;
        double s = 3.123456789101112;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(r);
        System.out.println(s + "\n");
        System.out.println("Задача №2");
        double f = 27.12;
        System.out.println(f);
        long age = 987678965549L;
        System.out.println(age);
        double ssA = 2.786;
        System.out.println(ssA);
        int ssB = 569;
        System.out.println(ssB);
        short ssC = -159;
        System.out.println(ssC);
        short ssD = 27897;
        System.out.println(ssD);
        byte ssE = 67;
        System.out.println(ssE + "\n");
        System.out.println("Задача №3 ");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        System.out.println("У Людмилы Павловны - " + lP + " ученика");
        System.out.println("у Анны Сергеевны - " + aS + " учеников");
        System.out.println("у Екатерины Андреевны - " + eA + " учеников");
        int paper = 480;
        System.out.println("всего " + paper + " листов бумаги");
        int allStudents = lP + aS + eA;
        System.out.println("всего " + allStudents + " учеников");
        int sheetsForEachStudent = paper / allStudents;
        System.out.println("на каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги" + "\n");
        System.out.println("Задача №4");
        byte efficiencyPerMinute = 16 / 2;
        System.out.println(efficiencyPerMinute + " бутылок в минуту");
        byte efficiency = 8;
        System.out.println(efficiency);
        int efficiency1 = efficiency * 20;
        System.out.println("за 20 минут машина произведет " + efficiency1 + " бутылок");
        int day = 1440;
        System.out.println(day + " минут в одних сутках");
        int efficiency2 = efficiency * day;
        System.out.println("за сутки машина произведет " + efficiency2 + " бутылок");
        int threeDays = efficiency2 * 3;
        System.out.println("за 3 дня машина произведет " + threeDays + " бутылок");
        int month = 30;
        System.out.println("в среднем в одном месяце " + month + " дней");
        int efficiency3 = efficiency2 * month;
        System.out.println("за месяц машина произведет " + efficiency3 + " бутылок" + "\n");
        System.out.println("Задача №5");
        int totalCans = 120;
        int oneClassCansWhite = 2;
        int oneClassCansbrowns = 4;
        System.out.println("на один класс уходит " + oneClassCansWhite + " банки белой краски и " + oneClassCansbrowns + " банки коричневой краски");
        int oneClass = oneClassCansWhite + oneClassCansbrowns;
        int classesAtSchool = totalCans / oneClass;
        System.out.println("в школе " + classesAtSchool + " классов");
        int cansWhite = classesAtSchool * oneClassCansWhite;
        int cansbrown = classesAtSchool * oneClassCansbrowns;
        System.out.println("для одного класса нужно " + cansWhite + " банок белой краски");
        System.out.println("для одного класса нужно " + cansbrown + " банок коричневой краски");
        System.out.println("В школе где " + classesAtSchool + " классов, нужно " + cansWhite + " банок белой краски и " + cansbrown + " банок коричневой краски" + "\n");
        System.out.println("Задача №6");
        byte bananas = 5;
        int milk = 200;
        System.out.println(milk);
        byte iceCream = 2;
        System.out.println(iceCream);
        byte eggs = 4;
        byte oneBananasWeight = 80;
        byte milkWeight = 105;
        byte oneIceCreamWeight = 100;
        byte oneEggsWeight = 70;
        System.out.println("вес одного банана = " + oneBananasWeight + " грамм");
        System.out.println("100 мл молока = " + milkWeight + " граммам");
        System.out.println("1 брикет мороженого = " + oneIceCreamWeight + " граммам");
        System.out.println("вес 1 яйца = " + oneEggsWeight + " грамм");
        int weightOfProducts = (oneBananasWeight * bananas) + (milkWeight * 2) + (oneIceCreamWeight * 2) + (oneEggsWeight * eggs);
        System.out.println("общий вес завтрака составляет " + weightOfProducts + " грамм");
        short oneKilogram = 1000;
        System.out.println("в одном килограмме " + oneKilogram + " грамм");
        double weightProductsKg;
        weightProductsKg = 1.09;
        System.out.println("общий вес завтрака составляет " + weightProductsKg + " кг" + "\n");
        System.out.println("Задача №7");
        short excessWeight = 7000;
        System.out.println("лишний вес спортсмена " + excessWeight + " грамм");
        short weight1 = 250;
        short weight2 = 500;
        System.out.println("если терять в день " + weight1 + " грамм");
        int dietDays1 = excessWeight / weight1;
        System.out.println(dietDays1 + " дней уйдет на похудение,если терять каждый день по " + weight1 + " грамм");
        int dietDays2 = excessWeight / weight2;
        System.out.println(dietDays2 + " дней уйдет на похудение,если терять каждый день по " + weight2 + " грамм");
        int averageDays = (dietDays1 + dietDays2) / 2;
        System.out.println("в среднем понадобится " + averageDays + " день для похудения" + "\n");
        System.out.println("Задача №8");
        int maria = 67760;
        int denis = 83690;
        int kristina = 76230;
        System.out.println("на данный момент Мария получает " + maria + " рублей");
        System.out.println("на данный момент Денис получает " + denis + " рублей");
        System.out.println("на данный момент Кристина получает " + kristina + " рублей");
        int mariaPrize = maria * 10 / 100;
        int denisPrize = denis * 10 / 100;
        int kristinaPrize = kristina * 10 / 100;
        System.out.println("премия составляет " + mariaPrize + " рублей");
        System.out.println("премия составляет " + denisPrize + " рублей");
        System.out.println("премия составляет " + kristinaPrize + " рублей");
        int newSalaryMaria = maria + mariaPrize;
        int newSalaryDenis = denis + denisPrize;
        int newSalaryKristina = kristina + kristinaPrize;
        System.out.println(newSalaryMaria + " рублей, столько Мария будет получать после увеличения з/п");
        System.out.println(newSalaryDenis + " рублей, столько Денис будет получать после увеличения з/п");
        System.out.println(newSalaryKristina + " рублей, столько Кристина будет получать после увеличения з/п");
        byte years = 12;
        System.out.println("в году " + " месяцев");
        int salaryYearMaria = maria * years;
        int salaryYearDenis = denis * years;
        int salaryYearKristina = kristina * years;
        System.out.println("зарплата Марии в год до получения премии составляет " + salaryYearMaria + " рублей");
        System.out.println("зарплата Дениса в год до получения премии составляет " + salaryYearDenis + " рублей");
        System.out.println("зарплата Кристины в год до получения премии составляет " + salaryYearKristina + " рублей");
        int salaryAfterMaria = newSalaryMaria * years;
        int salaryAfterDenis = newSalaryDenis * years;
        int salaryAfterKristina = newSalaryKristina * years;
        System.out.println("зарплата Марии в год после получения премии составляет " + salaryAfterMaria + " рублей");
        System.out.println("зарплата Дениса в год после получения премии составляет " + salaryAfterDenis + " рублей");
        System.out.println("зарплата Дениса в год после получения премии составляет " + salaryAfterKristina + " рублей");
        int salaryDifferenceYearMaria = salaryAfterMaria - salaryYearMaria;
        int salaryDifferenceYearDenis = salaryAfterDenis - salaryYearDenis;
        int salaryDifferenceYearKristina = salaryAfterKristina - salaryYearKristina;
        System.out.println("Мария теперь получает " + newSalaryMaria + " рублей в месяц, годовой доход вырос на " + salaryDifferenceYearMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей в месяц, годовой доход вырос на " + salaryDifferenceYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей в месяц, годовой доход вырос на " + salaryDifferenceYearKristina + " рублей");
    }
}