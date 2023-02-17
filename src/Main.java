public class Main {
    public static void main(String[] args) {

        Java java1 =new Java("Aizat Duisheeva", 19, 'W', "duisheevvva@gmail.com");
        Java java2 =new Java("Temirlan Juzukulov", 20, 'M', "juzukulov@gmail.com");
        Java java3 =new Java("Sanzhar Abdymomunov", 20, 'M', "abdymomunov@gmail.com");
        Java java4 =new Java("Oksana Saidilkanova", 20, 'W', "saidilkanova@gmail.com");
        Java java5 =new Java("Ernazar Asanbekov", 20, 'M', "asanbekov@gmail.com");

        Java [] javas={java1,java2,java3,java4,java5};

        Java java6 = new Java("Kairat Nuridinov", 18, 'M', "nurudinov@gmail.com");
        Java java7 = new Java("Eldan Turgunbaev", 17, 'M', "turgunbaev@gmail.com");
        Java [] javas1={java6,java7};

        Android android1 = new Android("Kanykei Akjoltoi kyzy", 16, 'W', "kanykei@gmail.com");
        Android android2 = new Android("Madina Khalikova", 16, 'W', "khalikova@gmail.com");
        Android android3 = new Android("Davran Djoldoshbekov", 17, 'M', "djoldoshbekov@gmail.com");

        Android [] androids={android1,android2,android3};

        Android android4 = new Android("Gulmira Osmonova", 23, 'W', "osmonova@gmail.com");

        Android [] androids1= {android4};

        Go go1 = new Go("Aikejan Axmatova", 30, 'W', "axmatova@gmail.com");
        Go go2 = new Go("Keldibek Omurzakov", 19, 'M', "omurzakov@gmail.com");

        Go [] gos={go1,go2};

        Go go3 = new Go("Erbol Ashirali uulu", 18, 'M', "erbol@gmail.com");

        Go [] gos1={go3};

        Company company = new Company("Panfilova 153",javas,androids,gos,"Eltrade");

        Company company1 =new Company("Grajdanskaya 119",javas1,androids1,gos1,"Peaksoft");
        System.out.println(company);
        System.out.println("\n\n" + company1);

    }
}