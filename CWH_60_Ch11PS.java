
// abstract class Pen {

//     abstract void write();

//     abstract void refill();
// }

// class FountainPen extends Pen {

//     @Override
//     void write() {
//         System.out.println("Write");
//     }

//     @Override
//     void refill() {
//         System.out.println("Refill");
//     }

//     void changeNib() {
//         System.out.println("Changing the nib");
//     }
// }

// interface BasicAnimal {

//     void eat();

//     void sleep();
// }

// class Monkey {

//     void jump() {
//         System.out.println("Jumping...");
//     }

//     void bite() {
//         System.out.println("Biting...");
//     }
// }

// class Human extends Monkey implements BasicAnimal {

//     void speak() {
//         System.out.println("Hello Sir");
//     }

//     @Override
//     public void eat() {
//         System.out.println("Eating...");
//     }

//     @Override
//     public void sleep() {
//         System.out.println("Sleeping...");
//     }

// }

// class TelePhone {

//     void ring() {
//         System.out.println("Ringing...");
//     }

//     void lift() {
//         System.out.println("Lifting the phone...");
//     }

//     void disconnect() {
//         System.out.println("Call Disconnected");
//     }
// }

// class SmartPhone extends TelePhone {

//     @Override
//     void ring() {
//         System.out.println("Smartphone is Ringing...");
//     }

//     void music() {
//         System.out.println("Playing music...");
//     }

//     void videoCall() {
//         System.out.println("Video Calling...");
//     }
// }

// interface TVRemote {

//     void powerOn();
// }

// interface SmartTVRemote extends TVRemote {

//     void playOTT();
// }

// class TV implements TVRemote, SmartTVRemote {

//     @Override
//     public void powerOn() {
//         System.out.println("Powering On TV...");
//     }

//     @Override
//     public void playOTT() {
//         System.out.println("Playing OTT");
//     }

//     public void switchChannel() {
//         System.out.println("Switching Channel...");
//     }
// }

// public class CWH_60_Ch11PS {

//     public static void main(String[] args) {
//         // // Problem 1 & 2
//         // FountainPen pen = new FountainPen();
//         // pen.changeNib();
//         // pen.write();
//         // pen.refill();

//         // // Problem 3
//         // Human human = new Human();
//         // human.eat();
//         // human.sleep();
//         // human.jump();
//         // human.bite();
//         // human.speak();
//         // // Problem 5
//         // Monkey m1 = new Human();
//         // // m1.speak(); -> can not use speak() method because m1 is of type Monkey
//         // m1.jump();
//         // m1.bite();
//         // BasicAnimal lavish = new Human();
//         // // lavish.speak(); -> can not use speak() method because lavish is of type BasicAnimal
//         // lavish.eat();
//         // lavish.sleep();
//         // // Problem 4
//         // TelePhone phone = new SmartPhone();
//         // phone.ring();
//         // phone.lift();
//         // phone.disconnect();
//         // SmartPhone s = new SmartPhone();
//         // s.music();
//         // s.videoCall();
//         // Problem 6 & 7
//         TV tv = new TV();
//         tv.powerOn();
//         tv.playOTT();
//         tv.switchChannel();
//     }
// }
