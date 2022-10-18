public class main {
    public static void main(String[] args) {


        System.out.println("Перечень имеющихся слов с указанием сколько раз они встречаются:");
        System.out.println(new Arrays().Hm());
        System.out.println();


        Contacts contacts = new Contacts();
        contacts.add("Иванов", "8(800)200-23-16");
        contacts.add("Петров", "8(495)692-62-66");
        contacts.add("Сидоров", "8(495)987-91-01");

        System.out.println("Телефонные номера:");
        System.out.println(contacts.get("Иванов"));
        System.out.println(contacts.get("Сидоров"));
    }
}
