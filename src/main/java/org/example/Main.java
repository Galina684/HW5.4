package org.example;

public class Main {
//    Напишите код, с помощью которого можно разделить строку на части.
//
//    Код должен работать для строк любого размера и любого содержания.
//    Размер частей вы устанавливаете самостоятельно.

   public static void splitString (String str){
       String[] parts = str.split("\\s");
       for (int i = 0; i < parts.length; i++) {
           System.out.println(parts[i]);
       }
   }

    public static void main(String[] args) {

String test = "Код должен работать для строк любого размера и любого содержания.";
splitString(test);

    }
}