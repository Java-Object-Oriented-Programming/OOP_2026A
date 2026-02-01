package Week11;

import java.util.Date;

public class Main {


    public static void main(String[] args) {

        Animal d = new Dog();
        Animal d1 = new Dog("Barak");

        System.out.println(d.getName());
        System.out.println(d1.getName());

        Animal[] arr = new Animal[12];
        arr[0] = new Dog(new Date(2022, 11, 1), "Jess");
        arr[1] = new Cat(new Date(1989, 4, 26), "Shalom");
        arr[2] = new Fish();

        Mammal[] mArr = new Mammal[12];
        mArr[0] = (Dog) arr[0];
        mArr[1] = (Cat) arr[1];
        if (arr[1] instanceof Mammal)
            mArr[1] = (Mammal) arr[1];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Mammal)
                mArr[k++] = (Mammal) arr[i];
        }

//        mArr[2]= new Fish();

        System.out.println(sumMammalAge(mArr));
    }

    private static double sumMammalAge(Mammal[] mammals) {

        long timestamp = 0;
        int count=0;
        for (int i = 0; i < mammals.length; i++) {
            if (mammals[i] != null && mammals[i].birthday != null) {
                count++;
                timestamp += mammals[i].birthday.getTime();
            }
        }
        
        System.out.println(timestamp);
        System.out.println(count);
        long avg = timestamp/count;
        System.out.println(avg);
        return avg/3600/24/365;

    }
}
