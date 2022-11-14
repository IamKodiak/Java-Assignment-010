import java.util.Scanner;
public class Dog {
    Scanner sc = new Scanner(System.in);
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;

    public Dog(String b, String s, String c, int a) {
        breed = b;
        size = s;
        color = c;
        age = a;
        name = "No name dog :(";
    }

    public void eat() {
        System.out.printf("You tossed %s a steak and they gobbled it right up!%n",name);
    }

    public void run() {
        System.out.printf("You chucked a big stick 50 feet away. %s retrieved it and brought it back to you. Good boy! :)%n",name);
    }

    public void sleep() {
        System.out.printf("Go to bed %s! No barking!%n",name);
    }

    public void name() {
        System.out.printf("What would you like to name your dog?%n");
        name = sc.nextLine();
    }

    public void call() {
        System.out.printf("Here %s! Good boy!%n",name);
    }

    public void check() {
        System.out.printf("%s is of breed %s, size is %s, color is %s and is %s years old.%n",name,breed,size,color,age);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char action = 0;
        Dog dog1 = new Dog("Bulldog","large","light gray",5);
        Dog dog2 = new Dog("Beagle","large","orange",6);
        Dog dog3 = new Dog("German Shepard","large","white & orange",6);

        System.out.printf("%nOne day you are walking along the beach when you come across three dogs!%n%nActions:%n1) fe" +
                "ed a dog%n2) play fetch%n3) go to bed >:(%n4) name a dog%n5) call a dog%n6) check dog%nq) run away and never see the dogs again%n%n");
        while(action != 'q') {
            System.out.printf("What would you like to do?%n");
            action = scan.next().charAt(0);
            int act2 = 0;
            switch (action) {
                case '1':
                    System.out.println("Which dog would you like to feed?(1-3)");
                    act2 = scan.nextInt();
                    switch (act2) {
                        case 1:
                            dog1.eat();
                            break;
                        case 2:
                            dog2.eat();
                            break;
                        case 3:
                            dog3.eat();
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Which dog would you like to play with?(1-3)");
                    act2 = scan.nextInt();
                    switch (act2) {
                        case 1:
                            dog1.run();
                            break;
                        case 2:
                            dog2.run();
                            break;
                        case 3:
                            dog3.run();
                            break;
                    }
                    break;
                case '3':
                    System.out.println("Which dog would you like to go to bed?(1-3)");
                    act2 = scan.nextInt();
                    switch (act2) {
                        case 1:
                            dog1.sleep();
                            break;
                        case 2:
                            dog2.sleep();
                            break;
                        case 3:
                            dog3.sleep();
                            break;
                    }
                    break;
                case '4':
                    System.out.println("Which dog would you like to name?(1-3)");
                    act2 = scan.nextInt();
                    switch (act2) {
                        case 1:
                            dog1.name();
                            break;
                        case 2:
                            dog2.name();
                            break;
                        case 3:
                            dog3.name();
                            break;
                    }
                    break;
                case '5':
                    System.out.println("Which dog would you like to call?(1-3)");
                    act2 = scan.nextInt();
                    switch (act2) {
                        case 1:
                            dog1.call();
                            break;
                        case 2:
                            dog2.call();
                            break;
                        case 3:
                            dog3.call();
                            break;
                    }
                case '6':
                    System.out.println("Which dog would you like to check?(1-3)");
                    act2 = scan.nextInt();
                    switch (act2) {
                        case 1:
                            dog1.check();
                            break;
                        case 2:
                            dog2.check();
                            break;
                        case 3:
                            dog3.check();
                            break;
                    }
            }
        }
    }
}
