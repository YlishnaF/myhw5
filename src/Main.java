public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "инженер", "fhydr@dh.com", "+79631761243", 78000, 54 );
        persArray[1] = new Person("Дмитриев Виктор Валерьевич", "директор", "jdrg@dh.com", "+79657788524", 100000, 60 );
        persArray[2] = new Person("Михеева Жанна Петровна", "лаборант", "hyisdrg@ksef.ru", "+76543385611", 30000, 25);
        persArray[3] = new Person("Змеева Галина Михайловна", "уборщица", "hdghrg@ksr.ru", "+79129856512", 15000, 58);
        persArray[4] = new Person("Жданов Михаил Петрович", "охранник", "dsfrg@dgr.ru", "+79345674437", 15000, 45);

        for(Person person: persArray){
            if(person.getAge()>40){
                person.info();
            }

        }

    }

}
