package lab1;

public class Task3 {
          public static void task3() {
              User[] users = new User[10];
              // Десять обєктів User
              users[0] = new User(1, 20, "Vasyl", "Matushak", 60.0, 180.0);
              users[1] = new User(2, 21, "Volodya", "Pepper", 61.0, 181.0);
              users[2] = new User(3, 22, "Vsevolod", "Kurushko", 62.0, 182.0);
              users[3] = new User(4, 23, "Akakiy", "Malets", 63.0, 183.0);
              users[4] = new User(5, 24, "Andriy", "Salo", 64.0, 184.0);
              users[5] = new User(6, 25, "Tanya", "Budko", 65.0, 185.0);
              users[6] = new User(7, 26, "Anya", "Hemp", 66.0, 186.0);
              users[7] = new User(8, 27, "Yulia","Pyatov", 67.0, 187.0);
              users[8] = new User(9, 28, "Igor", "Kucher", 68.0,188.0);
              users[9] = new User(10, 29, "Dmitry","Sych", 69.0, 189.0);
              
              int totalAge = 0;
              double totalWeight = 0;
              double totalHeight = 0;
               
              for (User user : users) {
                  totalAge += user.age;
                  totalWeight += user.weight;
                  totalHeight += user.height;
              }
              System.out.println("Сума вiку: " + totalAge);
              System.out.println("Сума ваги: " + totalWeight);
              System.out.println("Сума зросту: " + totalHeight);
              
              }
}
              class User {
                int id, age;
                String name, surname;
                double weight, height;
                
                User(int id, int age, String name, String surname, double weight, double height) {
                  this.id = id;
                  this.age = age;
                  this.name = name;
                  this.surname = surname;
                  this.weight = weight;
                  this.height = height;
                }
            
          }  