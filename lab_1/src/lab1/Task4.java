package lab1;

public class Task4 {
        public static void task4() {
            Car[] cars = new Car[10];
            //Десять обєктів Car
            cars[0] = new Car(85, 1400, "golf", "gray", "vw" );
            cars[1] = new Car(90, 1600, "focus", "grey", "ford" );
            cars[2] = new Car(100, 1800, "fabia","yellow", "skoda" );
            cars[3] = new Car(105, 2000, "A4",  "black", "audi" );
            cars[4] = new Car(110, 2200, "camry", "brown", "toyota" );
            cars[5] = new Car(115, 2400, "punto", "violet", "fiat" );
            cars[6] = new Car(120, 2600, "308",  "orange", "peugeot" );
            cars[7] = new Car(140, 2800, "picaso","white ", "citroen" );
            cars[8] = new Car(180, 3000, "cx5",  "red", "mazda" );
            cars[9] = new Car(200, 3200, "lanos",  "pink ", "daewoo" );
            
            int totalVolume = 0;
            int totalhorsepower =0;
            for(Car car : cars) {
              totalVolume += car.engineVolume;
               totalhorsepower += car.horsepower;
            }
            System.out.println("Сума обємiв двигунiв: " + totalVolume);
            System.out.println("Сума потужностей двигунiв: " + totalhorsepower);
        }
    } 

    class Car {
        int horsepower, engineVolume;
        String model, color, manufacturer;
        Car(int horsepower, int engineVolume, String model, String color,  String manufacturer ) {
            this.horsepower = horsepower;
            this.engineVolume = engineVolume; 
            this.model = model;
            this.color = color;
            this.manufacturer = manufacturer;
        }
    }

